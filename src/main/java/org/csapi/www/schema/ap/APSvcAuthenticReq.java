/**
 * APSvcAuthenticReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package org.csapi.www.schema.ap;

public class APSvcAuthenticReq  implements java.io.Serializable {
    private java.lang.String APid;

    private java.lang.String apSvcAuthType;

    public APSvcAuthenticReq() {
    }

    public APSvcAuthenticReq(
           java.lang.String APid,
           java.lang.String apSvcAuthType) {
           this.APid = APid;
           this.apSvcAuthType = apSvcAuthType;
    }


    /**
     * Gets the APid value for this APSvcAuthenticReq.
     * 
     * @return APid
     */
    public java.lang.String getAPid() {
        return APid;
    }


    /**
     * Sets the APid value for this APSvcAuthenticReq.
     * 
     * @param APid
     */
    public void setAPid(java.lang.String APid) {
        this.APid = APid;
    }


    /**
     * Gets the apSvcAuthType value for this APSvcAuthenticReq.
     * 
     * @return apSvcAuthType
     */
    public java.lang.String getApSvcAuthType() {
        return apSvcAuthType;
    }


    /**
     * Sets the apSvcAuthType value for this APSvcAuthenticReq.
     * 
     * @param apSvcAuthType
     */
    public void setApSvcAuthType(java.lang.String apSvcAuthType) {
        this.apSvcAuthType = apSvcAuthType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APSvcAuthenticReq)) return false;
        APSvcAuthenticReq other = (APSvcAuthenticReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.APid==null && other.getAPid()==null) || 
             (this.APid!=null &&
              this.APid.equals(other.getAPid()))) &&
            ((this.apSvcAuthType==null && other.getApSvcAuthType()==null) || 
             (this.apSvcAuthType!=null &&
              this.apSvcAuthType.equals(other.getApSvcAuthType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAPid() != null) {
            _hashCode += getAPid().hashCode();
        }
        if (getApSvcAuthType() != null) {
            _hashCode += getApSvcAuthType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APSvcAuthenticReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csapi.org/schema/ap", ">APSvcAuthenticReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "APid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apSvcAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApSvcAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
