
package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes standard Imaging Preset types, used to facilitate Multi-language support and client display.
 * 					"Custom" Type shall be used when Imaging Preset Name does not match any of the types included in the standard classification.
 *
 * <p>Java class for ImagingPresetType</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ImagingPresetType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Custom"/>
 *     <enumeration value="ClearWeather"/>
 *     <enumeration value="Cloudy"/>
 *     <enumeration value="Fog"/>
 *     <enumeration value="Rain"/>
 *     <enumeration value="Snowing"/>
 *     <enumeration value="Snow"/>
 *     <enumeration value="WDR"/>
 *     <enumeration value="Shade"/>
 *     <enumeration value="Night"/>
 *     <enumeration value="Indoor"/>
 *     <enumeration value="Fluorescent"/>
 *     <enumeration value="Incandescent"/>
 *     <enumeration value="Sodium(Natrium)"/>
 *     <enumeration value="Sunrise(Horizon)"/>
 *     <enumeration value="Sunset(Rear)"/>
 *     <enumeration value="ExtremeHot"/>
 *     <enumeration value="ExtremeCold"/>
 *     <enumeration value="Underwater"/>
 *     <enumeration value="CloseUp"/>
 *     <enumeration value="Motion"/>
 *     <enumeration value="FlickerFree50"/>
 *     <enumeration value="FlickerFree60"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "ImagingPresetType")
@XmlEnum
public enum ImagingPresetType {

    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("ClearWeather")
    CLEAR_WEATHER("ClearWeather"),
    @XmlEnumValue("Cloudy")
    CLOUDY("Cloudy"),
    @XmlEnumValue("Fog")
    FOG("Fog"),
    @XmlEnumValue("Rain")
    RAIN("Rain"),
    @XmlEnumValue("Snowing")
    SNOWING("Snowing"),
    @XmlEnumValue("Snow")
    SNOW("Snow"),
    WDR("WDR"),
    @XmlEnumValue("Shade")
    SHADE("Shade"),
    @XmlEnumValue("Night")
    NIGHT("Night"),
    @XmlEnumValue("Indoor")
    INDOOR("Indoor"),
    @XmlEnumValue("Fluorescent")
    FLUORESCENT("Fluorescent"),
    @XmlEnumValue("Incandescent")
    INCANDESCENT("Incandescent"),
    @XmlEnumValue("Sodium(Natrium)")
    SODIUM_NATRIUM("Sodium(Natrium)"),
    @XmlEnumValue("Sunrise(Horizon)")
    SUNRISE_HORIZON("Sunrise(Horizon)"),
    @XmlEnumValue("Sunset(Rear)")
    SUNSET_REAR("Sunset(Rear)"),
    @XmlEnumValue("ExtremeHot")
    EXTREME_HOT("ExtremeHot"),
    @XmlEnumValue("ExtremeCold")
    EXTREME_COLD("ExtremeCold"),
    @XmlEnumValue("Underwater")
    UNDERWATER("Underwater"),
    @XmlEnumValue("CloseUp")
    CLOSE_UP("CloseUp"),
    @XmlEnumValue("Motion")
    MOTION("Motion"),
    @XmlEnumValue("FlickerFree50")
    FLICKER_FREE_50("FlickerFree50"),
    @XmlEnumValue("FlickerFree60")
    FLICKER_FREE_60("FlickerFree60");
    private final String value;

    ImagingPresetType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     *
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     *
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static ImagingPresetType fromValue(String v) {
        for (ImagingPresetType c: ImagingPresetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
