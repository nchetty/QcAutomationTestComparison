
package com.ebscohost.services.core._2010._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDatabaseLimiters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDatabaseLimiters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatabaseLimiters" type="{http://www.ebscohost.com/services/core/2010/05}DatabaseLimiters" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatabaseLimiters", propOrder = {
    "databaseLimiters"
})
public class ArrayOfDatabaseLimiters {

    @XmlElement(name = "DatabaseLimiters", nillable = true)
    protected List<DatabaseLimiters> databaseLimiters;

    /**
     * Gets the value of the databaseLimiters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databaseLimiters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabaseLimiters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabaseLimiters }
     * 
     * 
     */
    public List<DatabaseLimiters> getDatabaseLimiters() {
        if (databaseLimiters == null) {
            databaseLimiters = new ArrayList<DatabaseLimiters>();
        }
        return this.databaseLimiters;
    }

}
