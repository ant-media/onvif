
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
 * <p>Java class for ClassCandidate complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="ClassCandidate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}ClassType"/>
 *         <element name="Likelihood" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "ClassCandidate", propOrder = {
    "type",
    "likelihood",
    "any"
})
public class ClassCandidate {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected ClassType type;
    @XmlElement(name = "Likelihood")
    protected float likelihood;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link ClassType }
     *
     */
    public ClassType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link ClassType }
     *
     */
    public void setType(ClassType value) {
        this.type = value;
    }

    /**
     * Gets the value of the likelihood property.
     *
     */
    public float getLikelihood() {
        return likelihood;
    }

    /**
     * Sets the value of the likelihood property.
     *
     */
    public void setLikelihood(float value) {
        this.likelihood = value;
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
