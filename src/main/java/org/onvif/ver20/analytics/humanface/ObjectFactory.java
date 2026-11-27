
package org.onvif.ver20.analytics.humanface;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.onvif.ver20.analytics.humanface package.
 * <p>An ObjectFactory allows you to programmatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver20.analytics.humanface
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hair }
     *
     * @return
     *     the new instance of {@link Hair }
     */
    public Hair createHair() {
        return new Hair();
    }

    /**
     * Create an instance of {@link Eyebrow }
     *
     * @return
     *     the new instance of {@link Eyebrow }
     */
    public Eyebrow createEyebrow() {
        return new Eyebrow();
    }

    /**
     * Create an instance of {@link Eye }
     *
     * @return
     *     the new instance of {@link Eye }
     */
    public Eye createEye() {
        return new Eye();
    }

    /**
     * Create an instance of {@link Nose }
     *
     * @return
     *     the new instance of {@link Nose }
     */
    public Nose createNose() {
        return new Nose();
    }

    /**
     * Create an instance of {@link FacialHair }
     *
     * @return
     *     the new instance of {@link FacialHair }
     */
    public FacialHair createFacialHair() {
        return new FacialHair();
    }

    /**
     * Create an instance of {@link PoseAngle }
     *
     * @return
     *     the new instance of {@link PoseAngle }
     */
    public PoseAngle createPoseAngle() {
        return new PoseAngle();
    }

    /**
     * Create an instance of {@link AccessoryDescription }
     *
     * @return
     *     the new instance of {@link AccessoryDescription }
     */
    public AccessoryDescription createAccessoryDescription() {
        return new AccessoryDescription();
    }

    /**
     * Create an instance of {@link Accessory }
     *
     * @return
     *     the new instance of {@link Accessory }
     */
    public Accessory createAccessory() {
        return new Accessory();
    }

    /**
     * Create an instance of {@link AdditionalFeatures }
     *
     * @return
     *     the new instance of {@link AdditionalFeatures }
     */
    public AdditionalFeatures createAdditionalFeatures() {
        return new AdditionalFeatures();
    }

    /**
     * Create an instance of {@link HumanFace }
     *
     * @return
     *     the new instance of {@link HumanFace }
     */
    public HumanFace createHumanFace() {
        return new HumanFace();
    }

}
