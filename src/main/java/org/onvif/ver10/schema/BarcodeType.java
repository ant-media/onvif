
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for BarcodeType</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BarcodeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Code-39"/>
 *     <enumeration value="Code-49"/>
 *     <enumeration value="Code-93"/>
 *     <enumeration value="Code-128"/>
 *     <enumeration value="Code-11"/>
 *     <enumeration value="Code-25-Interleaved"/>
 *     <enumeration value="Code-25-NonInterleaved"/>
 *     <enumeration value="DataMatrix"/>
 *     <enumeration value="Maxicode"/>
 *     <enumeration value="Postnet"/>
 *     <enumeration value="RM4SCC"/>
 *     <enumeration value="ISBN-13"/>
 *     <enumeration value="ISBN-13-Dual"/>
 *     <enumeration value="ISBN-10"/>
 *     <enumeration value="ITF-14"/>
 *     <enumeration value="EAN-2"/>
 *     <enumeration value="EAN-8"/>
 *     <enumeration value="EAN-13"/>
 *     <enumeration value="EAN-14"/>
 *     <enumeration value="EAN-18"/>
 *     <enumeration value="EAN-99"/>
 *     <enumeration value="EAN-128"/>
 *     <enumeration value="SCC-14"/>
 *     <enumeration value="SSCC-18"/>
 *     <enumeration value="UPC-A"/>
 *     <enumeration value="UPC-E"/>
 *     <enumeration value="PDF417"/>
 *     <enumeration value="QRCode"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "BarcodeType")
@XmlEnum
public enum BarcodeType {

    @XmlEnumValue("Code-39")
    CODE_39("Code-39"),
    @XmlEnumValue("Code-49")
    CODE_49("Code-49"),
    @XmlEnumValue("Code-93")
    CODE_93("Code-93"),
    @XmlEnumValue("Code-128")
    CODE_128("Code-128"),
    @XmlEnumValue("Code-11")
    CODE_11("Code-11"),
    @XmlEnumValue("Code-25-Interleaved")
    CODE_25_INTERLEAVED("Code-25-Interleaved"),
    @XmlEnumValue("Code-25-NonInterleaved")
    CODE_25_NON_INTERLEAVED("Code-25-NonInterleaved"),
    @XmlEnumValue("DataMatrix")
    DATA_MATRIX("DataMatrix"),
    @XmlEnumValue("Maxicode")
    MAXICODE("Maxicode"),
    @XmlEnumValue("Postnet")
    POSTNET("Postnet"),
    @XmlEnumValue("RM4SCC")
    RM_4_SCC("RM4SCC"),
    @XmlEnumValue("ISBN-13")
    ISBN_13("ISBN-13"),
    @XmlEnumValue("ISBN-13-Dual")
    ISBN_13_DUAL("ISBN-13-Dual"),
    @XmlEnumValue("ISBN-10")
    ISBN_10("ISBN-10"),
    @XmlEnumValue("ITF-14")
    ITF_14("ITF-14"),
    @XmlEnumValue("EAN-2")
    EAN_2("EAN-2"),
    @XmlEnumValue("EAN-8")
    EAN_8("EAN-8"),
    @XmlEnumValue("EAN-13")
    EAN_13("EAN-13"),
    @XmlEnumValue("EAN-14")
    EAN_14("EAN-14"),
    @XmlEnumValue("EAN-18")
    EAN_18("EAN-18"),
    @XmlEnumValue("EAN-99")
    EAN_99("EAN-99"),
    @XmlEnumValue("EAN-128")
    EAN_128("EAN-128"),
    @XmlEnumValue("SCC-14")
    SCC_14("SCC-14"),
    @XmlEnumValue("SSCC-18")
    SSCC_18("SSCC-18"),
    @XmlEnumValue("UPC-A")
    UPC_A("UPC-A"),
    @XmlEnumValue("UPC-E")
    UPC_E("UPC-E"),
    @XmlEnumValue("PDF417")
    PDF_417("PDF417"),
    @XmlEnumValue("QRCode")
    QR_CODE("QRCode");
    private final String value;

    BarcodeType(String v) {
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
    public static BarcodeType fromValue(String v) {
        for (BarcodeType c: BarcodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
