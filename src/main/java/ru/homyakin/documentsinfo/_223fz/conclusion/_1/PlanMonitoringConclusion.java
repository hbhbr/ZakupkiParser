//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:24:16 PM MSK 
//


package ru.homyakin.documentsinfo._223fz.conclusion._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.homyakin.documentsinfo._223fz.types._1.CustomerInfo2Type;
import ru.homyakin.documentsinfo._223fz.types._1.PlanInformationType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo2Type"/>
 *         &lt;element name="conclusion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="issueDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="issueMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="issueYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="evaluationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="evaluationDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="evaluationMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="evaluationYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/223fz/conclusion/1}conclusionRegNumberType"/>
 *                   &lt;element name="planInformationType" type="{http://zakupki.gov.ru/223fz/types/1}planInformationType"/>
 *                   &lt;element name="discrepancyIndicators" type="{http://zakupki.gov.ru/223fz/conclusion/1}discrepancyIndicatorValue" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="discrepancyPositions" type="{http://zakupki.gov.ru/223fz/conclusion/1}discrepancyPositionType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="discrepancyNotificationInfo" type="{http://zakupki.gov.ru/223fz/conclusion/1}discrepancyNotificationInfoType" minOccurs="0"/>
 *                   &lt;element name="notObservingAnnualVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="notObservingAnnualVolumeSMB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="noApprovedCustomerListGws" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="planNotCorrespondListGws" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="notObservingPlannedHiTechAnnualVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="notObservingHiTechAnnualVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="notRequirements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="plan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="planVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType" minOccurs="0"/>
 *                   &lt;element name="customerAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo2Type"/>
 *                   &lt;element name="planType" type="{http://zakupki.gov.ru/223fz/conclusion/1}planType" minOccurs="0"/>
 *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "controlAgency",
    "conclusion",
    "plan"
})
@XmlRootElement(name = "planMonitoringConclusion")
public class PlanMonitoringConclusion {

    @XmlElement(required = true)
    protected CustomerInfo2Type controlAgency;
    @XmlElement(required = true)
    protected PlanMonitoringConclusion.Conclusion conclusion;
    @XmlElement(required = true)
    protected PlanMonitoringConclusion.Plan plan;

