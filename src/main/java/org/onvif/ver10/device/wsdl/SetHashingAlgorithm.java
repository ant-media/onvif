
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
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
 *         <element name="Algorithm" type="{http://www.onvif.org/ver10/schema}StringList"/>
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
    "algorithm"
})
@XmlRootElement(name = "SetHashingAlgorithm")
public class SetHashingAlgorithm {

    /**
     * Hashing algorithm(s) used in HTTP and RTSP Digest Authentication.
     *
     */
    @XmlList
    @XmlElement(name = "Algorithm", required = true)
    protected List<String> algorithm;

    /**
     * Hashing algorithm(s) used in HTTP and RTSP Digest Authentication.
     *
     * Gets the value of the algorithm property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algorithm property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAlgorithm().add(newItem);
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
     *     The value of the algorithm property.
     */
    public List<String> getAlgorithm() {
        if (algorithm == null) {
            algorithm = new ArrayList<>();
        }
        return this.algorithm;
    }

}
