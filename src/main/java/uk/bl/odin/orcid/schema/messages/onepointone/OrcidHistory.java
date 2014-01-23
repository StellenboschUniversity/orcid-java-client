//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.20 at 12:59:45 PM GMT 
//

package uk.bl.odin.orcid.schema.messages.onepointone;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}creation-method" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}completion-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}submission-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}last-modified-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}claimed" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}source" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}deactivation-date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "creationMethod", "completionDate", "submissionDate", "lastModifiedDate", "claimed",
		"source", "deactivationDate" })
@XmlRootElement(name = "orcid-history")
public class OrcidHistory {

	@XmlElement(name = "creation-method")
	protected CreationMethod creationMethod;
	@XmlElement(name = "completion-date")
	protected CompletionDate completionDate;
	@XmlElement(name = "submission-date")
	protected SubmissionDate submissionDate;
	@XmlElement(name = "last-modified-date")
	protected LastModifiedDate lastModifiedDate;
	protected Claimed claimed;
	protected Source source;
	@XmlElement(name = "deactivation-date")
	protected DeactivationDate deactivationDate;
	@XmlAttribute
	protected Visibility visibility;

	/**
	 * Gets the value of the creationMethod property.
	 * 
	 * @return possible object is {@link CreationMethod }
	 * 
	 */
	public CreationMethod getCreationMethod() {
		return creationMethod;
	}

	/**
	 * Sets the value of the creationMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link CreationMethod }
	 * 
	 */
	public void setCreationMethod(CreationMethod value) {
		this.creationMethod = value;
	}

	/**
	 * Gets the value of the completionDate property.
	 * 
	 * @return possible object is {@link CompletionDate }
	 * 
	 */
	public CompletionDate getCompletionDate() {
		return completionDate;
	}

	/**
	 * Sets the value of the completionDate property.
	 * 
	 * @param value
	 *            allowed object is {@link CompletionDate }
	 * 
	 */
	public void setCompletionDate(CompletionDate value) {
		this.completionDate = value;
	}

	/**
	 * Gets the value of the submissionDate property.
	 * 
	 * @return possible object is {@link SubmissionDate }
	 * 
	 */
	public SubmissionDate getSubmissionDate() {
		return submissionDate;
	}

	/**
	 * Sets the value of the submissionDate property.
	 * 
	 * @param value
	 *            allowed object is {@link SubmissionDate }
	 * 
	 */
	public void setSubmissionDate(SubmissionDate value) {
		this.submissionDate = value;
	}

	/**
	 * Gets the value of the lastModifiedDate property.
	 * 
	 * @return possible object is {@link LastModifiedDate }
	 * 
	 */
	public LastModifiedDate getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * Sets the value of the lastModifiedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link LastModifiedDate }
	 * 
	 */
	public void setLastModifiedDate(LastModifiedDate value) {
		this.lastModifiedDate = value;
	}

	/**
	 * Gets the value of the claimed property.
	 * 
	 * @return possible object is {@link Claimed }
	 * 
	 */
	public Claimed getClaimed() {
		return claimed;
	}

	/**
	 * Sets the value of the claimed property.
	 * 
	 * @param value
	 *            allowed object is {@link Claimed }
	 * 
	 */
	public void setClaimed(Claimed value) {
		this.claimed = value;
	}

	/**
	 * Gets the value of the source property.
	 * 
	 * @return possible object is {@link Source }
	 * 
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * Sets the value of the source property.
	 * 
	 * @param value
	 *            allowed object is {@link Source }
	 * 
	 */
	public void setSource(Source value) {
		this.source = value;
	}

	/**
	 * Gets the value of the deactivationDate property.
	 * 
	 * @return possible object is {@link DeactivationDate }
	 * 
	 */
	public DeactivationDate getDeactivationDate() {
		return deactivationDate;
	}

	/**
	 * Sets the value of the deactivationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link DeactivationDate }
	 * 
	 */
	public void setDeactivationDate(DeactivationDate value) {
		this.deactivationDate = value;
	}

	/**
	 * Gets the value of the visibility property.
	 * 
	 * @return possible object is {@link Visibility }
	 * 
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * Sets the value of the visibility property.
	 * 
	 * @param value
	 *            allowed object is {@link Visibility }
	 * 
	 */
	public void setVisibility(Visibility value) {
		this.visibility = value;
	}

}
