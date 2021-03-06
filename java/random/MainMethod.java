import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.util.*;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.NameValuePair;

class MainMethod{

		public static void main(String args[]){

			/**  Figure out the environment **/
			String environment="https://cs13.salesforce.com/services/data" /*apexrest/Account/001W0000004ZXKQ*/, code="", grant_type="authorization_code", clientSecret = "1711390793153965553", redirectUri = "https://test.salesforce.com/services/oauth2/authorize/success" , clientId = "3MVG982oBBDdwyHg.khs.6lurHpDgw2blVBLYKqwrvWRf8VHBgu3JlG9bMpt9CaALyL1CpcJXa.1MDt5_lFF2";
			String authenvironment = "https://cs13.salesforce.com/services/oauth2/authorize";
			String soapService = "https://cs13-api.salesforce.com/services/Soap/class/OnlineDeveloperSOAP";
			InputStream instream = System.in;
			URIBuilder builder = new URIBuilder();
			builder.setScheme("https").setHost("cs13-api.salesforce.com").setPath("/services/Soap/u/22.0/");

			/**  Build  a Client - decide on method **/
			HttpClient httpclient = new DefaultHttpClient();
			try {
				URI uri = builder.build();
				System.out.println("\n built uri " + uri);
				HttpPost loginrequest = new HttpPost(uri);
				loginrequest.setHeader("Content-Type", "text/xml");
				loginrequest.setHeader("SOAPAction", "''");
		        System.out.println(soapXmlStrForLogin(USER_NAME,PASSWORD).toString());
//				StringEntity requestEntity = new StringEntity(soapXmlStrForLogin(USER_NAME,PASSWORD), "text/xml", "UTF-8");
				ByteArrayEntity requestEntity = new ByteArrayEntity(soapXmlForLogin(USER_NAME,PASSWORD), ContentType.TEXT_XML);
		        loginrequest.setEntity(requestEntity);
				System.out.println("Sending Login Request " + loginrequest.getRequestLine());
				HttpResponse response = httpclient.execute(loginrequest);
				System.out.println(response.getStatusLine().toString());
			/**  Get the Response and figure out what to do  **/
				HttpEntity entity = response.getEntity();
				SAXParserFactory spf = SAXParserFactory.newInstance();
				spf.setNamespaceAware(true);
				SAXParser saxParser = spf.newSAXParser();

				LoginResponseParser parser = new LoginResponseParser();
				saxParser.parse(entity.getContent( ), parser);

				if (parser.sessionId == null || parser.serverUrl == null) {
					System.out.println("Login Failed!\n" + response);
				}

				URL soapEndpoint = new URL(parser.serverUrl);
				StringBuilder endpoint = new StringBuilder()
					.append(soapEndpoint.getProtocol())
					.append("://")
					.append(soapEndpoint.getHost());

				if (soapEndpoint.getPort() > 0) endpoint.append(":")
					.append(soapEndpoint.getPort());
				System.out.println(parser.sessionId + " : " +  endpoint.toString());

				System.out.println(parser.serverUrl);

				if ( parser.sessionId!=null ){
						System.out.println("Sending a Service Request");
						System.out.println(soapXmlStrForMethodRequest(parser.sessionId));
						HttpPost servicerequest = new HttpPost(parser.serverUrl);
						servicerequest.setHeader("Content-Type", "text/xml");
						servicerequest.setHeader("SOAPAction", "''");
						ByteArrayEntity methodEntity = new ByteArrayEntity(soapXmlForMethodRequest(parser.sessionId), ContentType.TEXT_XML);
						servicerequest.setEntity(methodEntity);
						System.out.println("Request Line " + servicerequest.getRequestLine());
						HttpResponse messresponse = httpclient.execute(servicerequest);
						HttpEntity srent = messresponse.getEntity();
						if (srent != null) {
											instream = srent.getContent();
											System.out.println(srent.getContentType());
											System.out.println(srent.getContentLength());
											srent.writeTo( System.out );//.println();// do something useful
						}
			}

//				HttpEntity entity = response.getEntity();
//				if (entity != null) {
//					instream = entity.getContent();
//					System.out.println(entity.getContentType());
//					System.out.println(entity.getContentLength());
//					entity.writeTo( System.out );//.println();// do something useful
//				}
			}catch( Exception e ){
				System.out.println("General Exception :" + e);
			} finally {
				if ( instream!=null )try {instream.close();} catch(Exception e){;}
			  httpclient.getConnectionManager().shutdown();
			}

			//System.out.println(result);
			System.out.println("\nThe Main Method has left the building");

		}

