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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

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
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.orcid.org/ns/orcid>email">
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="verified" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="source" type="{http://www.orcid.org/ns/orcid}orcid-path" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
@XmlRootElement(name = "email")
public class Email {

	@XmlValue
	protected String value;
	@XmlAttribute
	protected Boolean primary;
	@XmlAttribute
	protected Boolean current;
	@XmlAttribute
	protected Boolean verified;
	@XmlAttribute
	protected String source;
	@XmlAttribute
	protected Visibility visibility;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the primary property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isPrimary() {
		if (primary == null) {
			return true;
		} else {
			return primary;
		}
	}

	/**
	 * Sets the value of the primary property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPrimary(Boolean value) {
		this.primary = value;
	}

	/**
	 * Gets the value of the current property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isCurrent() {
		if (current == null) {
			return true;
		} else {
			return current;
		}
	}

	/**
	 * Sets the value of the current property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCurrent(Boolean value) {
		this.current = value;
	}

	/**
	 * Gets the value of the verified property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isVerified() {
		if (verified == null) {
			return false;
		} else {
			return verified;
		}
	}

	/**
	 * Sets the value of the verified property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setVerified(Boolean value) {
		this.verified = value;
	}

	/**
	 * Gets the value of the source property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Sets the value of the source property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSource(String value) {
		this.source = value;
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
