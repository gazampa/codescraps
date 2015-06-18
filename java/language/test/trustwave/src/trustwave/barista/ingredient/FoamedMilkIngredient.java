package trustwave.barista.ingredient;
import java.math.BigDecimal;
public class FoamedMilkIngredient implements Ingredient{

	private final String name="milk";
	private BigDecimal cost = new BigDecimal("0.00");

	public FoamedMilkIngredient(){}
	public FoamedMilkIngredient(BigDecimal param){cost=param;}


	public String getName(){
		return name;
	}

	public BigDecimal getCost(){
		return cost;
	}

	public void setCost(BigDecimal param){
		cost=param;
	}

	public boolean equals(Object obj){
		return obj instanceof FoamedMilkIngredient && ((FoamedMilkIngredient)obj).getName().equalsIgnoreCase(name);
	}
	
	public int hashCode(){
		int result = 31;
		try {
			int abc = Integer.valueOf(this.name);
			result = result*abc;
		}catch (NumberFormatException nfe){
			System.out.println("Exception thrown : " + nfe);
		}
		return result;
	}
	
	public String toString(){
		String result = new String();
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" : ");
		sb.append(cost);
		
		result = sb.toString();
		
		return result;
	}

	public int compareTo(Ingredient ingredient) {
		return this.getName().compareTo(ingredient.getName());
	}
	
}