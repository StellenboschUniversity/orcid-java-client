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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * In some places the full date is not required.
 * 
 * 
 * <p>
 * Java class for fuzzy-date complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="fuzzy-date">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}year"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.orcid.org/ns/orcid}month"/>
 *           &lt;element ref="{http://www.orcid.org/ns/orcid}day" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fuzzy-date", propOrder = { "year", "month", "day" })
@XmlSeeAlso({ PublicationDate.class })
public class FuzzyDate {

	@XmlElement(required = true)
	protected Year year;
	protected Month month;
	protected Day day;

	/**
	 * Gets the value of the year property.
	 * 
	 * @return possible object is {@link Year }
	 * 
	 */
	public Year getYear() {
		return year;
	}

	/**
	 * Sets the value of the year property.
	 * 
	 * @param value
	 *            allowed object is {@link Year }
	 * 
	 */
	public void setYear(Year value) {
		this.year = value;
	}

	/**
	 * Gets the value of the month property.
	 * 
	 * @return possible object is {@link Month }
	 * 
	 */
	public Month getMonth() {
		return month;
	}

	/**
	 * Sets the value of the month property.
	 * 
	 * @param value
	 *            allowed object is {@link Month }
	 * 
	 */
	public void setMonth(Month value) {
		this.month = value;
	}

	/**
	 * Gets the value of the day property.
	 * 
	 * @return possible object is {@link Day }
	 * 
	 */
	public Day getDay() {
		return day;
	}

	/**
	 * Sets the value of the day property.
	 * 
	 * @param value
	 *            allowed object is {@link Day }
	 * 
	 */
	public void setDay(Day value) {
		this.day = value;
	}

}
