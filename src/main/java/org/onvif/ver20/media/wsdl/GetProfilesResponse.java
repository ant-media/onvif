
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
 *         <element name="Profiles" type="{http://www.onvif.org/ver20/media/wsdl}MediaProfile" maxOccurs="unbounded" minOccurs="0"/>
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
    "profiles"
})
@XmlRootElement(name = "GetProfilesResponse")
public class GetProfilesResponse {

    /**
     * Lists all profiles that exist in the media service. The response provides the requested types of Configurations as far as available.
     * 									If a profile doesn't contain a type no error shall be provided.
     *
     */
    @XmlElement(name = "Profiles")
    protected List<MediaProfile> profiles;

    /**
     * Lists all profiles that exist in the media service. The response provides the requested types of Configurations as far as available.
     * 									If a profile doesn't contain a type no error shall be provided.
     *
     * Gets the value of the profiles property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profiles property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProfiles().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaProfile }
     * </p>
     *
     *
     * @return
     *     The value of the profiles property.
     */
    public List<MediaProfile> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<>();
        }
        return this.profiles;
    }

}
