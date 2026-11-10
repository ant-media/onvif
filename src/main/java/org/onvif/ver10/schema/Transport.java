
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Transport complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Transport">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Protocol" type="{http://www.onvif.org/ver10/schema}TransportProtocol"/>
 *         <element name="Tunnel" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transport", propOrder = {
    "protocol",
    "tunnel"
})
public class Transport {

    /**
     * Defines the network protocol for streaming, either UDP=RTP/UDP, RTSP=RTP/RTSP/TCP or HTTP=RTP/RTSP/HTTP/TCP.
     *
     */
    @XmlElement(name = "Protocol", required = true)
    @XmlSchemaType(name = "string")
    protected TransportProtocol protocol;
    /**
     * Deprecated: optional element to describe further tunnel options.
     *
     */
    @XmlElement(name = "Tunnel")
    protected Transport.Tunnel tunnel;

    /**
     * Defines the network protocol for streaming, either UDP=RTP/UDP, RTSP=RTP/RTSP/TCP or HTTP=RTP/RTSP/HTTP/TCP.
     *
     * @return
     *     possible object is
     *     {@link TransportProtocol }
     *
     */
    public TransportProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     *
     * @param value
     *     allowed object is
     *     {@link TransportProtocol }
     *
     * @see #getProtocol()
     */
    public void setProtocol(TransportProtocol value) {
        this.protocol = value;
    }

    /**
     * Deprecated: optional element to describe further tunnel options.
     *
     * @return
     *     possible object is
     *     {@link Transport.Tunnel }
     *
     */
    public Transport.Tunnel getTunnel() {
        return tunnel;
    }

    /**
     * Sets the value of the tunnel property.
     *
     * @param value
     *     allowed object is
     *     {@link Transport.Tunnel }
     *
     * @see #getTunnel()
     */
    public void setTunnel(Transport.Tunnel value) {
        this.tunnel = value;
    }


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
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Tunnel {

        @XmlAnyElement(lax = true)
        protected List<java.lang.Object> any;

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

}