    static final String LOGIN_ENDPOINT = "https://test.salesforce.com";
    private static final String USER_NAME = "usagedata@kcura.com.uat";//"bmurphy@kcura.com.bmurphy";
    private static final String PASSWORD = "test1ngserv1cesqcCcQJVsURwQaj4uaPdYFRy6";//"blonk*";

    private static final String SERVICES_SOAP_PARTNER_ENDPOINT = "/services/Soap/u/22.0/";

    private static final String ENV_START =
            "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' "
                    + "xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' " +
                    "xmlns:urn='urn:partner.soap.sforce.com'><soapenv:Body>";

    private static final String ENV_END = "</soapenv:Body></soapenv:Envelope>";

    private static byte[] soapXmlForLogin(String username, String password)
        throws UnsupportedEncodingException {
        return (ENV_START +
                "  <urn:login>" +
                "    <urn:username>" + username + "</urn:username>" +
                "    <urn:password>" + password + "</urn:password>" +
                "  </urn:login>" +
                ENV_END).getBytes("UTF-8");
    }

    private static String soapXmlStrForLogin(String username, String password)
        throws UnsupportedEncodingException {
        return (ENV_START +
                "  <urn:login>" +
                "    <urn:username>" + username + "</urn:username>" +
                "    <urn:password>" + password + "</urn:password>" +
                "  </urn:login>" +
                ENV_END);
    }

    private static byte[] soapXmlForMethodRequest(String sessionId)
        throws UnsupportedEncodingException {
        return (
								"<?xml version='1.0' encoding='utf-8'?> "+
								        					"<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' " +
								                			     "xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' " +
								                				    "xmlns:urn='urn:partner.soap.sforce.com'>" +
																	  "<soapenv:Header>" +
																			 "<urn:SessionHeader>" +
																				"<urn:sessionId>" + "asdfasdfasdfasdf" + sessionId + "asdfasdfasdfasdf"+ "</urn:sessionId>" +
																			 "</urn:SessionHeader>" +
																	   "</soapenv:Header>" +
																		  "<soapenv:Body>" +
																			 "<urn:query>" +
																				"<urn:queryString>SELECT Id, Name FROM Account WHERE Name LIKE 'a%'</urn:queryString>"+
																			 "</urn:query>"+
																		  "</soapenv:Body>"+
										"</soapenv:Envelope>"
                ).getBytes("UTF-8");
    }

    private static String soapXmlStrForMethodRequest(String sessionId){

        return             "<?xml version='1.0' encoding='utf-8'?> "+
        					"<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' " +
                			     "xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' " +
                				    "xmlns:urn='urn:partner.soap.sforce.com'>" +
									  "<soapenv:Header>" +
											 "<urn:SessionHeader>" +
												"<urn:sessionId>" + sessionId + "</urn:sessionId>" +
											 "</urn:SessionHeader>" +
									   "</soapenv:Header>" +
										  "<soapenv:Body>" +
											 "<urn:query>" +
												"<urn:queryString>SELECT Id, Name FROM Account WHERE Name LIKE 'a%'</urn:queryString>"+
											 "</urn:query>"+
										  "</soapenv:Body>"+
										"</soapenv:Envelope>" ;
    }

    private static class LoginResponseParser extends DefaultHandler {

        private boolean inSessionId;
        private String sessionId;

        private boolean inServerUrl;
        private String serverUrl;

        @Override
        public void characters(char[] ch, int start, int length) {
            if (inSessionId) sessionId = new String(ch, start, length);
            if (inServerUrl) serverUrl = new String(ch, start, length);
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if (localName != null) {
                if (localName.equals("sessionId")) {
                    inSessionId = false;
                }

                if (localName.equals("serverUrl")) {
                    inServerUrl = false;
                }
            }
        }

        @Override
        public void startElement(String uri, String localName,
            String qName, Attributes attributes) {
            if (localName != null) {
                if (localName.equals("sessionId")) {
                    inSessionId = true;
                }

                if (localName.equals("serverUrl")) {
                    inServerUrl = true;
                }
            }
        }
    }


}

