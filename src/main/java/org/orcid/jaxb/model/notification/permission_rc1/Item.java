/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 04:27:39 PM GMT 
//

package org.orcid.jaxb.model.notification.permission_rc1;

import java.io.Serializable;

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
 *         &lt;element ref="{http://www.orcid.org/ns/notification}activity-type"/>
 *         &lt;element ref="{http://www.orcid.org/ns/notification}activity-name"/>
 *         &lt;element ref="{http://www.orcid.org/ns/common}external-id" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "putCode", "itemType", "itemName", "externalIdentifier" })
@XmlRootElement(name = "item")
public class Item implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "put-code")
    protected String putCode;
    @XmlElement(name = "item-type", namespace = "http://www.orcid.org/ns/notification", required = true)
    protected ItemType itemType;
    @XmlElement(name = "item-name", namespace = "http://www.orcid.org/ns/notification", required = true)
    protected String itemName;
    @XmlElement(name = "external-identifier", namespace = "http://www.orcid.org/ns/notification", required = true)
    protected ExternalIdentifier externalIdentifier;

    public String getPutCode() {
        return putCode;
    }

    public void setPutCode(String putCode) {
        this.putCode = putCode;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return possible object is {@link ItemType }
     * 
     */
    public ItemType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *            allowed object is {@link ItemType }
     * 
     */
    public void setItemType(ItemType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return possible object is {@link ExternalIdentifier }
     * 
     */
    public ExternalIdentifier getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *            allowed object is {@link ExternalIdentifier }
     * 
     */
    public void setExternalIdentifier(ExternalIdentifier value) {
        this.externalIdentifier = value;
    }

}
