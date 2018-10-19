
package webservice.autogeneratedXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="groupMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tplCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rqID",
    "phoneNum",
    "acNum",
    "smsMsg",
    "requestor",
    "requesPassword",
    "requestBranch",
    "ipriority",
    "groupMsg",
    "tplCode"
})
@XmlRootElement(name = "SendMTFull")
public class SendMTFull {

    protected String rqID;
    protected String phoneNum;
    protected String acNum;
    protected String smsMsg;
    protected String requestor;
    protected String requesPassword;
    protected String requestBranch;
    protected int ipriority;
    protected String groupMsg;
    protected String tplCode;

    /**
     * Gets the value of the rqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqID() {
        return rqID;
    }

    /**
     * Sets the value of the rqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqID(String value) {
        this.rqID = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the acNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcNum() {
        return acNum;
    }

    /**
     * Sets the value of the acNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcNum(String value) {
        this.acNum = value;
    }

    /**
     * Gets the value of the smsMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsMsg() {
        return smsMsg;
    }

    /**
     * Sets the value of the smsMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsMsg(String value) {
        this.smsMsg = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestor(String value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the requesPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesPassword() {
        return requesPassword;
    }

    /**
     * Sets the value of the requesPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesPassword(String value) {
        this.requesPassword = value;
    }

    /**
     * Gets the value of the requestBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestBranch() {
        return requestBranch;
    }

    /**
     * Sets the value of the requestBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestBranch(String value) {
        this.requestBranch = value;
    }

    /**
     * Gets the value of the ipriority property.
     * 
     */
    public int getIpriority() {
        return ipriority;
    }

    /**
     * Sets the value of the ipriority property.
     * 
     */
    public void setIpriority(int value) {
        this.ipriority = value;
    }

    /**
     * Gets the value of the groupMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMsg() {
        return groupMsg;
    }

    /**
     * Sets the value of the groupMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMsg(String value) {
        this.groupMsg = value;
    }

    /**
     * Gets the value of the tplCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTplCode() {
        return tplCode;
    }

    /**
     * Sets the value of the tplCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTplCode(String value) {
        this.tplCode = value;
    }

}
