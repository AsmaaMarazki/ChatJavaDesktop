//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.19 at 08:51:40 AM PST 
//


package XML.jaxb1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fontFamily.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fontFamily">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Arial"/>
 *     &lt;enumeration value="Times"/>
 *     &lt;enumeration value="Courier New"/>
 *     &lt;enumeration value="Comic Sans MS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fontFamily")
@XmlEnum
public enum FontFamily {

    @XmlEnumValue("Arial")
    ARIAL("Arial"),
    @XmlEnumValue("Times")
    TIMES("Times"),
    @XmlEnumValue("Courier New")
    COURIER_NEW("Courier New"),
    @XmlEnumValue("Comic Sans MS")
    COMIC_SANS_MS("Comic Sans MS");
    private final String value;

    FontFamily(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontFamily fromValue(String v) {
        for (FontFamily c: FontFamily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
