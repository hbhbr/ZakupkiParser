//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:25:54 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.purchase._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Итоговый протокол запроса котировок в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства
 * 
 * <p>Java class for purchaseProtocolSummingupZKESMBODataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolSummingupZKESMBODataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolDataType">
 *       &lt;sequence>
 *         &lt;element name="protocolRZRegistryNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolSummingupZKESMBODataType", propOrder = {
    "protocolRZRegistryNumber"
})
public class PurchaseProtocolSummingupZKESMBODataType
    extends PurchaseProtocolDataType
{

    protected String protocolRZRegistryNumber;

    /**
     * Gets the value of the protocolRZRegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRZRegistryNumber() {
        return protocolRZRegistryNumber;
    }

    /**
     * Sets the value of the protocolRZRegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRZRegistryNumber(String value) {
        this.protocolRZRegistryNumber = value;
    }

}
