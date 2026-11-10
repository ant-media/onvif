
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
 *         <element name="Options" type="{http://www.onvif.org/ver20/media/wsdl}MaskOptions"/>
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
    "options"
})
@XmlRootElement(name = "GetMaskOptionsResponse")
public class GetMaskOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected MaskOptions options;

    /**
     * Gets the value of the options property.
     *
     * @return
     *     possible object is
     *     {@link MaskOptions }
     *
     */
    public MaskOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     *
     * @param value
     *     allowed object is
     *     {@link MaskOptions }
     *
     */
    public void setOptions(MaskOptions value) {
        this.options = value;
    }

}
