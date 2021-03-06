/**
 * Concurforce__CT_Trip_Segment__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Concurforce__CT_Trip_Segment__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String concurforce__ConfirmationNumber__c;

    private java.util.Calendar concurforce__EndDate__c;

    private java.lang.String concurforce__EndLocation__c;

    private java.util.Calendar concurforce__StartDate__c;

    private java.lang.String concurforce__StartLocation__c;

    private java.lang.String concurforce__Trip__c;

    private com.sforce.soap.enterprise.sobject.Concurforce__CT_Trip__c concurforce__Trip__r;

    private java.lang.String concurforce__Type__c;

    private java.lang.String concurforce__Vendor__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.util.Calendar systemModstamp;

    public Concurforce__CT_Trip_Segment__c() {
    }

    public Concurforce__CT_Trip_Segment__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String concurforce__ConfirmationNumber__c,
           java.util.Calendar concurforce__EndDate__c,
           java.lang.String concurforce__EndLocation__c,
           java.util.Calendar concurforce__StartDate__c,
           java.lang.String concurforce__StartLocation__c,
           java.lang.String concurforce__Trip__c,
           com.sforce.soap.enterprise.sobject.Concurforce__CT_Trip__c concurforce__Trip__r,
           java.lang.String concurforce__Type__c,
           java.lang.String concurforce__Vendor__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.attachments = attachments;
        this.concurforce__ConfirmationNumber__c = concurforce__ConfirmationNumber__c;
        this.concurforce__EndDate__c = concurforce__EndDate__c;
        this.concurforce__EndLocation__c = concurforce__EndLocation__c;
        this.concurforce__StartDate__c = concurforce__StartDate__c;
        this.concurforce__StartLocation__c = concurforce__StartLocation__c;
        this.concurforce__Trip__c = concurforce__Trip__c;
        this.concurforce__Trip__r = concurforce__Trip__r;
        this.concurforce__Type__c = concurforce__Type__c;
        this.concurforce__Vendor__c = concurforce__Vendor__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the attachments value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the concurforce__ConfirmationNumber__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__ConfirmationNumber__c
     */
    public java.lang.String getConcurforce__ConfirmationNumber__c() {
        return concurforce__ConfirmationNumber__c;
    }


    /**
     * Sets the concurforce__ConfirmationNumber__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__ConfirmationNumber__c
     */
    public void setConcurforce__ConfirmationNumber__c(java.lang.String concurforce__ConfirmationNumber__c) {
        this.concurforce__ConfirmationNumber__c = concurforce__ConfirmationNumber__c;
    }


    /**
     * Gets the concurforce__EndDate__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__EndDate__c
     */
    public java.util.Calendar getConcurforce__EndDate__c() {
        return concurforce__EndDate__c;
    }


    /**
     * Sets the concurforce__EndDate__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__EndDate__c
     */
    public void setConcurforce__EndDate__c(java.util.Calendar concurforce__EndDate__c) {
        this.concurforce__EndDate__c = concurforce__EndDate__c;
    }


    /**
     * Gets the concurforce__EndLocation__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__EndLocation__c
     */
    public java.lang.String getConcurforce__EndLocation__c() {
        return concurforce__EndLocation__c;
    }


    /**
     * Sets the concurforce__EndLocation__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__EndLocation__c
     */
    public void setConcurforce__EndLocation__c(java.lang.String concurforce__EndLocation__c) {
        this.concurforce__EndLocation__c = concurforce__EndLocation__c;
    }


    /**
     * Gets the concurforce__StartDate__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__StartDate__c
     */
    public java.util.Calendar getConcurforce__StartDate__c() {
        return concurforce__StartDate__c;
    }


    /**
     * Sets the concurforce__StartDate__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__StartDate__c
     */
    public void setConcurforce__StartDate__c(java.util.Calendar concurforce__StartDate__c) {
        this.concurforce__StartDate__c = concurforce__StartDate__c;
    }


    /**
     * Gets the concurforce__StartLocation__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__StartLocation__c
     */
    public java.lang.String getConcurforce__StartLocation__c() {
        return concurforce__StartLocation__c;
    }


    /**
     * Sets the concurforce__StartLocation__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__StartLocation__c
     */
    public void setConcurforce__StartLocation__c(java.lang.String concurforce__StartLocation__c) {
        this.concurforce__StartLocation__c = concurforce__StartLocation__c;
    }


    /**
     * Gets the concurforce__Trip__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__Trip__c
     */
    public java.lang.String getConcurforce__Trip__c() {
        return concurforce__Trip__c;
    }


    /**
     * Sets the concurforce__Trip__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__Trip__c
     */
    public void setConcurforce__Trip__c(java.lang.String concurforce__Trip__c) {
        this.concurforce__Trip__c = concurforce__Trip__c;
    }


    /**
     * Gets the concurforce__Trip__r value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__Trip__r
     */
    public com.sforce.soap.enterprise.sobject.Concurforce__CT_Trip__c getConcurforce__Trip__r() {
        return concurforce__Trip__r;
    }


    /**
     * Sets the concurforce__Trip__r value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__Trip__r
     */
    public void setConcurforce__Trip__r(com.sforce.soap.enterprise.sobject.Concurforce__CT_Trip__c concurforce__Trip__r) {
        this.concurforce__Trip__r = concurforce__Trip__r;
    }


    /**
     * Gets the concurforce__Type__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__Type__c
     */
    public java.lang.String getConcurforce__Type__c() {
        return concurforce__Type__c;
    }


    /**
     * Sets the concurforce__Type__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__Type__c
     */
    public void setConcurforce__Type__c(java.lang.String concurforce__Type__c) {
        this.concurforce__Type__c = concurforce__Type__c;
    }


    /**
     * Gets the concurforce__Vendor__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return concurforce__Vendor__c
     */
    public java.lang.String getConcurforce__Vendor__c() {
        return concurforce__Vendor__c;
    }


    /**
     * Sets the concurforce__Vendor__c value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param concurforce__Vendor__c
     */
    public void setConcurforce__Vendor__c(java.lang.String concurforce__Vendor__c) {
        this.concurforce__Vendor__c = concurforce__Vendor__c;
    }


    /**
     * Gets the createdBy value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the processInstances value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the systemModstamp value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Concurforce__CT_Trip_Segment__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Concurforce__CT_Trip_Segment__c)) return false;
        Concurforce__CT_Trip_Segment__c other = (Concurforce__CT_Trip_Segment__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.concurforce__ConfirmationNumber__c==null && other.getConcurforce__ConfirmationNumber__c()==null) || 
             (this.concurforce__ConfirmationNumber__c!=null &&
              this.concurforce__ConfirmationNumber__c.equals(other.getConcurforce__ConfirmationNumber__c()))) &&
            ((this.concurforce__EndDate__c==null && other.getConcurforce__EndDate__c()==null) || 
             (this.concurforce__EndDate__c!=null &&
              this.concurforce__EndDate__c.equals(other.getConcurforce__EndDate__c()))) &&
            ((this.concurforce__EndLocation__c==null && other.getConcurforce__EndLocation__c()==null) || 
             (this.concurforce__EndLocation__c!=null &&
              this.concurforce__EndLocation__c.equals(other.getConcurforce__EndLocation__c()))) &&
            ((this.concurforce__StartDate__c==null && other.getConcurforce__StartDate__c()==null) || 
             (this.concurforce__StartDate__c!=null &&
              this.concurforce__StartDate__c.equals(other.getConcurforce__StartDate__c()))) &&
            ((this.concurforce__StartLocation__c==null && other.getConcurforce__StartLocation__c()==null) || 
             (this.concurforce__StartLocation__c!=null &&
              this.concurforce__StartLocation__c.equals(other.getConcurforce__StartLocation__c()))) &&
            ((this.concurforce__Trip__c==null && other.getConcurforce__Trip__c()==null) || 
             (this.concurforce__Trip__c!=null &&
              this.concurforce__Trip__c.equals(other.getConcurforce__Trip__c()))) &&
            ((this.concurforce__Trip__r==null && other.getConcurforce__Trip__r()==null) || 
             (this.concurforce__Trip__r!=null &&
              this.concurforce__Trip__r.equals(other.getConcurforce__Trip__r()))) &&
            ((this.concurforce__Type__c==null && other.getConcurforce__Type__c()==null) || 
             (this.concurforce__Type__c!=null &&
              this.concurforce__Type__c.equals(other.getConcurforce__Type__c()))) &&
            ((this.concurforce__Vendor__c==null && other.getConcurforce__Vendor__c()==null) || 
             (this.concurforce__Vendor__c!=null &&
              this.concurforce__Vendor__c.equals(other.getConcurforce__Vendor__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getConcurforce__ConfirmationNumber__c() != null) {
            _hashCode += getConcurforce__ConfirmationNumber__c().hashCode();
        }
        if (getConcurforce__EndDate__c() != null) {
            _hashCode += getConcurforce__EndDate__c().hashCode();
        }
        if (getConcurforce__EndLocation__c() != null) {
            _hashCode += getConcurforce__EndLocation__c().hashCode();
        }
        if (getConcurforce__StartDate__c() != null) {
            _hashCode += getConcurforce__StartDate__c().hashCode();
        }
        if (getConcurforce__StartLocation__c() != null) {
            _hashCode += getConcurforce__StartLocation__c().hashCode();
        }
        if (getConcurforce__Trip__c() != null) {
            _hashCode += getConcurforce__Trip__c().hashCode();
        }
        if (getConcurforce__Trip__r() != null) {
            _hashCode += getConcurforce__Trip__r().hashCode();
        }
        if (getConcurforce__Type__c() != null) {
            _hashCode += getConcurforce__Type__c().hashCode();
        }
        if (getConcurforce__Vendor__c() != null) {
            _hashCode += getConcurforce__Vendor__c().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Concurforce__CT_Trip_Segment__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_Trip_Segment__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__ConfirmationNumber__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__ConfirmationNumber__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__EndDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__EndDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__EndLocation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__EndLocation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__StartDate__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__StartDate__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__StartLocation__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__StartLocation__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__Trip__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Trip__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__Trip__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Trip__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__CT_Trip__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__Type__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Type__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurforce__Vendor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concurforce__Vendor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesAndAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
