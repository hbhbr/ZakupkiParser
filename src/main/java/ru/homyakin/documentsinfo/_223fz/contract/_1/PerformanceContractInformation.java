//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:25:54 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.contract._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/contract/1}сontractCompletingInfoXml">
 *       &lt;sequence>
 *         &lt;element name="performanceContract" type="{http://zakupki.gov.ru/223fz/contract/1}contractCompletingInfoExportType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "performanceContract"
})
@XmlRootElement(name = "performanceContractInformation")
public class PerformanceContractInformation
    extends СontractCompletingInfoXml
{

    @XmlElement(required = true)
    protected List<ContractCompletingInfoExportType> performanceContract;

    /**
     * Gets the value of the performanceContract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceContract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractCompletingInfoExportType }
     * 
     * 
     */
    public List<ContractCompletingInfoExportType> getPerformanceContract() {
        if (performanceContract == null) {
            performanceContract = new ArrayList<ContractCompletingInfoExportType>();
        }
        return this.performanceContract;
    }

}
