
package org.onvif.ver10.schema;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An object state describes an object's condition, for e.g position, speed and appearance, at a certain time instance.
 *
 * <p>Java class for ObjectState complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ObjectState">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}Object">
 *       <attribute name="CaptureTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectState")
public class ObjectState
    extends Object
{

    @XmlAttribute(name = "CaptureTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar captureTime;

    /**
     * Gets the value of the captureTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCaptureTime() {
        return captureTime;
    }

    /**
     * Sets the value of the captureTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCaptureTime(XMLGregorianCalendar value) {
        this.captureTime = value;
    }

}
