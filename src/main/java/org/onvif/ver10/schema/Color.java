
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Color complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="Color">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Z" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Colorspace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="Likelihood" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Color")
public class Color {

    @XmlAttribute(name = "X", required = true)
    protected float x;
    @XmlAttribute(name = "Y", required = true)
    protected float y;
    @XmlAttribute(name = "Z", required = true)
    protected float z;
    /**
     * Acceptable values:
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/YCbCr - YCbCr
     * 							&lt;ul&gt;&lt;li&gt;X attribute = Y value&lt;/li&gt;
     * 								&lt;li&gt;Y attribute = Cb value&lt;/li&gt;
     * 								&lt;li&gt;Z attribute = Cr value&lt;/li&gt;&lt;/ul&gt;
     * 						&lt;/li&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/RGB - RGB
     * 							&lt;ul&gt;&lt;li&gt;X attribute = R value&lt;/li&gt;
     * 								&lt;li&gt;Y attribute = G value&lt;/li&gt;
     * 								&lt;li&gt;Z attribute = B value&lt;/li&gt;&lt;/ul&gt;
     * 						&lt;/li&gt;
     * 					&lt;/ul&gt;
     * </pre>
     *
     * 					If the Colorspace attribute is absent and not defined on higher level, YCbCr is implied.
     *
     * 					Deprecated values:
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/CIELUV - CIE LUV&lt;/li&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/CIELAB - CIE 1976 (L*a*b*)&lt;/li&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/HSV - HSV&lt;/li&gt;
     * 					&lt;/ul&gt;
     * </pre>
     *
     */
    @XmlAttribute(name = "Colorspace")
    @XmlSchemaType(name = "anyURI")
    protected String colorspace;
    /**
     * Likelihood that the color is correct.
     *
     */
    @XmlAttribute(name = "Likelihood")
    protected Float likelihood;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the x property.
     *
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     *
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     *
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     *
     */
    public void setY(float value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     *
     */
    public float getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     *
     */
    public void setZ(float value) {
        this.z = value;
    }

    /**
     * Acceptable values:
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/YCbCr - YCbCr
     * 							&lt;ul&gt;&lt;li&gt;X attribute = Y value&lt;/li&gt;
     * 								&lt;li&gt;Y attribute = Cb value&lt;/li&gt;
     * 								&lt;li&gt;Z attribute = Cr value&lt;/li&gt;&lt;/ul&gt;
     * 						&lt;/li&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/RGB - RGB
     * 							&lt;ul&gt;&lt;li&gt;X attribute = R value&lt;/li&gt;
     * 								&lt;li&gt;Y attribute = G value&lt;/li&gt;
     * 								&lt;li&gt;Z attribute = B value&lt;/li&gt;&lt;/ul&gt;
     * 						&lt;/li&gt;
     * 					&lt;/ul&gt;
     * </pre>
     *
     * 					If the Colorspace attribute is absent and not defined on higher level, YCbCr is implied.
     *
     * 					Deprecated values:
     *
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/CIELUV - CIE LUV&lt;/li&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/CIELAB - CIE 1976 (L*a*b*)&lt;/li&gt;
     * 						&lt;li&gt;http://www.onvif.org/ver10/colorspace/HSV - HSV&lt;/li&gt;
     * 					&lt;/ul&gt;
     * </pre>
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColorspace() {
        return colorspace;
    }

    /**
     * Sets the value of the colorspace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getColorspace()
     */
    public void setColorspace(String value) {
        this.colorspace = value;
    }

    /**
     * Likelihood that the color is correct.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getLikelihood() {
        return likelihood;
    }

    /**
     * Sets the value of the likelihood property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     * @see #getLikelihood()
     */
    public void setLikelihood(Float value) {
        this.likelihood = value;
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
