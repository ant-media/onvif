
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PTZStream complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="PTZStream">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZStatus"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZStreamExtension"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZStream", propOrder = {
    "ptzStatusOrExtensionOrAny"
})
public class PTZStream {

    @XmlElementRefs({
        @XmlElementRef(name = "PTZStatus", namespace = "http://www.onvif.org/ver10/schema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Extension", namespace = "http://www.onvif.org/ver10/schema", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> ptzStatusOrExtensionOrAny;

    /**
     * Gets the value of the ptzStatusOrExtensionOrAny property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptzStatusOrExtensionOrAny property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPTZStatusOrExtensionOrAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PTZStatus }{@code >}
     * {@link JAXBElement }{@code <}{@link PTZStreamExtension }{@code >}
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     *
     *
     * @return
     *     The value of the ptzStatusOrExtensionOrAny property.
     */
    public List<java.lang.Object> getPTZStatusOrExtensionOrAny() {
        if (ptzStatusOrExtensionOrAny == null) {
            ptzStatusOrExtensionOrAny = new ArrayList<>();
        }
        return this.ptzStatusOrExtensionOrAny;
    }

}
