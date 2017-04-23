
package org.uber.main;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cluster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cluster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centroidLatitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="centroidLongitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="crowdCount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="crowdDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="drivers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cluster", propOrder = {
    "centroidLatitude",
    "centroidLongitude",
    "crowdCount",
    "crowdDensity",
    "drivers"
})
public class Cluster {

    protected Double centroidLatitude;
    protected Double centroidLongitude;
    protected Double crowdCount;
    protected Double crowdDensity;
    protected Integer drivers;

    /**
     * Gets the value of the centroidLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCentroidLatitude() {
        return centroidLatitude;
    }

    /**
     * Sets the value of the centroidLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCentroidLatitude(Double value) {
        this.centroidLatitude = value;
    }

    /**
     * Gets the value of the centroidLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCentroidLongitude() {
        return centroidLongitude;
    }

    /**
     * Sets the value of the centroidLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCentroidLongitude(Double value) {
        this.centroidLongitude = value;
    }

    /**
     * Gets the value of the crowdCount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrowdCount() {
        return crowdCount;
    }

    /**
     * Sets the value of the crowdCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrowdCount(Double value) {
        this.crowdCount = value;
    }

    /**
     * Gets the value of the crowdDensity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCrowdDensity() {
        return crowdDensity;
    }

    /**
     * Sets the value of the crowdDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCrowdDensity(Double value) {
        this.crowdDensity = value;
    }

    /**
     * Gets the value of the drivers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrivers() {
        return drivers;
    }

    /**
     * Sets the value of the drivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrivers(Integer value) {
        this.drivers = value;
    }

}
