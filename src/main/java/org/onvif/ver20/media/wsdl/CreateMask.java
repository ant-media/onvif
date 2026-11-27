
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
 *         <element name="Mask" type="{http://www.onvif.org/ver20/media/wsdl}Mask"/>
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
    "mask"
})
@XmlRootElement(name = "CreateMask")
public class CreateMask {

    /**
     * Contain the initial mask configuration for create.
     *
     */
    @XmlElement(name = "Mask", required = true)
    protected Mask mask;

    /**
     * Contain the initial mask configuration for create.
     *
     * @return
     *     possible object is
     *     {@link Mask }
     *
     */
    public Mask getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     *
     * @param value
     *     allowed object is
     *     {@link Mask }
     *
     * @see #getMask()
     */
    public void setMask(Mask value) {
        this.mask = value;
    }

}
