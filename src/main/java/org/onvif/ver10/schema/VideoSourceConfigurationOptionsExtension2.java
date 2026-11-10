
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
 * <p>Java class for VideoSourceConfigurationOptionsExtension2 complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="VideoSourceConfigurationOptionsExtension2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SceneOrientationMode" type="{http://www.onvif.org/ver10/schema}SceneOrientationMode" maxOccurs="unbounded" minOccurs="0"/>
 *         <any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationOptionsExtension2", propOrder = {
    "sceneOrientationMode",
    "any"
})
public class VideoSourceConfigurationOptionsExtension2 {

    /**
     * Scene orientation modes supported by the device for this configuration.
     *
     */
    @XmlElement(name = "SceneOrientationMode")
    @XmlSchemaType(name = "string")
    protected List<SceneOrientationMode> sceneOrientationMode;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * Scene orientation modes supported by the device for this configuration.
     *
     * Gets the value of the sceneOrientationMode property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sceneOrientationMode property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSceneOrientationMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SceneOrientationMode }
     * </p>
     *
     *
     * @return
     *     The value of the sceneOrientationMode property.
     */
    public List<SceneOrientationMode> getSceneOrientationMode() {
        if (sceneOrientationMode == null) {
            sceneOrientationMode = new ArrayList<>();
        }
        return this.sceneOrientationMode;
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
