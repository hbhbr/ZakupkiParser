//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:26:35 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.exclusion._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.documentsinfo._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for exclusionItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exclusionItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="exclusionData" type="{http://zakupki.gov.ru/223fz/exclusion/1}exclusionDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusionItemType", propOrder = {
    "exclusionData"
})
public class ExclusionItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected ExclusionDataType exclusionData;

    /**
     * Gets the value of the exclusionData property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionDataType }
     *     
     */
    public ExclusionDataType getExclusionData() {
        return exclusionData;
    }

    /**
     * Sets the value of the exclusionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionDataType }
     *     
     */
    public void setExclusionData(ExclusionDataType value) {
        this.exclusionData = value;
    }

}