/*				String data = "<?xml version=\"1.0\" encoding=\"utf-8\"?> " +
				"<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:urn='urn:partner.soap.sforce.com'>" +
					 "<soapenv:Body>     " +
					 	"<postPartnerData xmlns=\"https://cs13-api.salesforce.com/\">       " +
					 		"<parameters>INFY</parameters>     " +
					 	"</postPartnerData>   " +
					 "</soapenv:Body>>" +
				"</soapenv:Envelope>";
				data = data.trim();
*/
//http://www.soapclient.com/soaptest.html

//			builder.setParameter("response_type", "token");
//			builder.setParameter("client_id", clientId);
//			builder.setParameter("grant_type", grant_type);
//			builder.setParameter("redirect_uri", redirectUri);
			//builder.setParameter("state", "TheStateOfIt");

				//HttpPost httpmethod = new HttpPost(authenvironment);
//				List <NameValuePair> nvps = new ArrayList <NameValuePair>();
//				nvps.add(new BasicNameValuePair("response_type","token"));
//				nvps.add(new BasicNameValuePair("client_id",clientId));
//				System.out.println(redirectUri);
//				nvps.add(new BasicNameValuePair("redirect_uri",redirectUri));
//				nvps.add(new BasicNameValuePair("client_secret",clientSecret));
				//nvps.add(new BasicNameValuePair("code", code));
//				nvps.add(new BasicNameValuePair("grant_type","authorization_code"));
				   /** For session ID instead of OAuth 2.0, use "grant_type", "password" **/
//	            httpmethod.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));


/*
	ResponseHandler<String> responseHandler = new BasicResponseHandler();
	String responseBody = httpclient.execute(httpget, responseHandler);
	System.out.println("----------------------------------------");
	System.out.println(responseBody);
	System.out.println("----------------------------------------");

				httpmethod.setHeader("Accept", "xml");
				httpmethod.setHeader("Content-Type", "xml");


*/



//			String url = "http://www.yahoo.com/";
//			String	result = "HIT THAT !!!" + HTTPRequestPoster.sendGetRequest(url, null);

//			HttpsClient secureClient = new HttpsClient();
//			secureClient.testIt("https://test.salesforce.com/services/oauth2/authorize");//https://www.google.com

/*
    private static byte[] soapXmlForQueryMethodRequest(String sessionId)
        throws UnsupportedEncodingException {
        return (
								"<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' "
                			    + "xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' " +
                				    "xmlns:urn='urn:partner.soap.sforce.com'>" +
									  "<soapenv:Header>" +
											 "<urn:SessionHeader>" +
												"<urn:sessionId>" + sessionId + "</urn:sessionId>" +
											 "</urn:SessionHeader>" +
									   "</soapenv:Header>" +
										  "<soapenv:Body>" +
											 "<urn:query>" +
												"<urn:queryString>SELECT Id, Name, BillingStreet FROM Account WHERE Name LIKE 'a%'</urn:queryString>"+
											 "</urn:query>"+
										  "</soapenv:Body>"+
										"</soapenv:Envelope>"
                ).getBytes("UTF-8");
    }
*/



/*
    For authorization: https://login.salesforce.com/services/oauth2/authorize
    For token requests: https://login.salesforce.com/services/oauth2/token
    For revoking OAuth tokens: https://login.salesforce.com/services/oauth2/revoke
*/
//			Extensible.yowallawalla();
//			System.out.println(Extensible.didint);


//			MyMapReduce my = new MyMapReduce();
//	        my.init();

//			DoWhileBreak here = new DoWhileBreak();
//			here.example();


/*			Set numbers = new TreeSet();

			for ( int i=0;i<1;i++ ){
				Random random = new Random();
				int interval = random.nextInt(10000);
				new StartThread("http://www.yahoo.com/",interval).start();
				numbers.add(interval);
				System.out.println(interval );
			}
*/


/*
	class StartThread extends Thread
	{
		private String url;
		private int interval;
		private String result = new String();
		public StartThread(String param, int inter)
		{
			url = param;
			interval=inter;
		}
		public void run()
		{

			for(int i=0; i < 1 ;i++)
			{

				try{
					this.sleep(interval);
				}catch(Exception e){
					;
				}

				//synchronized(this)
				// {
					result = "HIT THAT !!!" + HTTPRequestPoster.sendGetRequest(url, null);
				// }
					System.out.println(interval + " : " + result + " : " + url);
			}

		}

	}
*/