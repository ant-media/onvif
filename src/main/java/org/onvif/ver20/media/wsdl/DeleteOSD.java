
package org.onvif.ver20.media.wsdl;

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
 *         <element name="OSDToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "osdToken"
})
@XmlRootElement(name = "DeleteOSD")
public class DeleteOSD {

    /**
     * This element contains a reference to the OSD configuration that should be deleted.
     *
     */
    @XmlElement(name = "OSDToken", required = true)
    protected String osdToken;

    /**
     * This element contains a reference to the OSD configuration that should be deleted.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOSDToken() {
        return osdToken;
    }

    /**
     * Sets the value of the osdToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getOSDToken()
     */
    public void setOSDToken(String value) {
        this.osdToken = value;
    }

}
