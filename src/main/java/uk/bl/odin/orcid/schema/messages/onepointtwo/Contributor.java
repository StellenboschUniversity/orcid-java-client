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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-orcid" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}credit-name" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-email" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}contributor-attributes" minOccurs="0"/>
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
    "contributorOrcid",
    "creditName",
    "contributorEmail",
    "contributorAttributes"
})
@XmlRootElement(name = "contributor")
public class Contributor {

    @XmlElement(name = "contributor-orcid")
    protected OrcidId contributorOrcid;
    @XmlElement(name = "credit-name")
    protected CreditName creditName;
    @XmlElement(name = "contributor-email")
    protected ContributorEmail contributorEmail;
    @XmlElement(name = "contributor-attributes")
    protected ContributorAttributes contributorAttributes;

    /**
     * Gets the value of the contributorOrcid property.
     * 
     * @return
     *     possible object is
     *     {@link OrcidId }
     *     
     */
    public OrcidId getContributorOrcid() {
        return contributorOrcid;
    }

    /**
     * Sets the value of the contributorOrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrcidId }
     *     
     */
    public void setContributorOrcid(OrcidId value) {
        this.contributorOrcid = value;
    }

    /**
     * Gets the value of the creditName property.
     * 
     * @return
     *     possible object is
     *     {@link CreditName }
     *     
     */
    public CreditName getCreditName() {
        return creditName;
    }

    /**
     * Sets the value of the creditName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditName }
     *     
     */
    public void setCreditName(CreditName value) {
        this.creditName = value;
    }

    /**
     * Gets the value of the contributorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorEmail }
     *     
     */
    public ContributorEmail getContributorEmail() {
        return contributorEmail;
    }

    /**
     * Sets the value of the contributorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorEmail }
     *     
     */
    public void setContributorEmail(ContributorEmail value) {
        this.contributorEmail = value;
    }

    /**
     * Gets the value of the contributorAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorAttributes }
     *     
     */
    public ContributorAttributes getContributorAttributes() {
        return contributorAttributes;
    }

    /**
     * Sets the value of the contributorAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorAttributes }
     *     
     */
    public void setContributorAttributes(ContributorAttributes value) {
        this.contributorAttributes = value;
    }

}
