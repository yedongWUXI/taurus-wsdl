/**
 * APLogOutRsp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package org.csapi.www.schema.ap;

public class APLogOutRsp  implements java.io.Serializable {
    private org.csapi.www.schema.ap.APLogoutResult logoutResult;

    public APLogOutRsp() {
    }

    public APLogOutRsp(
           org.csapi.www.schema.ap.APLogoutResult logoutResult) {
           this.logoutResult = logoutResult;
    }


    /**
     * Gets the logoutResult value for this APLogOutRsp.
     * 
     * @return logoutResult
     */
    public org.csapi.www.schema.ap.APLogoutResult getLogoutResult() {
        return logoutResult;
    }


    /**
     * Sets the logoutResult value for this APLogOutRsp.
     * 
     * @param logoutResult
     */
    public void setLogoutResult(org.csapi.www.schema.ap.APLogoutResult logoutResult) {
        this.logoutResult = logoutResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APLogOutRsp)) return false;
        APLogOutRsp other = (APLogOutRsp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logoutResult==null && other.getLogoutResult()==null) || 
             (this.logoutResult!=null &&
              this.logoutResult.equals(other.getLogoutResult())));
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
        if (getLogoutResult() != null) {
            _hashCode += getLogoutResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APLogOutRsp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csapi.org/schema/ap", ">APLogOutRsp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoutResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogoutResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.csapi.org/schema/ap", "APLogoutResult"));
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
