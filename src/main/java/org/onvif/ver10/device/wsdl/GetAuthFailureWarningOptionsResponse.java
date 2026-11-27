
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.IntRange;


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
 *         <element name="MonitorPeriodRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="AuthFailureRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
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
    "monitorPeriodRange",
    "authFailureRange"
})
@XmlRootElement(name = "GetAuthFailureWarningOptionsResponse")
public class GetAuthFailureWarningOptionsResponse {

    @XmlElement(name = "MonitorPeriodRange", required = true)
    protected IntRange monitorPeriodRange;
    @XmlElement(name = "AuthFailureRange", required = true)
    protected IntRange authFailureRange;

    /**
     * Gets the value of the monitorPeriodRange property.
     *
     * @return
     *     possible object is
     *     {@link IntRange }
     *
     */
    public IntRange getMonitorPeriodRange() {
        return monitorPeriodRange;
    }

    /**
     * Sets the value of the monitorPeriodRange property.
     *
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *
     */
    public void setMonitorPeriodRange(IntRange value) {
        this.monitorPeriodRange = value;
    }

    /**
     * Gets the value of the authFailureRange property.
     *
     * @return
     *     possible object is
     *     {@link IntRange }
     *
     */
    public IntRange getAuthFailureRange() {
        return authFailureRange;
    }

    /**
     * Sets the value of the authFailureRange property.
     *
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *
     */
    public void setAuthFailureRange(IntRange value) {
        this.authFailureRange = value;
    }

}
