//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.20 at 12:59:45 PM GMT 
//

package uk.bl.odin.orcid.schema.messages.onepointone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}external-id-orcid" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}external-id-common-name" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}external-id-reference" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}external-id-url" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "externalIdOrcid", "externalIdCommonName", "externalIdReference", "externalIdUrl" })
@XmlRootElement(name = "external-identifier")
public class ExternalIdentifier {

	@XmlElement(name = "external-id-orcid")
	protected OrcidId externalIdOrcid;
	@XmlElement(name = "external-id-common-name")
	protected ExternalIdCommonName externalIdCommonName;
	@XmlElement(name = "external-id-reference")
	protected ExternalIdReference externalIdReference;
	@XmlElement(name = "external-id-url")
	protected ExternalIdUrl externalIdUrl;

	/**
	 * Gets the value of the externalIdOrcid property.
	 * 
	 * @return possible object is {@link OrcidId }
	 * 
	 */
	public OrcidId getExternalIdOrcid() {
		return externalIdOrcid;
	}

	/**
	 * Sets the value of the externalIdOrcid property.
	 * 
	 * @param value
	 *            allowed object is {@link OrcidId }
	 * 
	 */
	public void setExternalIdOrcid(OrcidId value) {
		this.externalIdOrcid = value;
	}

	/**
	 * Gets the value of the externalIdCommonName property.
	 * 
	 * @return possible object is {@link ExternalIdCommonName }
	 * 
	 */
	public ExternalIdCommonName getExternalIdCommonName() {
		return externalIdCommonName;
	}

	/**
	 * Sets the value of the externalIdCommonName property.
	 * 
	 * @param value
	 *            allowed object is {@link ExternalIdCommonName }
	 * 
	 */
	public void setExternalIdCommonName(ExternalIdCommonName value) {
		this.externalIdCommonName = value;
	}

	/**
	 * Gets the value of the externalIdReference property.
	 * 
	 * @return possible object is {@link ExternalIdReference }
	 * 
	 */
	public ExternalIdReference getExternalIdReference() {
		return externalIdReference;
	}

	/**
	 * Sets the value of the externalIdReference property.
	 * 
	 * @param value
	 *            allowed object is {@link ExternalIdReference }
	 * 
	 */
	public void setExternalIdReference(ExternalIdReference value) {
		this.externalIdReference = value;
	}

	/**
	 * Gets the value of the externalIdUrl property.
	 * 
	 * @return possible object is {@link ExternalIdUrl }
	 * 
	 */
	public ExternalIdUrl getExternalIdUrl() {
		return externalIdUrl;
	}

	/**
	 * Sets the value of the externalIdUrl property.
	 * 
	 * @param value
	 *            allowed object is {@link ExternalIdUrl }
	 * 
	 */
	public void setExternalIdUrl(ExternalIdUrl value) {
		this.externalIdUrl = value;
	}

}
