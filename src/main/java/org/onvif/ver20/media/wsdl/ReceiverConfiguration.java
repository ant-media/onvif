
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverConfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ReceiverConfiguration">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/schema}ReceiverConfiguration">
 *       <attribute name="token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverConfiguration")
public class ReceiverConfiguration
    extends org.onvif.ver10.schema.ReceiverConfiguration
{

    @XmlAttribute(name = "token")
    protected String token;

    /**
     * Gets the value of the token property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToken(String value) {
        this.token = value;
    }

}
