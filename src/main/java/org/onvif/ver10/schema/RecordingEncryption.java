
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * <p>Java class for RecordingEncryption complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RecordingEncryption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Key" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         <element name="Track" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AsymmetricEncryption" type="{http://www.onvif.org/ver10/schema}AsymmetricEncryption" minOccurs="0"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Mode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordingEncryption", propOrder = {
    "kid",
    "key",
    "track",
    "asymmetricEncryption",
    "any"
})
public class RecordingEncryption {

    /**
     * Key ID of the associated key for encryption, formatted as a UUID according to RFC 9562 Section 4. The client shall omit this parameter when AsymmetricEncryption is configured.
     *
     */
    @XmlElement(name = "KID")
    protected String kid;
    /**
     * Key for encrypting content. The client shall omit this parameter when AsymmetricEncryption is configured.
     * 						The device shall not include this parameter when reading.
     *
     */
    @XmlElement(name = "Key", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] key;
    /**
     * Optional list of track tokens to be encrypted.
     * 						If no track tokens are specified, all tracks are encrypted and no other encryption configurations shall exist for the recording.
     * 						Each track shall only be contained in one encryption configuration.
     *
     */
    @XmlElement(name = "Track")
    protected List<String> track;
    @XmlElement(name = "AsymmetricEncryption")
    protected AsymmetricEncryption asymmetricEncryption;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Mode of encryption.
     * 					See tt:EncryptionMode for a list of definitions and capability trc:SupportedEncryptionModes for the supported encryption modes.
     *
     */
    @XmlAttribute(name = "Mode", required = true)
    protected String mode;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Key ID of the associated key for encryption, formatted as a UUID according to RFC 9562 Section 4. The client shall omit this parameter when AsymmetricEncryption is configured.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKID() {
        return kid;
    }

    /**
     * Sets the value of the kid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getKID()
     */
    public void setKID(String value) {
        this.kid = value;
    }

    /**
     * Key for encrypting content. The client shall omit this parameter when AsymmetricEncryption is configured.
     * 						The device shall not include this parameter when reading.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public byte[] getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getKey()
     */
    public void setKey(byte[] value) {
        this.key = value;
    }

    /**
     * Optional list of track tokens to be encrypted.
     * 						If no track tokens are specified, all tracks are encrypted and no other encryption configurations shall exist for the recording.
     * 						Each track shall only be contained in one encryption configuration.
     *
     * Gets the value of the track property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the track property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTrack().add(newItem);
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
     *     The value of the track property.
     */
    public List<String> getTrack() {
        if (track == null) {
            track = new ArrayList<>();
        }
        return this.track;
    }

    /**
     * Gets the value of the asymmetricEncryption property.
     *
     * @return
     *     possible object is
     *     {@link AsymmetricEncryption }
     *
     */
    public AsymmetricEncryption getAsymmetricEncryption() {
        return asymmetricEncryption;
    }

    /**
     * Sets the value of the asymmetricEncryption property.
     *
     * @param value
     *     allowed object is
     *     {@link AsymmetricEncryption }
     *
     */
    public void setAsymmetricEncryption(AsymmetricEncryption value) {
        this.asymmetricEncryption = value;
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
     * Mode of encryption.
     * 					See tt:EncryptionMode for a list of definitions and capability trc:SupportedEncryptionModes for the supported encryption modes.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getMode()
     */
    public void setMode(String value) {
        this.mode = value;
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
