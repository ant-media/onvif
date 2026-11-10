
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoSourceConfigurationExtension complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="VideoSourceConfigurationExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rotate" type="{http://www.onvif.org/ver10/schema}Rotate" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceConfigurationExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationExtension", propOrder = {
    "rotate",
    "extension"
})
public class VideoSourceConfigurationExtension {

    /**
     * Optional element to configure rotation of captured image.
     * 						What resolutions a device supports shall be unaffected by the Rotate parameters.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     *
     * 						If a device is configured with Rotate=AUTO, the device shall take control over the Degree parameter and automatically update it so that a client can query current rotation.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     *
     * 						The device shall automatically apply the same rotation to its pan/tilt control direction depending on the following condition:
     * 						if Reverse=AUTO in PTControlDirection or if the device doesn't support Reverse in PTControlDirection
     *
     */
    @XmlElement(name = "Rotate")
    protected Rotate rotate;
    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationExtension2 extension;

    /**
     * Optional element to configure rotation of captured image.
     * 						What resolutions a device supports shall be unaffected by the Rotate parameters.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     *
     * 						If a device is configured with Rotate=AUTO, the device shall take control over the Degree parameter and automatically update it so that a client can query current rotation.
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     *
     * 						The device shall automatically apply the same rotation to its pan/tilt control direction depending on the following condition:
     * 						if Reverse=AUTO in PTControlDirection or if the device doesn't support Reverse in PTControlDirection
     *
     * @return
     *     possible object is
     *     {@link Rotate }
     *
     */
    public Rotate getRotate() {
        return rotate;
    }

    /**
     * Sets the value of the rotate property.
     *
     * @param value
     *     allowed object is
     *     {@link Rotate }
     *
     * @see #getRotate()
     */
    public void setRotate(Rotate value) {
        this.rotate = value;
    }

    /**
     * Gets the value of the extension property.
     *
     * @return
     *     possible object is
     *     {@link VideoSourceConfigurationExtension2 }
     *
     */
    public VideoSourceConfigurationExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     *
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfigurationExtension2 }
     *
     */
    public void setExtension(VideoSourceConfigurationExtension2 value) {
        this.extension = value;
    }

}
