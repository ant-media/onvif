
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.UserRole;


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
 *         <element name="UserRole" type="{http://www.onvif.org/ver10/schema}UserRole"/>
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
    "userRole"
})
@XmlRootElement(name = "SetUserRole")
public class SetUserRole {

    @XmlElement(name = "UserRole", required = true)
    protected UserRole userRole;

    /**
     * Gets the value of the userRole property.
     *
     * @return
     *     possible object is
     *     {@link UserRole }
     *
     */
    public UserRole getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     *
     * @param value
     *     allowed object is
     *     {@link UserRole }
     *
     */
    public void setUserRole(UserRole value) {
        this.userRole = value;
    }

}
