
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MulticastReceiverConfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="MulticastReceiverConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Address" type="{http://www.onvif.org/ver10/schema}IPAddress"/>
 *         <element name="Port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TTL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="InterfaceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SourceSpecificMulticast" type="{http://www.onvif.org/ver10/schema}IPAddress" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MulticastReceiverConfiguration", propOrder = {
    "address",
    "port",
    "ttl",
    "interfaceToken",
    "sourceSpecificMulticast",
    "any"
})
public class MulticastReceiverConfiguration {

    /**
     * The multicast address (if this address is set to 0 no multicast streaming is enabled)
     *
     */
    @XmlElement(name = "Address", required = true)
    protected IPAddress address;
    /**
     * The RTP multicast destination port. A device may support RTCP. In this case the port value shall be even to allow the corresponding RTCP stream to be mapped to the next higher (odd) destination port number as defined in the RTSP specification.
     *
     */
    @XmlElement(name = "Port")
    protected int port;
    /**
     * In case of IPv6 the TTL value is assumed as the hop limit. Note that for IPV6 and administratively scoped IPv4 multicast the primary use for hop limit / TTL is to prevent packets from (endlessly) circulating and not limiting scope. In these cases the address contains the scope.
     *
     */
    @XmlElement(name = "TTL")
    protected int ttl;
    /**
     * Unique identifier of the network interface on the device. If not specified, all available interfaces will be used for listening.
     *
     */
    @XmlElement(name = "InterfaceToken")
    protected List<String> interfaceToken;
    /**
     * When a source-specific multicast address is configured, the device will process multicast data only from the specified source, in accordance with SSM principles defined in RFC 4607.
     *
     */
    @XmlElement(name = "SourceSpecificMulticast")
    protected IPAddress sourceSpecificMulticast;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The multicast address (if this address is set to 0 no multicast streaming is enabled)
     *
     * @return
     *     possible object is
     *     {@link IPAddress }
     *
     */
    public IPAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link IPAddress }
     *
     * @see #getAddress()
     */
    public void setAddress(IPAddress value) {
        this.address = value;
    }

    /**
     * The RTP multicast destination port. A device may support RTCP. In this case the port value shall be even to allow the corresponding RTCP stream to be mapped to the next higher (odd) destination port number as defined in the RTSP specification.
     *
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     *
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * In case of IPv6 the TTL value is assumed as the hop limit. Note that for IPV6 and administratively scoped IPv4 multicast the primary use for hop limit / TTL is to prevent packets from (endlessly) circulating and not limiting scope. In these cases the address contains the scope.
     *
     */
    public int getTTL() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     *
     */
    public void setTTL(int value) {
        this.ttl = value;
    }

    /**
     * Unique identifier of the network interface on the device. If not specified, all available interfaces will be used for listening.
     *
     * Gets the value of the interfaceToken property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceToken property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInterfaceToken().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     *
     * @return
     *     The value of the interfaceToken property.
     */
    public List<String> getInterfaceToken() {
        if (interfaceToken == null) {
            interfaceToken = new ArrayList<>();
        }
        return this.interfaceToken;
    }

    /**
     * When a source-specific multicast address is configured, the device will process multicast data only from the specified source, in accordance with SSM principles defined in RFC 4607.
     *
     * @return
     *     possible object is
     *     {@link IPAddress }
     *
     */
    public IPAddress getSourceSpecificMulticast() {
        return sourceSpecificMulticast;
    }

    /**
     * Sets the value of the sourceSpecificMulticast property.
     *
     * @param value
     *     allowed object is
     *     {@link IPAddress }
     *
     * @see #getSourceSpecificMulticast()
     */
    public void setSourceSpecificMulticast(IPAddress value) {
        this.sourceSpecificMulticast = value;
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

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
