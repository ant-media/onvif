
package org.onvif.ver10.schema;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectId complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ObjectId">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectId")
@XmlSeeAlso({
    Object.class
})
public class ObjectId {

    @XmlAttribute(name = "ObjectId")
    protected BigInteger objectId;
    /**
     * Object unique identifier.
     *
     */
    @XmlAttribute(name = "UUID")
    protected String uuid;

    /**
     * Gets the value of the objectId property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setObjectId(BigInteger value) {
        this.objectId = value;
    }

    /**
     * Object unique identifier.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @see #getUUID()
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

}
