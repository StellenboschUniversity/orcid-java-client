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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}message-version"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.orcid.org/ns/orcid}orcid-profile"/>
 *           &lt;element ref="{http://www.orcid.org/ns/orcid}orcid-search-results"/>
 *           &lt;element ref="{http://www.orcid.org/ns/orcid}error-desc"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "messageVersion", "orcidProfile", "orcidSearchResults", "errorDesc" })
@XmlRootElement(name = "orcid-message")
public class OrcidMessage {

	@XmlElement(name = "message-version", required = true)
	protected String messageVersion;
	@XmlElement(name = "orcid-profile")
	protected OrcidProfile orcidProfile;
	@XmlElement(name = "orcid-search-results")
	protected OrcidSearchResults orcidSearchResults;
	@XmlElement(name = "error-desc")
	protected ErrorDesc errorDesc;

	/**
	 * Gets the value of the messageVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessageVersion() {
		return messageVersion;
	}

	/**
	 * Sets the value of the messageVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessageVersion(String value) {
		this.messageVersion = value;
	}

	/**
	 * Gets the value of the orcidProfile property.
	 * 
	 * @return possible object is {@link OrcidProfile }
	 * 
	 */
	public OrcidProfile getOrcidProfile() {
		return orcidProfile;
	}

	/**
	 * Sets the value of the orcidProfile property.
	 * 
	 * @param value
	 *            allowed object is {@link OrcidProfile }
	 * 
	 */
	public void setOrcidProfile(OrcidProfile value) {
		this.orcidProfile = value;
	}

	/**
	 * Gets the value of the orcidSearchResults property.
	 * 
	 * @return possible object is {@link OrcidSearchResults }
	 * 
	 */
	public OrcidSearchResults getOrcidSearchResults() {
		return orcidSearchResults;
	}

	/**
	 * Sets the value of the orcidSearchResults property.
	 * 
	 * @param value
	 *            allowed object is {@link OrcidSearchResults }
	 * 
	 */
	public void setOrcidSearchResults(OrcidSearchResults value) {
		this.orcidSearchResults = value;
	}

	/**
	 * Gets the value of the errorDesc property.
	 * 
	 * @return possible object is {@link ErrorDesc }
	 * 
	 */
	public ErrorDesc getErrorDesc() {
		return errorDesc;
	}

	/**
	 * Sets the value of the errorDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link ErrorDesc }
	 * 
	 */
	public void setErrorDesc(ErrorDesc value) {
		this.errorDesc = value;
	}

}
