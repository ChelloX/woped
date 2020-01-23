//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.18 at 08:57:29 AM CEST 
//


package org.woped.file.yawl.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourcingPrivilegesFactsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourcingPrivilegesFactsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="privilege" maxOccurs="7" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.yawlfoundation.org/yawlschema}ResourcingPrivilegeType"/>
 *                   &lt;choice>
 *                     &lt;element name="allowall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="set" type="{http://www.yawlfoundation.org/yawlschema}ResourcingSetFactsType"/>
 *                   &lt;/choice>
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
@XmlType(name = "ResourcingPrivilegesFactsType", propOrder = {
    "privilege"
})
public class ResourcingPrivilegesFactsType {

    protected List<ResourcingPrivilegesFactsType.Privilege> privilege;

    /**
     * Gets the value of the privilege property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privilege property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivilege().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourcingPrivilegesFactsType.Privilege }
     * 
     * 
     */
    public List<ResourcingPrivilegesFactsType.Privilege> getPrivilege() {
        if (privilege == null) {
            privilege = new ArrayList<ResourcingPrivilegesFactsType.Privilege>();
        }
        return this.privilege;
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
     *         &lt;element name="name" type="{http://www.yawlfoundation.org/yawlschema}ResourcingPrivilegeType"/>
     *         &lt;choice>
     *           &lt;element name="allowall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           &lt;element name="set" type="{http://www.yawlfoundation.org/yawlschema}ResourcingSetFactsType"/>
     *         &lt;/choice>
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
        "name",
        "allowall",
        "set"
    })
    public static class Privilege {

        @XmlElement(required = true)
        protected ResourcingPrivilegeType name;
        protected Boolean allowall;
        protected ResourcingSetFactsType set;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link ResourcingPrivilegeType }
         *     
         */
        public ResourcingPrivilegeType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResourcingPrivilegeType }
         *     
         */
        public void setName(ResourcingPrivilegeType value) {
            this.name = value;
        }

        /**
         * Gets the value of the allowall property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowall() {
            return allowall;
        }

        /**
         * Sets the value of the allowall property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowall(Boolean value) {
            this.allowall = value;
        }

        /**
         * Gets the value of the set property.
         * 
         * @return
         *     possible object is
         *     {@link ResourcingSetFactsType }
         *     
         */
        public ResourcingSetFactsType getSet() {
            return set;
        }

        /**
         * Sets the value of the set property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResourcingSetFactsType }
         *     
         */
        public void setSet(ResourcingSetFactsType value) {
            this.set = value;
        }

    }

}