    /**
     * Gets the value of the controlAgency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public CustomerInfo2Type getControlAgency() {
        return controlAgency;
    }

    /**
     * Sets the value of the controlAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo2Type }
     *     
     */
    public void setControlAgency(CustomerInfo2Type value) {
        this.controlAgency = value;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link PlanMonitoringConclusion.Conclusion }
     *     
     */
    public PlanMonitoringConclusion.Conclusion getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanMonitoringConclusion.Conclusion }
     *     
     */
    public void setConclusion(PlanMonitoringConclusion.Conclusion value) {
        this.conclusion = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link PlanMonitoringConclusion.Plan }
     *     
     */
    public PlanMonitoringConclusion.Plan getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanMonitoringConclusion.Plan }
     *     
     */
    public void setPlan(PlanMonitoringConclusion.Plan value) {
        this.plan = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="issueDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="issueMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="issueYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="evaluationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="evaluationDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="evaluationMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="evaluationYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/223fz/conclusion/1}conclusionRegNumberType"/>
     *         &lt;element name="planInformationType" type="{http://zakupki.gov.ru/223fz/types/1}planInformationType"/>
     *         &lt;element name="discrepancyIndicators" type="{http://zakupki.gov.ru/223fz/conclusion/1}discrepancyIndicatorValue" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="discrepancyPositions" type="{http://zakupki.gov.ru/223fz/conclusion/1}discrepancyPositionType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="discrepancyNotificationInfo" type="{http://zakupki.gov.ru/223fz/conclusion/1}discrepancyNotificationInfoType" minOccurs="0"/>
     *         &lt;element name="notObservingAnnualVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="notObservingAnnualVolumeSMB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="noApprovedCustomerListGws" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="planNotCorrespondListGws" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="notObservingPlannedHiTechAnnualVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="notObservingHiTechAnnualVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="notRequirements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "issueDate",
        "issueDay",
        "issueMonth",
        "issueYear",
        "evaluationDate",
        "evaluationDay",
        "evaluationMonth",
        "evaluationYear",
        "regNumber",
        "planInformationType",
        "discrepancyIndicators",
        "discrepancyPositions",
        "discrepancyNotificationInfo",
        "notObservingAnnualVolume",
        "notObservingAnnualVolumeSMB",
        "noApprovedCustomerListGws",
        "planNotCorrespondListGws",
        "notObservingPlannedHiTechAnnualVolume",
        "notObservingHiTechAnnualVolume",
        "notRequirements"
    })
    public static class Conclusion {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar issueDate;
        protected int issueDay;
        @XmlElement(required = true)
        protected String issueMonth;
        protected int issueYear;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar evaluationDate;
        protected int evaluationDay;
        @XmlElement(required = true)
        protected String evaluationMonth;
        protected int evaluationYear;
        @XmlElement(required = true)
        protected String regNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected PlanInformationType planInformationType;
        @XmlElement(type = Integer.class)
        protected List<Integer> discrepancyIndicators;
        protected List<DiscrepancyPositionType> discrepancyPositions;
        protected DiscrepancyNotificationInfoType discrepancyNotificationInfo;
        protected Boolean notObservingAnnualVolume;
        protected Boolean notObservingAnnualVolumeSMB;
        protected Boolean noApprovedCustomerListGws;
        protected Boolean planNotCorrespondListGws;
        protected Boolean notObservingPlannedHiTechAnnualVolume;
        protected Boolean notObservingHiTechAnnualVolume;
        protected Boolean notRequirements;

        /**
         * Gets the value of the issueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getIssueDate() {
            return issueDate;
        }

        /**
         * Sets the value of the issueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setIssueDate(XMLGregorianCalendar value) {
            this.issueDate = value;
        }

        /**
         * Gets the value of the issueDay property.
         * 
         */
        public int getIssueDay() {
            return issueDay;
        }

        /**
         * Sets the value of the issueDay property.
         * 
         */
        public void setIssueDay(int value) {
            this.issueDay = value;
        }

        /**
         * Gets the value of the issueMonth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssueMonth() {
            return issueMonth;
        }

        /**
         * Sets the value of the issueMonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssueMonth(String value) {
            this.issueMonth = value;
        }

        /**
         * Gets the value of the issueYear property.
         * 
         */
        public int getIssueYear() {
            return issueYear;
        }

        /**
         * Sets the value of the issueYear property.
         * 
         */
        public void setIssueYear(int value) {
            this.issueYear = value;
        }

        /**
         * Gets the value of the evaluationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEvaluationDate() {
            return evaluationDate;
        }

        /**
         * Sets the value of the evaluationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEvaluationDate(XMLGregorianCalendar value) {
            this.evaluationDate = value;
        }

        /**
         * Gets the value of the evaluationDay property.
         * 
         */
        public int getEvaluationDay() {
            return evaluationDay;
        }

        /**
         * Sets the value of the evaluationDay property.
         * 
         */
        public void setEvaluationDay(int value) {
            this.evaluationDay = value;
        }

        /**
         * Gets the value of the evaluationMonth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEvaluationMonth() {
            return evaluationMonth;
        }

        /**
         * Sets the value of the evaluationMonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEvaluationMonth(String value) {
            this.evaluationMonth = value;
        }

        /**
         * Gets the value of the evaluationYear property.
         * 
         */
        public int getEvaluationYear() {
            return evaluationYear;
        }

        /**
         * Sets the value of the evaluationYear property.
         * 
         */
        public void setEvaluationYear(int value) {
            this.evaluationYear = value;
        }

        /**
         * Gets the value of the regNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegNumber() {
            return regNumber;
        }

        /**
         * Sets the value of the regNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegNumber(String value) {
            this.regNumber = value;
        }

        /**
         * Gets the value of the planInformationType property.
         * 
         * @return
         *     possible object is
         *     {@link PlanInformationType }
         *     
         */
        public PlanInformationType getPlanInformationType() {
            return planInformationType;
        }

        /**
         * Sets the value of the planInformationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlanInformationType }
         *     
         */
        public void setPlanInformationType(PlanInformationType value) {
            this.planInformationType = value;
        }

        /**
         * Gets the value of the discrepancyIndicators property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the discrepancyIndicators property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiscrepancyIndicators().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getDiscrepancyIndicators() {
            if (discrepancyIndicators == null) {
                discrepancyIndicators = new ArrayList<Integer>();
            }
            return this.discrepancyIndicators;
        }

        /**
         * Gets the value of the discrepancyPositions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the discrepancyPositions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiscrepancyPositions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiscrepancyPositionType }
         * 
         * 
         */
        public List<DiscrepancyPositionType> getDiscrepancyPositions() {
            if (discrepancyPositions == null) {
                discrepancyPositions = new ArrayList<DiscrepancyPositionType>();
            }
            return this.discrepancyPositions;
        }

        /**
         * Gets the value of the discrepancyNotificationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DiscrepancyNotificationInfoType }
         *     
         */
        public DiscrepancyNotificationInfoType getDiscrepancyNotificationInfo() {
            return discrepancyNotificationInfo;
        }

        /**
         * Sets the value of the discrepancyNotificationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscrepancyNotificationInfoType }
         *     
         */
        public void setDiscrepancyNotificationInfo(DiscrepancyNotificationInfoType value) {
            this.discrepancyNotificationInfo = value;
        }

        /**
         * Gets the value of the notObservingAnnualVolume property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotObservingAnnualVolume() {
            return notObservingAnnualVolume;
        }

        /**
         * Sets the value of the notObservingAnnualVolume property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNotObservingAnnualVolume(Boolean value) {
            this.notObservingAnnualVolume = value;
        }

        /**
         * Gets the value of the notObservingAnnualVolumeSMB property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotObservingAnnualVolumeSMB() {
            return notObservingAnnualVolumeSMB;
        }

        /**
         * Sets the value of the notObservingAnnualVolumeSMB property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNotObservingAnnualVolumeSMB(Boolean value) {
            this.notObservingAnnualVolumeSMB = value;
        }

        /**
         * Gets the value of the noApprovedCustomerListGws property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoApprovedCustomerListGws() {
            return noApprovedCustomerListGws;
        }

        /**
         * Sets the value of the noApprovedCustomerListGws property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoApprovedCustomerListGws(Boolean value) {
            this.noApprovedCustomerListGws = value;
        }

        /**
         * Gets the value of the planNotCorrespondListGws property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPlanNotCorrespondListGws() {
            return planNotCorrespondListGws;
        }

        /**
         * Sets the value of the planNotCorrespondListGws property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPlanNotCorrespondListGws(Boolean value) {
            this.planNotCorrespondListGws = value;
        }

        /**
         * Gets the value of the notObservingPlannedHiTechAnnualVolume property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotObservingPlannedHiTechAnnualVolume() {
            return notObservingPlannedHiTechAnnualVolume;
        }

        /**
         * Sets the value of the notObservingPlannedHiTechAnnualVolume property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNotObservingPlannedHiTechAnnualVolume(Boolean value) {
            this.notObservingPlannedHiTechAnnualVolume = value;
        }

        /**
         * Gets the value of the notObservingHiTechAnnualVolume property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotObservingHiTechAnnualVolume() {
            return notObservingHiTechAnnualVolume;
        }

        /**
         * Sets the value of the notObservingHiTechAnnualVolume property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNotObservingHiTechAnnualVolume(Boolean value) {
            this.notObservingHiTechAnnualVolume = value;
        }

        /**
         * Gets the value of the notRequirements property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotRequirements() {
            return notRequirements;
        }

        /**
         * Sets the value of the notRequirements property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNotRequirements(Boolean value) {
            this.notRequirements = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="planVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType" minOccurs="0"/>
     *         &lt;element name="customerAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfo2Type"/>
     *         &lt;element name="planType" type="{http://zakupki.gov.ru/223fz/conclusion/1}planType" minOccurs="0"/>
     *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "planVersion",
        "regNumber",
        "customerAgency",
        "planType",
        "year"
    })
    public static class Plan {

        protected long planVersion;
        protected String regNumber;
        @XmlElement(required = true)
        protected CustomerInfo2Type customerAgency;
        @XmlSchemaType(name = "string")
        protected PlanType planType;
        protected long year;

        /**
         * Gets the value of the planVersion property.
         * 
         */
        public long getPlanVersion() {
            return planVersion;
        }

        /**
         * Sets the value of the planVersion property.
         * 
         */
        public void setPlanVersion(long value) {
            this.planVersion = value;
        }

        /**
         * Gets the value of the regNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegNumber() {
            return regNumber;
        }

        /**
         * Sets the value of the regNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegNumber(String value) {
            this.regNumber = value;
        }

        /**
         * Gets the value of the customerAgency property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerInfo2Type }
         *     
         */
        public CustomerInfo2Type getCustomerAgency() {
            return customerAgency;
        }

        /**
         * Sets the value of the customerAgency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerInfo2Type }
         *     
         */
        public void setCustomerAgency(CustomerInfo2Type value) {
            this.customerAgency = value;
        }

        /**
         * Gets the value of the planType property.
         * 
         * @return
         *     possible object is
         *     {@link PlanType }
         *     
         */
        public PlanType getPlanType() {
            return planType;
        }

        /**
         * Sets the value of the planType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlanType }
         *     
         */
        public void setPlanType(PlanType value) {
            this.planType = value;
        }

        /**
         * Gets the value of the year property.
         * 
         */
        public long getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         */
        public void setYear(long value) {
            this.year = value;
        }

    }

}
