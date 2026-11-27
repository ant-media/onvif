
package org.onvif.ver20.media.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="WebRTCConfiguration" type="{http://www.onvif.org/ver20/media/wsdl}WebRTCConfiguration" maxOccurs="unbounded" minOccurs="0"/>
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
    "webRTCConfiguration"
})
@XmlRootElement(name = "SetWebRTCConfigurations")
public class SetWebRTCConfigurations {

    /**
     * This message contains the WebRTC configurations to use for the device. If empty, existing WebRTC configurations are deleted.
     *
     */
    @XmlElement(name = "WebRTCConfiguration")
    protected List<WebRTCConfiguration> webRTCConfiguration;

    /**
     * This message contains the WebRTC configurations to use for the device. If empty, existing WebRTC configurations are deleted.
     *
     * Gets the value of the webRTCConfiguration property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webRTCConfiguration property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWebRTCConfiguration().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebRTCConfiguration }
     * </p>
     *
     *
     * @return
     *     The value of the webRTCConfiguration property.
     */
    public List<WebRTCConfiguration> getWebRTCConfiguration() {
        if (webRTCConfiguration == null) {
            webRTCConfiguration = new ArrayList<>();
        }
        return this.webRTCConfiguration;
    }

}
