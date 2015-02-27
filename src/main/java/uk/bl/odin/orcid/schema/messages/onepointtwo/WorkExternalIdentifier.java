//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.02 at 09:35:21 AM CET 
//


package uk.bl.odin.orcid.schema.messages.onepointtwo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-external-identifier-type"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-external-identifier-id"/>
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
    "workExternalIdentifierType",
    "workExternalIdentifierId"
})
@XmlRootElement(name = "work-external-identifier")
public class WorkExternalIdentifier {

    @XmlElement(name = "work-external-identifier-type", required = true)
    protected String workExternalIdentifierType;
    @XmlElement(name = "work-external-identifier-id", required = true)
    protected String workExternalIdentifierId;

    /**
     * Gets the value of the workExternalIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkExternalIdentifierType() {
        return workExternalIdentifierType;
    }

    /**
     * Sets the value of the workExternalIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkExternalIdentifierType(String value) {
        this.workExternalIdentifierType = value;
    }

    /**
     * Gets the value of the workExternalIdentifierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkExternalIdentifierId() {
        return workExternalIdentifierId;
    }

    /**
     * Sets the value of the workExternalIdentifierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkExternalIdentifierId(String value) {
        this.workExternalIdentifierId = value;
    }

}
