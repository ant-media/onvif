
package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for TransportProtocol</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TransportProtocol">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RtspUnicast"/>
 *     <enumeration value="RtspMulticast"/>
 *     <enumeration value="RtspsUnicast"/>
 *     <enumeration value="RtspsMulticast"/>
 *     <enumeration value="RTSP"/>
 *     <enumeration value="RtspOverHttp"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "TransportProtocol")
@XmlEnum
public enum TransportProtocol {

    @XmlEnumValue("RtspUnicast")
    RTSP_UNICAST("RtspUnicast"),
    @XmlEnumValue("RtspMulticast")
    RTSP_MULTICAST("RtspMulticast"),
    @XmlEnumValue("RtspsUnicast")
    RTSPS_UNICAST("RtspsUnicast"),
    @XmlEnumValue("RtspsMulticast")
    RTSPS_MULTICAST("RtspsMulticast"),
    RTSP("RTSP"),
    @XmlEnumValue("RtspOverHttp")
    RTSP_OVER_HTTP("RtspOverHttp");
    private final String value;

    TransportProtocol(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     *
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     *
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TransportProtocol fromValue(String v) {
        for (TransportProtocol c: TransportProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
