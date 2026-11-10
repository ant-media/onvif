
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MonitorPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MaxAuthFailures" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enabled",
    "monitorPeriod",
    "maxAuthFailures"
})
@XmlRootElement(name = "SetAuthFailureWarningConfiguration")
public class SetAuthFailureWarningConfiguration {

    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "MonitorPeriod")
    protected int monitorPeriod;
    @XmlElement(name = "MaxAuthFailures")
    protected int maxAuthFailures;

    /**
     * Gets the value of the enabled property.
     *
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     *
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the monitorPeriod property.
     *
     */
    public int getMonitorPeriod() {
        return monitorPeriod;
    }

    /**
     * Sets the value of the monitorPeriod property.
     *
     */
    public void setMonitorPeriod(int value) {
        this.monitorPeriod = value;
    }

    /**
     * Gets the value of the maxAuthFailures property.
     *
     */
    public int getMaxAuthFailures() {
        return maxAuthFailures;
    }

    /**
     * Sets the value of the maxAuthFailures property.
     *
     */
    public void setMaxAuthFailures(int value) {
        this.maxAuthFailures = value;
    }

}
