//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:25:54 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.documentsinfo._223fz.types._1.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for purchaseProtocolZRPZZPESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolZRPZZPESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolZRPZZPESMBOData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolZRPZZPESMBODataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolZRPZZPESMBOItemType", propOrder = {
    "purchaseProtocolZRPZZPESMBOData"
})
public class PurchaseProtocolZRPZZPESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolZRPZZPESMBODataType purchaseProtocolZRPZZPESMBOData;

    /**
     * Gets the value of the purchaseProtocolZRPZZPESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolZRPZZPESMBODataType }
     *     
     */
    public PurchaseProtocolZRPZZPESMBODataType getPurchaseProtocolZRPZZPESMBOData() {
        return purchaseProtocolZRPZZPESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolZRPZZPESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolZRPZZPESMBODataType }
     *     
     */
    public void setPurchaseProtocolZRPZZPESMBOData(PurchaseProtocolZRPZZPESMBODataType value) {
        this.purchaseProtocolZRPZZPESMBOData = value;
    }

}
