
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for FrequencyDecibelPair complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="FrequencyDecibelPair">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CenterFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Decibel" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyDecibelPair", propOrder = {
    "centerFrequency",
    "decibel",
    "any"
})
public class FrequencyDecibelPair {

    /**
     * The center frequency of the band in hertz (Readonly). For example, value of 1000 refers to 1kHz and 2000 refers to 2kHz.
     *
     */
    @XmlElement(name = "CenterFrequency")
    protected int centerFrequency;
    /**
     * Decibel value associated with the center frequency.
     *
     */
    @XmlElement(name = "Decibel")
    protected float decibel;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * The center frequency of the band in hertz (Readonly). For example, value of 1000 refers to 1kHz and 2000 refers to 2kHz.
     *
     */
    public int getCenterFrequency() {
        return centerFrequency;
    }

    /**
     * Sets the value of the centerFrequency property.
     *
     */
    public void setCenterFrequency(int value) {
        this.centerFrequency = value;
    }

    /**
     * Decibel value associated with the center frequency.
     *
     */
    public float getDecibel() {
        return decibel;
    }

    /**
     * Sets the value of the decibel property.
     *
     */
    public void setDecibel(float value) {
        this.decibel = value;
    }

    /**
     * Gets the value of the any property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     *
     *
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

}
