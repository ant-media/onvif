
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfiguration;


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
 *         <element name="OSD" type="{http://www.onvif.org/ver10/schema}OSDConfiguration"/>
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
    "osd"
})
@XmlRootElement(name = "CreateOSD")
public class CreateOSD {

    /**
     * Contain the initial OSD configuration for create.
     *
     */
    @XmlElement(name = "OSD", required = true)
    protected OSDConfiguration osd;

    /**
     * Contain the initial OSD configuration for create.
     *
     * @return
     *     possible object is
     *     {@link OSDConfiguration }
     *
     */
    public OSDConfiguration getOSD() {
        return osd;
    }

    /**
     * Sets the value of the osd property.
     *
     * @param value
     *     allowed object is
     *     {@link OSDConfiguration }
     *
     * @see #getOSD()
     */
    public void setOSD(OSDConfiguration value) {
        this.osd = value;
    }

}
