//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:26:35 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for purchasePlanItemStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="purchasePlanItemStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "purchasePlanItemStatusType")
@XmlEnum
public enum PurchasePlanItemStatusType {


    /**
     * Новая
     * 
     */
    N,

    /**
     * Размещена
     * 
     */
    P,

    /**
     * Изменена
     * 
     */
    C,

    /**
     * Аннулирована
     * 
     */
    A;

    public String value() {
        return name();
    }

    public static PurchasePlanItemStatusType fromValue(String v) {
        return valueOf(v);
    }

}
