
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RecordingEventFilter complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="RecordingEventFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Filter" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Topic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *                 <anyAttribute processContents='lax'/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Before" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         <element name="After" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
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
@XmlType(name = "RecordingEventFilter", propOrder = {
    "filter",
    "before",
    "after",
    "any"
})
public class RecordingEventFilter {

    @XmlElement(name = "Filter", required = true)
    protected List<RecordingEventFilter.Filter> filter;
    /**
     * Optional timespan to record before the actual event condition became active.
     *
     */
    @XmlElement(name = "Before")
    protected Duration before;
    /**
     * Optional timespan to record after the actual event condition becomes inactive.
     *
     */
    @XmlElement(name = "After")
    protected Duration after;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the filter property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFilter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingEventFilter.Filter }
     * </p>
     *
     *
     * @return
     *     The value of the filter property.
     */
    public List<RecordingEventFilter.Filter> getFilter() {
        if (filter == null) {
            filter = new ArrayList<>();
        }
        return this.filter;
    }

    /**
     * Optional timespan to record before the actual event condition became active.
     *
     * @return
     *     possible object is
     *     {@link Duration }
     *
     */
    public Duration getBefore() {
        return before;
    }

    /**
     * Sets the value of the before property.
     *
     * @param value
     *     allowed object is
     *     {@link Duration }
     *
     * @see #getBefore()
     */
    public void setBefore(Duration value) {
        this.before = value;
    }

    /**
     * Optional timespan to record after the actual event condition becomes inactive.
     *
     * @return
     *     possible object is
     *     {@link Duration }
     *
     */
    public Duration getAfter() {
        return after;
    }

    /**
     * Sets the value of the after property.
     *
     * @param value
     *     allowed object is
     *     {@link Duration }
     *
     * @see #getAfter()
     */
    public void setAfter(Duration value) {
        this.after = value;
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
     *         <element name="Topic" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "topic",
        "source",
        "any"
    })
    public static class Filter {

        /**
         * Topic filter as defined in section 9.6.3 of the ONVIF Core Specification.
         *
         */
        @XmlElement(name = "Topic", required = true)
        protected String topic;
        /**
         * Optional message source content filter as defined in section 9.4.4 of the ONVIF Core Specification.
         *
         */
        @XmlElement(name = "Source")
        protected String source;
        @XmlAnyElement(lax = true)
        protected List<java.lang.Object> any;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<>();

        /**
         * Topic filter as defined in section 9.6.3 of the ONVIF Core Specification.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTopic() {
            return topic;
        }

        /**
         * Sets the value of the topic property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         * @see #getTopic()
         */
        public void setTopic(String value) {
            this.topic = value;
        }

        /**
         * Optional message source content filter as defined in section 9.4.4 of the ONVIF Core Specification.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         * @see #getSource()
         */
        public void setSource(String value) {
            this.source = value;
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

}
