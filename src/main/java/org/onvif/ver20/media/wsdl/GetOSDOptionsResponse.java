
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfigurationOptions;


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
 *         <element name="OSDOptions" type="{http://www.onvif.org/ver10/schema}OSDConfigurationOptions"/>
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
    "osdOptions"
})
@XmlRootElement(name = "GetOSDOptionsResponse")
public class GetOSDOptionsResponse {

    @XmlElement(name = "OSDOptions", required = true)
    protected OSDConfigurationOptions osdOptions;

    /**
     * Gets the value of the osdOptions property.
     *
     * @return
     *     possible object is
     *     {@link OSDConfigurationOptions }
     *
     */
    public OSDConfigurationOptions getOSDOptions() {
        return osdOptions;
    }

    /**
     * Sets the value of the osdOptions property.
     *
     * @param value
     *     allowed object is
     *     {@link OSDConfigurationOptions }
     *
     */
    public void setOSDOptions(OSDConfigurationOptions value) {
        this.osdOptions = value;
    }

}
