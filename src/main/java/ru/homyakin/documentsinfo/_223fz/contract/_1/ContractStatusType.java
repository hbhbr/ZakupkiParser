//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:25:54 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.contract._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contractStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contractStatusType")
@XmlEnum
public enum ContractStatusType {


    /**
     * Редактирование
     * 
     */
    F,

    /**
     * Размещено
     * 
     */
    P,

    /**
     * Недействительно
     * 
     */
    I,

    /**
     * Изменение
     * 
     */
    M;

    public String value() {
        return name();
    }

    public static ContractStatusType fromValue(String v) {
        return valueOf(v);
    }

}
