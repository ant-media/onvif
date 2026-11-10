
package org.onvif.ver20.analytics.humanface;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ColorDescriptor;


/**
 * <p>Java class for Hair complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Hair">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Style" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}ColorDescriptor" minOccurs="0"/>
 *         <element name="Bangs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hair", propOrder = {
    "length",
    "style",
    "color",
    "bangs"
})
public class Hair {

    /**
     * Describe the length of the Hair, acceptable values are defined in fc:Length. Short usually means that the end of the hair doesn’t exceed the shoulder.
     * 								Medium usually means that the end of the hair is parallel with the shoulder. Long usually means that the end of the hair exceeds the chest.
     *
     */
    @XmlElement(name = "Length")
    protected String length;
    /**
     * Describe the style of the Hair, acceptable values are defined in fc:HairStyle.
     *
     */
    @XmlElement(name = "Style")
    protected String style;
    /**
     * Describe the color of the Hair.
     *
     */
    @XmlElement(name = "Color")
    protected ColorDescriptor color;
    /**
     * Describe the bangs of the Hair
     *
     */
    @XmlElement(name = "Bangs")
    protected Boolean bangs;

    /**
     * Describe the length of the Hair, acceptable values are defined in fc:Length. Short usually means that the end of the hair doesn’t exceed the shoulder.
     * 								Medium usually means that the end of the hair is parallel with the shoulder. Long usually means that the end of the hair exceeds the chest.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getLength()
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Describe the style of the Hair, acceptable values are defined in fc:HairStyle.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getStyle()
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Describe the color of the Hair.
     *
     * @return
     *     possible object is
     *     {@link ColorDescriptor }
     *
     */
    public ColorDescriptor getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link ColorDescriptor }
     *
     * @see #getColor()
     */
    public void setColor(ColorDescriptor value) {
        this.color = value;
    }

    /**
     * Describe the bangs of the Hair
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isBangs() {
        return bangs;
    }

    /**
     * Sets the value of the bangs property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isBangs()
     */
    public void setBangs(Boolean value) {
        this.bangs = value;
    }

}
