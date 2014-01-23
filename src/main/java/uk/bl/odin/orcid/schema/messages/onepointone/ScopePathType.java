//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.20 at 12:59:45 PM GMT 
//

package uk.bl.odin.orcid.schema.messages.onepointone;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for scope-path-type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="scope-path-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="/authenticate"/>
 *     &lt;enumeration value="/orcid-bio/read-limited"/>
 *     &lt;enumeration value="/orcid-profile/read-limited"/>
 *     &lt;enumeration value="/orcid-works/read-limited"/>
 *     &lt;enumeration value="/orcid-grants/read-limited"/>
 *     &lt;enumeration value="/orcid-patents/read-limited"/>
 *     &lt;enumeration value="/orcid-works/update"/>
 *     &lt;enumeration value="/orcid-grants/update"/>
 *     &lt;enumeration value="/orcid-patents/update"/>
 *     &lt;enumeration value="/orcid-bio/external-identifiers/create"/>
 *     &lt;enumeration value="/orcid-bio/update"/>
 *     &lt;enumeration value="/orcid-works/create"/>
 *     &lt;enumeration value="/orcid-grants/create"/>
 *     &lt;enumeration value="/orcid-patents/create"/>
 *     &lt;enumeration value="/orcid-profile/create"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scope-path-type")
@XmlEnum
public enum ScopePathType {

	@XmlEnumValue("/authenticate")
	AUTHENTICATE("/authenticate"), @XmlEnumValue("/orcid-bio/read-limited")
	ORCID_BIO_READ_LIMITED("/orcid-bio/read-limited"), @XmlEnumValue("/orcid-profile/read-limited")
	ORCID_PROFILE_READ_LIMITED("/orcid-profile/read-limited"), @XmlEnumValue("/orcid-works/read-limited")
	ORCID_WORKS_READ_LIMITED("/orcid-works/read-limited"), @XmlEnumValue("/orcid-grants/read-limited")
	ORCID_GRANTS_READ_LIMITED("/orcid-grants/read-limited"), @XmlEnumValue("/orcid-patents/read-limited")
	ORCID_PATENTS_READ_LIMITED("/orcid-patents/read-limited"), @XmlEnumValue("/orcid-works/update")
	ORCID_WORKS_UPDATE("/orcid-works/update"), @XmlEnumValue("/orcid-grants/update")
	ORCID_GRANTS_UPDATE("/orcid-grants/update"), @XmlEnumValue("/orcid-patents/update")
	ORCID_PATENTS_UPDATE("/orcid-patents/update"), @XmlEnumValue("/orcid-bio/external-identifiers/create")
	ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE("/orcid-bio/external-identifiers/create"), @XmlEnumValue("/orcid-bio/update")
	ORCID_BIO_UPDATE("/orcid-bio/update"), @XmlEnumValue("/orcid-works/create")
	ORCID_WORKS_CREATE("/orcid-works/create"), @XmlEnumValue("/orcid-grants/create")
	ORCID_GRANTS_CREATE("/orcid-grants/create"), @XmlEnumValue("/orcid-patents/create")
	ORCID_PATENTS_CREATE("/orcid-patents/create"), @XmlEnumValue("/orcid-profile/create")
	ORCID_PROFILE_CREATE("/orcid-profile/create");
	private final String value;

	ScopePathType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ScopePathType fromValue(String v) {
		for (ScopePathType c : ScopePathType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
