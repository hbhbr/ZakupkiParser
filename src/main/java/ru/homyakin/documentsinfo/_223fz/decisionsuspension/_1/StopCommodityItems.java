//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:25:04 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.decisionsuspension._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Строка перечня
 * 
 * <p>Java class for stopCommodityItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stopCommodityItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contractSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stopCommodityItems", propOrder = {
    "ordinalNumber",
    "contractSubject"
})
public class StopCommodityItems {

    protected int ordinalNumber;
    @XmlElement(required = true)
    protected String contractSubject;

    /**
     * Gets the value of the ordinalNumber property.
     * 
     */
    public int getOrdinalNumber() {
        return ordinalNumber;
    }

    /**
     * Sets the value of the ordinalNumber property.
     * 
     */
    public void setOrdinalNumber(int value) {
        this.ordinalNumber = value;
    }

    /**
     * Gets the value of the contractSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSubject() {
        return contractSubject;
    }

    /**
     * Sets the value of the contractSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSubject(String value) {
        this.contractSubject = value;
    }

}
