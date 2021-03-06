//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:07:00 PM CDT 
//


package com.dell.esg.icee.common.protocol.command.racadm.entity.chassis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for physicalDisk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="physicalDisk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="section_identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollupStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PowerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailurePredicted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsedRaidDiskSpace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableRaidDiskSpace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotspare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegotiatedSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapableSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManufacturedDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManufacturedWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManufacturedYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SasAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physicalDisk", propOrder = {
    "sectionIdentifier",
    "status",
    "rollupStatus",
    "name",
    "state",
    "operationState",
    "powerStatus",
    "size",
    "failurePredicted",
    "securityStatus",
    "busProtocol",
    "mediaType",
    "usedRaidDiskSpace",
    "availableRaidDiskSpace",
    "hotspare",
    "manufacturer",
    "productId",
    "revision",
    "serialNumber",
    "partNumber",
    "negotiatedSpeed",
    "capableSpeed",
    "manufacturedDay",
    "manufacturedWeek",
    "manufacturedYear",
    "sasAddress",
    "formFactor"
})
public class PhysicalDisk {

    @XmlElement(name = "section_identifier")
    protected String sectionIdentifier;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "RollupStatus")
    protected String rollupStatus;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "OperationState")
    protected String operationState;
    @XmlElement(name = "PowerStatus")
    protected String powerStatus;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "FailurePredicted")
    protected String failurePredicted;
    @XmlElement(name = "SecurityStatus")
    protected String securityStatus;
    @XmlElement(name = "BusProtocol")
    protected String busProtocol;
    @XmlElement(name = "MediaType")
    protected String mediaType;
    @XmlElement(name = "UsedRaidDiskSpace")
    protected String usedRaidDiskSpace;
    @XmlElement(name = "AvailableRaidDiskSpace")
    protected String availableRaidDiskSpace;
    @XmlElement(name = "Hotspare")
    protected String hotspare;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "NegotiatedSpeed")
    protected String negotiatedSpeed;
    @XmlElement(name = "CapableSpeed")
    protected String capableSpeed;
    @XmlElement(name = "ManufacturedDay")
    protected String manufacturedDay;
    @XmlElement(name = "ManufacturedWeek")
    protected String manufacturedWeek;
    @XmlElement(name = "ManufacturedYear")
    protected String manufacturedYear;
    @XmlElement(name = "SasAddress")
    protected String sasAddress;
    @XmlElement(name = "FormFactor")
    protected String formFactor;

    /**
     * Gets the value of the sectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionIdentifier() {
        return sectionIdentifier;
    }

    /**
     * Sets the value of the sectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionIdentifier(String value) {
        this.sectionIdentifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the rollupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollupStatus() {
        return rollupStatus;
    }

    /**
     * Sets the value of the rollupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollupStatus(String value) {
        this.rollupStatus = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the operationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationState() {
        return operationState;
    }

    /**
     * Sets the value of the operationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationState(String value) {
        this.operationState = value;
    }

    /**
     * Gets the value of the powerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerStatus() {
        return powerStatus;
    }

    /**
     * Sets the value of the powerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerStatus(String value) {
        this.powerStatus = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the failurePredicted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailurePredicted() {
        return failurePredicted;
    }

    /**
     * Sets the value of the failurePredicted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailurePredicted(String value) {
        this.failurePredicted = value;
    }

    /**
     * Gets the value of the securityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityStatus() {
        return securityStatus;
    }

    /**
     * Sets the value of the securityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityStatus(String value) {
        this.securityStatus = value;
    }

    /**
     * Gets the value of the busProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusProtocol() {
        return busProtocol;
    }

    /**
     * Sets the value of the busProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusProtocol(String value) {
        this.busProtocol = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the usedRaidDiskSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedRaidDiskSpace() {
        return usedRaidDiskSpace;
    }

    /**
     * Sets the value of the usedRaidDiskSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedRaidDiskSpace(String value) {
        this.usedRaidDiskSpace = value;
    }

    /**
     * Gets the value of the availableRaidDiskSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableRaidDiskSpace() {
        return availableRaidDiskSpace;
    }

    /**
     * Sets the value of the availableRaidDiskSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableRaidDiskSpace(String value) {
        this.availableRaidDiskSpace = value;
    }

    /**
     * Gets the value of the hotspare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotspare() {
        return hotspare;
    }

    /**
     * Sets the value of the hotspare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotspare(String value) {
        this.hotspare = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the negotiatedSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedSpeed() {
        return negotiatedSpeed;
    }

    /**
     * Sets the value of the negotiatedSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedSpeed(String value) {
        this.negotiatedSpeed = value;
    }

    /**
     * Gets the value of the capableSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapableSpeed() {
        return capableSpeed;
    }

    /**
     * Sets the value of the capableSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapableSpeed(String value) {
        this.capableSpeed = value;
    }

    /**
     * Gets the value of the manufacturedDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturedDay() {
        return manufacturedDay;
    }

    /**
     * Sets the value of the manufacturedDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturedDay(String value) {
        this.manufacturedDay = value;
    }

    /**
     * Gets the value of the manufacturedWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturedWeek() {
        return manufacturedWeek;
    }

    /**
     * Sets the value of the manufacturedWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturedWeek(String value) {
        this.manufacturedWeek = value;
    }

    /**
     * Gets the value of the manufacturedYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturedYear() {
        return manufacturedYear;
    }

    /**
     * Sets the value of the manufacturedYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturedYear(String value) {
        this.manufacturedYear = value;
    }

    /**
     * Gets the value of the sasAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSasAddress() {
        return sasAddress;
    }

    /**
     * Sets the value of the sasAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSasAddress(String value) {
        this.sasAddress = value;
    }

    /**
     * Gets the value of the formFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormFactor() {
        return formFactor;
    }

    /**
     * Sets the value of the formFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormFactor(String value) {
        this.formFactor = value;
    }

}
