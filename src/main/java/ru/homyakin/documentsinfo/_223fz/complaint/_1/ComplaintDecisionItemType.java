//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:24:04 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.complaint._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.documentsinfo._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for complaintDecisionItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complaintDecisionItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="complaintDecisionData" type="{http://zakupki.gov.ru/223fz/complaint/1}complaintDecisionDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complaintDecisionItemType", propOrder = {
    "complaintDecisionData"
})
public class ComplaintDecisionItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected ComplaintDecisionDataType complaintDecisionData;

    /**
     * Gets the value of the complaintDecisionData property.
     * 
     * @return
     *     possible object is
     *     {@link ComplaintDecisionDataType }
     *     
     */
    public ComplaintDecisionDataType getComplaintDecisionData() {
        return complaintDecisionData;
    }

    /**
     * Sets the value of the complaintDecisionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplaintDecisionDataType }
     *     
     */
    public void setComplaintDecisionData(ComplaintDecisionDataType value) {
        this.complaintDecisionData = value;
    }

}
