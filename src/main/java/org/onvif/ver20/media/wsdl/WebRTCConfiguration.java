
package org.onvif.ver20.media.wsdl;

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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WebRTCConfiguration complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="WebRTCConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SignalingServer" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="CertPathValidationPolicyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AuthorizationServer" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="DefaultProfile" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Connected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "WebRTCConfiguration", propOrder = {
    "signalingServer",
    "certPathValidationPolicyID",
    "authorizationServer",
    "defaultProfile",
    "enabled",
    "connected",
    "error",
    "any"
})
public class WebRTCConfiguration {

    /**
     * The signaling server URI.
     *
     */
    @XmlElement(name = "SignalingServer", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String signalingServer;
    /**
     * If not configured, server certificate validation behavior is undefined and the device may either apply a vendor specific default validation policy or skip validation at all.
     *
     */
    @XmlElement(name = "CertPathValidationPolicyID")
    protected String certPathValidationPolicyID;
    /**
     * The Authorization Server to use for getting access tokens. This refers to an entity in the list of configured Authorization Servers in the [ONVIF Security Service Specification].
     *
     */
    @XmlElement(name = "AuthorizationServer", required = true)
    protected String authorizationServer;
    /**
     * The default media profile to use for streaming if no specific profile is specified when initializing a session.
     *
     */
    @XmlElement(name = "DefaultProfile", required = true)
    protected String defaultProfile;
    /**
     * Enables/disables the configuration.
     *
     */
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    /**
     * Indicates if the device is connected to the server. This parameter is read-only.
     *
     */
    @XmlElement(name = "Connected")
    protected Boolean connected;
    /**
     * Optional user readable error information (readonly).
     *
     */
    @XmlElement(name = "Error")
    protected String error;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The signaling server URI.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSignalingServer() {
        return signalingServer;
    }

    /**
     * Sets the value of the signalingServer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getSignalingServer()
     */
    public void setSignalingServer(String value) {
        this.signalingServer = value;
    }

    /**
     * If not configured, server certificate validation behavior is undefined and the device may either apply a vendor specific default validation policy or skip validation at all.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCertPathValidationPolicyID() {
        return certPathValidationPolicyID;
    }

    /**
     * Sets the value of the certPathValidationPolicyID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getCertPathValidationPolicyID()
     */
    public void setCertPathValidationPolicyID(String value) {
        this.certPathValidationPolicyID = value;
    }

    /**
     * The Authorization Server to use for getting access tokens. This refers to an entity in the list of configured Authorization Servers in the [ONVIF Security Service Specification].
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthorizationServer() {
        return authorizationServer;
    }

    /**
     * Sets the value of the authorizationServer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getAuthorizationServer()
     */
    public void setAuthorizationServer(String value) {
        this.authorizationServer = value;
    }

    /**
     * The default media profile to use for streaming if no specific profile is specified when initializing a session.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultProfile() {
        return defaultProfile;
    }

    /**
     * Sets the value of the defaultProfile property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getDefaultProfile()
     */
    public void setDefaultProfile(String value) {
        this.defaultProfile = value;
    }

    /**
     * Enables/disables the configuration.
     *
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     *
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Indicates if the device is connected to the server. This parameter is read-only.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     * @see #isConnected()
     */
    public void setConnected(Boolean value) {
        this.connected = value;
    }

    /**
     * Optional user readable error information (readonly).
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getError()
     */
    public void setError(String value) {
        this.error = value;
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
     * {@link Object }
     * {@link Element }
     * </p>
     *
     *
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
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
