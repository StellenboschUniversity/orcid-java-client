//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.20 at 12:59:45 PM GMT 
//

package uk.bl.odin.orcid.schema.messages.onepointone;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}country" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}patent-number" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}short-description" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}patent-issue-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}assignee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}patent-contributors" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}patent-sources" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}put-code"/>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "country", "patentNumber", "shortDescription", "patentIssueDate", "assignee",
		"patentContributors", "patentSources" })
@XmlRootElement(name = "orcid-patent")
public class OrcidPatent {

	protected Country country;
	@XmlElement(name = "patent-number")
	protected PatentNumber patentNumber;
	@XmlElement(name = "short-description")
	protected String shortDescription;
	@XmlElement(name = "patent-issue-date")
	protected PatentIssueDate patentIssueDate;
	protected List<Assignee> assignee;
	@XmlElement(name = "patent-contributors")
	protected PatentContributors patentContributors;
	@XmlElement(name = "patent-sources")
	protected PatentSources patentSources;
	@XmlAttribute(name = "put-code")
	protected BigInteger putCode;
	@XmlAttribute
	protected Visibility visibility;

	/**
	 * Gets the value of the country property.
	 * 
	 * @return possible object is {@link Country }
	 * 
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Sets the value of the country property.
	 * 
	 * @param value
	 *            allowed object is {@link Country }
	 * 
	 */
	public void setCountry(Country value) {
		this.country = value;
	}

	/**
	 * Gets the value of the patentNumber property.
	 * 
	 * @return possible object is {@link PatentNumber }
	 * 
	 */
	public PatentNumber getPatentNumber() {
		return patentNumber;
	}

	/**
	 * Sets the value of the patentNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link PatentNumber }
	 * 
	 */
	public void setPatentNumber(PatentNumber value) {
		this.patentNumber = value;
	}

	/**
	 * Gets the value of the shortDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * Sets the value of the shortDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShortDescription(String value) {
		this.shortDescription = value;
	}

	/**
	 * Gets the value of the patentIssueDate property.
	 * 
	 * @return possible object is {@link PatentIssueDate }
	 * 
	 */
	public PatentIssueDate getPatentIssueDate() {
		return patentIssueDate;
	}

	/**
	 * Sets the value of the patentIssueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link PatentIssueDate }
	 * 
	 */
	public void setPatentIssueDate(PatentIssueDate value) {
		this.patentIssueDate = value;
	}

	/**
	 * Gets the value of the assignee property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the assignee property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAssignee().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Assignee }
	 * 
	 * 
	 */
	public List<Assignee> getAssignee() {
		if (assignee == null) {
			assignee = new ArrayList<Assignee>();
		}
		return this.assignee;
	}

	/**
	 * Gets the value of the patentContributors property.
	 * 
	 * @return possible object is {@link PatentContributors }
	 * 
	 */
	public PatentContributors getPatentContributors() {
		return patentContributors;
	}

	/**
	 * Sets the value of the patentContributors property.
	 * 
	 * @param value
	 *            allowed object is {@link PatentContributors }
	 * 
	 */
	public void setPatentContributors(PatentContributors value) {
		this.patentContributors = value;
	}

	/**
	 * Gets the value of the patentSources property.
	 * 
	 * @return possible object is {@link PatentSources }
	 * 
	 */
	public PatentSources getPatentSources() {
		return patentSources;
	}

	/**
	 * Sets the value of the patentSources property.
	 * 
	 * @param value
	 *            allowed object is {@link PatentSources }
	 * 
	 */
	public void setPatentSources(PatentSources value) {
		this.patentSources = value;
	}

	/**
	 * Gets the value of the putCode property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getPutCode() {
		return putCode;
	}

	/**
	 * Sets the value of the putCode property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setPutCode(BigInteger value) {
		this.putCode = value;
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
