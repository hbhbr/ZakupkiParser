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
 * <p>Java class for acceptedType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="acceptedType2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "acceptedType2")
@XmlEnum
public enum AcceptedType2 {


    /**
     * Допущен
     * 
     */
    T,

    /**
     * Не допущен
     * 
     */
    F,

    /**
     * Не указывается в данном протоколе
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static AcceptedType2 fromValue(String v) {
        return valueOf(v);
    }

}
