
package org.onvif.ver20.media.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.onvif.ver20.media.wsdl package.
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

    private static final QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "Capabilities");
    private static final QName _ConfigurationEnumeration_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "ConfigurationEnumeration");
    private static final QName _GetVideoEncoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoEncoderConfigurations");
    private static final QName _GetVideoSourceConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoSourceConfigurations");
    private static final QName _GetAudioEncoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioEncoderConfigurations");
    private static final QName _GetAudioSourceConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioSourceConfigurations");
    private static final QName _GetAnalyticsConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAnalyticsConfigurations");
    private static final QName _GetMetadataConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetMetadataConfigurations");
    private static final QName _GetAudioOutputConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioOutputConfigurations");
    private static final QName _GetAudioDecoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioDecoderConfigurations");
    private static final QName _SetVideoEncoderConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetVideoEncoderConfigurationResponse");
    private static final QName _SetVideoSourceConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetVideoSourceConfigurationResponse");
    private static final QName _SetAudioEncoderConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetAudioEncoderConfigurationResponse");
    private static final QName _SetAudioSourceConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetAudioSourceConfigurationResponse");
    private static final QName _SetMetadataConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetMetadataConfigurationResponse");
    private static final QName _SetAudioOutputConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetAudioOutputConfigurationResponse");
    private static final QName _SetAudioDecoderConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetAudioDecoderConfigurationResponse");
    private static final QName _SetEQPresetConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetEQPresetConfigurationResponse");
    private static final QName _GetVideoSourceConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoSourceConfigurationOptions");
    private static final QName _GetVideoEncoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoEncoderConfigurationOptions");
    private static final QName _GetAudioSourceConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioSourceConfigurationOptions");
    private static final QName _GetAudioEncoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioEncoderConfigurationOptions");
    private static final QName _GetMetadataConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetMetadataConfigurationOptions");
    private static final QName _GetAudioOutputConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioOutputConfigurationOptions");
    private static final QName _GetAudioDecoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioDecoderConfigurationOptions");
    private static final QName _StartMulticastStreaming_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "StartMulticastStreaming");
    private static final QName _StartMulticastStreamingResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "StartMulticastStreamingResponse");
    private static final QName _StopMulticastStreaming_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "StopMulticastStreaming");
    private static final QName _StopMulticastStreamingResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "StopMulticastStreamingResponse");
    private static final QName _SetOSDResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetOSDResponse");
    private static final QName _DeleteOSDResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "DeleteOSDResponse");
    private static final QName _SetMaskResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetMaskResponse");
    private static final QName _DeleteMaskResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "DeleteMaskResponse");
    private static final QName _SetMulticastAudioDecoderConfigurationResponse_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "SetMulticastAudioDecoderConfigurationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver20.media.wsdl
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     *
     * @return
     *     the new instance of {@link GetServiceCapabilities }
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     *
     * @return
     *     the new instance of {@link GetServiceCapabilitiesResponse }
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Capabilities2 }
     *
     * @return
     *     the new instance of {@link Capabilities2 }
     */
    public Capabilities2 createCapabilities2() {
        return new Capabilities2();
    }

    /**
     * Create an instance of {@link CreateProfile }
     *
     * @return
     *     the new instance of {@link CreateProfile }
     */
    public CreateProfile createCreateProfile() {
        return new CreateProfile();
    }

    /**
     * Create an instance of {@link ConfigurationRef }
     *
     * @return
     *     the new instance of {@link ConfigurationRef }
     */
    public ConfigurationRef createConfigurationRef() {
        return new ConfigurationRef();
    }

    /**
     * Create an instance of {@link CreateProfileResponse }
     *
     * @return
     *     the new instance of {@link CreateProfileResponse }
     */
    public CreateProfileResponse createCreateProfileResponse() {
        return new CreateProfileResponse();
    }

    /**
     * Create an instance of {@link GetProfiles }
     *
     * @return
     *     the new instance of {@link GetProfiles }
     */
    public GetProfiles createGetProfiles() {
        return new GetProfiles();
    }

    /**
     * Create an instance of {@link GetProfilesResponse }
     *
     * @return
     *     the new instance of {@link GetProfilesResponse }
     */
    public GetProfilesResponse createGetProfilesResponse() {
        return new GetProfilesResponse();
    }

    /**
     * Create an instance of {@link MediaProfile }
     *
     * @return
     *     the new instance of {@link MediaProfile }
     */
    public MediaProfile createMediaProfile() {
        return new MediaProfile();
    }

    /**
     * Create an instance of {@link AddConfiguration }
     *
     * @return
     *     the new instance of {@link AddConfiguration }
     */
    public AddConfiguration createAddConfiguration() {
        return new AddConfiguration();
    }

    /**
     * Create an instance of {@link AddConfigurationResponse }
     *
     * @return
     *     the new instance of {@link AddConfigurationResponse }
     */
    public AddConfigurationResponse createAddConfigurationResponse() {
        return new AddConfigurationResponse();
    }

    /**
     * Create an instance of {@link RemoveConfiguration }
     *
     * @return
     *     the new instance of {@link RemoveConfiguration }
     */
    public RemoveConfiguration createRemoveConfiguration() {
        return new RemoveConfiguration();
    }

    /**
     * Create an instance of {@link RemoveConfigurationResponse }
     *
     * @return
     *     the new instance of {@link RemoveConfigurationResponse }
     */
    public RemoveConfigurationResponse createRemoveConfigurationResponse() {
        return new RemoveConfigurationResponse();
    }

    /**
     * Create an instance of {@link DeleteProfile }
     *
     * @return
     *     the new instance of {@link DeleteProfile }
     */
    public DeleteProfile createDeleteProfile() {
        return new DeleteProfile();
    }

    /**
     * Create an instance of {@link DeleteProfileResponse }
     *
     * @return
     *     the new instance of {@link DeleteProfileResponse }
     */
    public DeleteProfileResponse createDeleteProfileResponse() {
        return new DeleteProfileResponse();
    }

    /**
     * Create an instance of {@link GetConfiguration }
     *
     * @return
     *     the new instance of {@link GetConfiguration }
     */
    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    /**
     * Create an instance of {@link GetVideoEncoderConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetVideoEncoderConfigurationsResponse }
     */
    public GetVideoEncoderConfigurationsResponse createGetVideoEncoderConfigurationsResponse() {
        return new GetVideoEncoderConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetVideoSourceConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetVideoSourceConfigurationsResponse }
     */
    public GetVideoSourceConfigurationsResponse createGetVideoSourceConfigurationsResponse() {
        return new GetVideoSourceConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioEncoderConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioEncoderConfigurationsResponse }
     */
    public GetAudioEncoderConfigurationsResponse createGetAudioEncoderConfigurationsResponse() {
        return new GetAudioEncoderConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioSourceConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioSourceConfigurationsResponse }
     */
    public GetAudioSourceConfigurationsResponse createGetAudioSourceConfigurationsResponse() {
        return new GetAudioSourceConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAnalyticsConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetAnalyticsConfigurationsResponse }
     */
    public GetAnalyticsConfigurationsResponse createGetAnalyticsConfigurationsResponse() {
        return new GetAnalyticsConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetMetadataConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetMetadataConfigurationsResponse }
     */
    public GetMetadataConfigurationsResponse createGetMetadataConfigurationsResponse() {
        return new GetMetadataConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioOutputConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioOutputConfigurationsResponse }
     */
    public GetAudioOutputConfigurationsResponse createGetAudioOutputConfigurationsResponse() {
        return new GetAudioOutputConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioDecoderConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioDecoderConfigurationsResponse }
     */
    public GetAudioDecoderConfigurationsResponse createGetAudioDecoderConfigurationsResponse() {
        return new GetAudioDecoderConfigurationsResponse();
    }

    /**
     * Create an instance of {@link SetVideoEncoderConfiguration }
     *
     * @return
     *     the new instance of {@link SetVideoEncoderConfiguration }
     */
    public SetVideoEncoderConfiguration createSetVideoEncoderConfiguration() {
        return new SetVideoEncoderConfiguration();
    }

    /**
     * Create an instance of {@link SetConfigurationResponse }
     *
     * @return
     *     the new instance of {@link SetConfigurationResponse }
     */
    public SetConfigurationResponse createSetConfigurationResponse() {
        return new SetConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetVideoSourceConfiguration }
     *
     * @return
     *     the new instance of {@link SetVideoSourceConfiguration }
     */
    public SetVideoSourceConfiguration createSetVideoSourceConfiguration() {
        return new SetVideoSourceConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioEncoderConfiguration }
     *
     * @return
     *     the new instance of {@link SetAudioEncoderConfiguration }
     */
    public SetAudioEncoderConfiguration createSetAudioEncoderConfiguration() {
        return new SetAudioEncoderConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioSourceConfiguration }
     *
     * @return
     *     the new instance of {@link SetAudioSourceConfiguration }
     */
    public SetAudioSourceConfiguration createSetAudioSourceConfiguration() {
        return new SetAudioSourceConfiguration();
    }

    /**
     * Create an instance of {@link SetMetadataConfiguration }
     *
     * @return
     *     the new instance of {@link SetMetadataConfiguration }
     */
    public SetMetadataConfiguration createSetMetadataConfiguration() {
        return new SetMetadataConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioOutputConfiguration }
     *
     * @return
     *     the new instance of {@link SetAudioOutputConfiguration }
     */
    public SetAudioOutputConfiguration createSetAudioOutputConfiguration() {
        return new SetAudioOutputConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioDecoderConfiguration }
     *
     * @return
     *     the new instance of {@link SetAudioDecoderConfiguration }
     */
    public SetAudioDecoderConfiguration createSetAudioDecoderConfiguration() {
        return new SetAudioDecoderConfiguration();
    }

    /**
     * Create an instance of {@link SetEQPresetConfiguration }
     *
     * @return
     *     the new instance of {@link SetEQPresetConfiguration }
     */
    public SetEQPresetConfiguration createSetEQPresetConfiguration() {
        return new SetEQPresetConfiguration();
    }

    /**
     * Create an instance of {@link GetVideoSourceConfigurationOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetVideoSourceConfigurationOptionsResponse }
     */
    public GetVideoSourceConfigurationOptionsResponse createGetVideoSourceConfigurationOptionsResponse() {
        return new GetVideoSourceConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetVideoEncoderConfigurationOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetVideoEncoderConfigurationOptionsResponse }
     */
    public GetVideoEncoderConfigurationOptionsResponse createGetVideoEncoderConfigurationOptionsResponse() {
        return new GetVideoEncoderConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioSourceConfigurationOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioSourceConfigurationOptionsResponse }
     */
    public GetAudioSourceConfigurationOptionsResponse createGetAudioSourceConfigurationOptionsResponse() {
        return new GetAudioSourceConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioEncoderConfigurationOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioEncoderConfigurationOptionsResponse }
     */
    public GetAudioEncoderConfigurationOptionsResponse createGetAudioEncoderConfigurationOptionsResponse() {
        return new GetAudioEncoderConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetMetadataConfigurationOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetMetadataConfigurationOptionsResponse }
     */
    public GetMetadataConfigurationOptionsResponse createGetMetadataConfigurationOptionsResponse() {
        return new GetMetadataConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioOutputConfigurationOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioOutputConfigurationOptionsResponse }
     */
    public GetAudioOutputConfigurationOptionsResponse createGetAudioOutputConfigurationOptionsResponse() {
        return new GetAudioOutputConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioDecoderConfigurationOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioDecoderConfigurationOptionsResponse }
     */
    public GetAudioDecoderConfigurationOptionsResponse createGetAudioDecoderConfigurationOptionsResponse() {
        return new GetAudioDecoderConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetVideoEncoderInstances }
     *
     * @return
     *     the new instance of {@link GetVideoEncoderInstances }
     */
    public GetVideoEncoderInstances createGetVideoEncoderInstances() {
        return new GetVideoEncoderInstances();
    }

    /**
     * Create an instance of {@link GetVideoEncoderInstancesResponse }
     *
     * @return
     *     the new instance of {@link GetVideoEncoderInstancesResponse }
     */
    public GetVideoEncoderInstancesResponse createGetVideoEncoderInstancesResponse() {
        return new GetVideoEncoderInstancesResponse();
    }

    /**
     * Create an instance of {@link EncoderInstanceInfo }
     *
     * @return
     *     the new instance of {@link EncoderInstanceInfo }
     */
    public EncoderInstanceInfo createEncoderInstanceInfo() {
        return new EncoderInstanceInfo();
    }

    /**
     * Create an instance of {@link GetStreamUri }
     *
     * @return
     *     the new instance of {@link GetStreamUri }
     */
    public GetStreamUri createGetStreamUri() {
        return new GetStreamUri();
    }

    /**
     * Create an instance of {@link GetStreamUriResponse }
     *
     * @return
     *     the new instance of {@link GetStreamUriResponse }
     */
    public GetStreamUriResponse createGetStreamUriResponse() {
        return new GetStreamUriResponse();
    }

    /**
     * Create an instance of {@link SetSynchronizationPoint }
     *
     * @return
     *     the new instance of {@link SetSynchronizationPoint }
     */
    public SetSynchronizationPoint createSetSynchronizationPoint() {
        return new SetSynchronizationPoint();
    }

    /**
     * Create an instance of {@link SetSynchronizationPointResponse }
     *
     * @return
     *     the new instance of {@link SetSynchronizationPointResponse }
     */
    public SetSynchronizationPointResponse createSetSynchronizationPointResponse() {
        return new SetSynchronizationPointResponse();
    }

    /**
     * Create an instance of {@link GetSnapshotUri }
     *
     * @return
     *     the new instance of {@link GetSnapshotUri }
     */
    public GetSnapshotUri createGetSnapshotUri() {
        return new GetSnapshotUri();
    }

    /**
     * Create an instance of {@link GetSnapshotUriResponse }
     *
     * @return
     *     the new instance of {@link GetSnapshotUriResponse }
     */
    public GetSnapshotUriResponse createGetSnapshotUriResponse() {
        return new GetSnapshotUriResponse();
    }

    /**
     * Create an instance of {@link StartStopMulticastStreaming }
     *
     * @return
     *     the new instance of {@link StartStopMulticastStreaming }
     */
    public StartStopMulticastStreaming createStartStopMulticastStreaming() {
        return new StartStopMulticastStreaming();
    }

    /**
     * Create an instance of {@link GetVideoSourceModes }
     *
     * @return
     *     the new instance of {@link GetVideoSourceModes }
     */
    public GetVideoSourceModes createGetVideoSourceModes() {
        return new GetVideoSourceModes();
    }

    /**
     * Create an instance of {@link GetVideoSourceModesResponse }
     *
     * @return
     *     the new instance of {@link GetVideoSourceModesResponse }
     */
    public GetVideoSourceModesResponse createGetVideoSourceModesResponse() {
        return new GetVideoSourceModesResponse();
    }

    /**
     * Create an instance of {@link VideoSourceMode }
     *
     * @return
     *     the new instance of {@link VideoSourceMode }
     */
    public VideoSourceMode createVideoSourceMode() {
        return new VideoSourceMode();
    }

    /**
     * Create an instance of {@link SetVideoSourceMode }
     *
     * @return
     *     the new instance of {@link SetVideoSourceMode }
     */
    public SetVideoSourceMode createSetVideoSourceMode() {
        return new SetVideoSourceMode();
    }

    /**
     * Create an instance of {@link SetVideoSourceModeResponse }
     *
     * @return
     *     the new instance of {@link SetVideoSourceModeResponse }
     */
    public SetVideoSourceModeResponse createSetVideoSourceModeResponse() {
        return new SetVideoSourceModeResponse();
    }

    /**
     * Create an instance of {@link GetOSDs }
     *
     * @return
     *     the new instance of {@link GetOSDs }
     */
    public GetOSDs createGetOSDs() {
        return new GetOSDs();
    }

    /**
     * Create an instance of {@link GetOSDsResponse }
     *
     * @return
     *     the new instance of {@link GetOSDsResponse }
     */
    public GetOSDsResponse createGetOSDsResponse() {
        return new GetOSDsResponse();
    }

    /**
     * Create an instance of {@link SetOSD }
     *
     * @return
     *     the new instance of {@link SetOSD }
     */
    public SetOSD createSetOSD() {
        return new SetOSD();
    }

    /**
     * Create an instance of {@link GetOSDOptions }
     *
     * @return
     *     the new instance of {@link GetOSDOptions }
     */
    public GetOSDOptions createGetOSDOptions() {
        return new GetOSDOptions();
    }

    /**
     * Create an instance of {@link GetOSDOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetOSDOptionsResponse }
     */
    public GetOSDOptionsResponse createGetOSDOptionsResponse() {
        return new GetOSDOptionsResponse();
    }

    /**
     * Create an instance of {@link CreateOSD }
     *
     * @return
     *     the new instance of {@link CreateOSD }
     */
    public CreateOSD createCreateOSD() {
        return new CreateOSD();
    }

    /**
     * Create an instance of {@link CreateOSDResponse }
     *
     * @return
     *     the new instance of {@link CreateOSDResponse }
     */
    public CreateOSDResponse createCreateOSDResponse() {
        return new CreateOSDResponse();
    }

    /**
     * Create an instance of {@link DeleteOSD }
     *
     * @return
     *     the new instance of {@link DeleteOSD }
     */
    public DeleteOSD createDeleteOSD() {
        return new DeleteOSD();
    }

    /**
     * Create an instance of {@link GetMasks }
     *
     * @return
     *     the new instance of {@link GetMasks }
     */
    public GetMasks createGetMasks() {
        return new GetMasks();
    }

    /**
     * Create an instance of {@link GetMasksResponse }
     *
     * @return
     *     the new instance of {@link GetMasksResponse }
     */
    public GetMasksResponse createGetMasksResponse() {
        return new GetMasksResponse();
    }

    /**
     * Create an instance of {@link Mask }
     *
     * @return
     *     the new instance of {@link Mask }
     */
    public Mask createMask() {
        return new Mask();
    }

    /**
     * Create an instance of {@link SetMask }
     *
     * @return
     *     the new instance of {@link SetMask }
     */
    public SetMask createSetMask() {
        return new SetMask();
    }

    /**
     * Create an instance of {@link GetMaskOptions }
     *
     * @return
     *     the new instance of {@link GetMaskOptions }
     */
    public GetMaskOptions createGetMaskOptions() {
        return new GetMaskOptions();
    }

    /**
     * Create an instance of {@link GetMaskOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetMaskOptionsResponse }
     */
    public GetMaskOptionsResponse createGetMaskOptionsResponse() {
        return new GetMaskOptionsResponse();
    }

    /**
     * Create an instance of {@link MaskOptions }
     *
     * @return
     *     the new instance of {@link MaskOptions }
     */
    public MaskOptions createMaskOptions() {
        return new MaskOptions();
    }

    /**
     * Create an instance of {@link CreateMask }
     *
     * @return
     *     the new instance of {@link CreateMask }
     */
    public CreateMask createCreateMask() {
        return new CreateMask();
    }

    /**
     * Create an instance of {@link CreateMaskResponse }
     *
     * @return
     *     the new instance of {@link CreateMaskResponse }
     */
    public CreateMaskResponse createCreateMaskResponse() {
        return new CreateMaskResponse();
    }

    /**
     * Create an instance of {@link DeleteMask }
     *
     * @return
     *     the new instance of {@link DeleteMask }
     */
    public DeleteMask createDeleteMask() {
        return new DeleteMask();
    }

    /**
     * Create an instance of {@link GetWebRTCConfigurations }
     *
     * @return
     *     the new instance of {@link GetWebRTCConfigurations }
     */
    public GetWebRTCConfigurations createGetWebRTCConfigurations() {
        return new GetWebRTCConfigurations();
    }

    /**
     * Create an instance of {@link GetWebRTCConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetWebRTCConfigurationsResponse }
     */
    public GetWebRTCConfigurationsResponse createGetWebRTCConfigurationsResponse() {
        return new GetWebRTCConfigurationsResponse();
    }

    /**
     * Create an instance of {@link WebRTCConfiguration }
     *
     * @return
     *     the new instance of {@link WebRTCConfiguration }
     */
    public WebRTCConfiguration createWebRTCConfiguration() {
        return new WebRTCConfiguration();
    }

    /**
     * Create an instance of {@link SetWebRTCConfigurations }
     *
     * @return
     *     the new instance of {@link SetWebRTCConfigurations }
     */
    public SetWebRTCConfigurations createSetWebRTCConfigurations() {
        return new SetWebRTCConfigurations();
    }

    /**
     * Create an instance of {@link SetWebRTCConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link SetWebRTCConfigurationsResponse }
     */
    public SetWebRTCConfigurationsResponse createSetWebRTCConfigurationsResponse() {
        return new SetWebRTCConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioClips }
     *
     * @return
     *     the new instance of {@link GetAudioClips }
     */
    public GetAudioClips createGetAudioClips() {
        return new GetAudioClips();
    }

    /**
     * Create an instance of {@link GetAudioClipsResponse }
     *
     * @return
     *     the new instance of {@link GetAudioClipsResponse }
     */
    public GetAudioClipsResponse createGetAudioClipsResponse() {
        return new GetAudioClipsResponse();
    }

    /**
     * Create an instance of {@link GetAudioClipsResponseItem }
     *
     * @return
     *     the new instance of {@link GetAudioClipsResponseItem }
     */
    public GetAudioClipsResponseItem createGetAudioClipsResponseItem() {
        return new GetAudioClipsResponseItem();
    }

    /**
     * Create an instance of {@link AddAudioClip }
     *
     * @return
     *     the new instance of {@link AddAudioClip }
     */
    public AddAudioClip createAddAudioClip() {
        return new AddAudioClip();
    }

    /**
     * Create an instance of {@link AudioClip }
     *
     * @return
     *     the new instance of {@link AudioClip }
     */
    public AudioClip createAudioClip() {
        return new AudioClip();
    }

    /**
     * Create an instance of {@link AddAudioClipResponse }
     *
     * @return
     *     the new instance of {@link AddAudioClipResponse }
     */
    public AddAudioClipResponse createAddAudioClipResponse() {
        return new AddAudioClipResponse();
    }

    /**
     * Create an instance of {@link SetAudioClip }
     *
     * @return
     *     the new instance of {@link SetAudioClip }
     */
    public SetAudioClip createSetAudioClip() {
        return new SetAudioClip();
    }

    /**
     * Create an instance of {@link SetAudioClipResponse }
     *
     * @return
     *     the new instance of {@link SetAudioClipResponse }
     */
    public SetAudioClipResponse createSetAudioClipResponse() {
        return new SetAudioClipResponse();
    }

    /**
     * Create an instance of {@link AddTTSAudioClip }
     *
     * @return
     *     the new instance of {@link AddTTSAudioClip }
     */
    public AddTTSAudioClip createAddTTSAudioClip() {
        return new AddTTSAudioClip();
    }

    /**
     * Create an instance of {@link TTSAudio }
     *
     * @return
     *     the new instance of {@link TTSAudio }
     */
    public TTSAudio createTTSAudio() {
        return new TTSAudio();
    }

    /**
     * Create an instance of {@link AddTTSAudioClipResponse }
     *
     * @return
     *     the new instance of {@link AddTTSAudioClipResponse }
     */
    public AddTTSAudioClipResponse createAddTTSAudioClipResponse() {
        return new AddTTSAudioClipResponse();
    }

    /**
     * Create an instance of {@link DeleteAudioClip }
     *
     * @return
     *     the new instance of {@link DeleteAudioClip }
     */
    public DeleteAudioClip createDeleteAudioClip() {
        return new DeleteAudioClip();
    }

    /**
     * Create an instance of {@link DeleteAudioClipResponse }
     *
     * @return
     *     the new instance of {@link DeleteAudioClipResponse }
     */
    public DeleteAudioClipResponse createDeleteAudioClipResponse() {
        return new DeleteAudioClipResponse();
    }

    /**
     * Create an instance of {@link PlayAudioClip }
     *
     * @return
     *     the new instance of {@link PlayAudioClip }
     */
    public PlayAudioClip createPlayAudioClip() {
        return new PlayAudioClip();
    }

    /**
     * Create an instance of {@link PlayAudioClipResponse }
     *
     * @return
     *     the new instance of {@link PlayAudioClipResponse }
     */
    public PlayAudioClipResponse createPlayAudioClipResponse() {
        return new PlayAudioClipResponse();
    }

    /**
     * Create an instance of {@link GetPlayingAudioClips }
     *
     * @return
     *     the new instance of {@link GetPlayingAudioClips }
     */
    public GetPlayingAudioClips createGetPlayingAudioClips() {
        return new GetPlayingAudioClips();
    }

    /**
     * Create an instance of {@link GetPlayingAudioClipsResponse }
     *
     * @return
     *     the new instance of {@link GetPlayingAudioClipsResponse }
     */
    public GetPlayingAudioClipsResponse createGetPlayingAudioClipsResponse() {
        return new GetPlayingAudioClipsResponse();
    }

    /**
     * Create an instance of {@link PlayingAudioClips }
     *
     * @return
     *     the new instance of {@link PlayingAudioClips }
     */
    public PlayingAudioClips createPlayingAudioClips() {
        return new PlayingAudioClips();
    }

    /**
     * Create an instance of {@link GetMulticastAudioDecoderConfigurations }
     *
     * @return
     *     the new instance of {@link GetMulticastAudioDecoderConfigurations }
     */
    public GetMulticastAudioDecoderConfigurations createGetMulticastAudioDecoderConfigurations() {
        return new GetMulticastAudioDecoderConfigurations();
    }

    /**
     * Create an instance of {@link GetMulticastAudioDecoderConfigurationsResponse }
     *
     * @return
     *     the new instance of {@link GetMulticastAudioDecoderConfigurationsResponse }
     */
    public GetMulticastAudioDecoderConfigurationsResponse createGetMulticastAudioDecoderConfigurationsResponse() {
        return new GetMulticastAudioDecoderConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetMulticastAudioDecoderConfigurationOptions }
     *
     * @return
     *     the new instance of {@link GetMulticastAudioDecoderConfigurationOptions }
     */
    public GetMulticastAudioDecoderConfigurationOptions createGetMulticastAudioDecoderConfigurationOptions() {
        return new GetMulticastAudioDecoderConfigurationOptions();
    }

    /**
     * Create an instance of {@link GetMulticastAudioDecoderConfigurationOptionsResponse }
     *
     * @return
     *     the new instance of {@link GetMulticastAudioDecoderConfigurationOptionsResponse }
     */
    public GetMulticastAudioDecoderConfigurationOptionsResponse createGetMulticastAudioDecoderConfigurationOptionsResponse() {
        return new GetMulticastAudioDecoderConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link SetMulticastAudioDecoderConfiguration }
     *
     * @return
     *     the new instance of {@link SetMulticastAudioDecoderConfiguration }
     */
    public SetMulticastAudioDecoderConfiguration createSetMulticastAudioDecoderConfiguration() {
        return new SetMulticastAudioDecoderConfiguration();
    }

    /**
     * Create an instance of {@link ProfileCapabilities }
     *
     * @return
     *     the new instance of {@link ProfileCapabilities }
     */
    public ProfileCapabilities createProfileCapabilities() {
        return new ProfileCapabilities();
    }

    /**
     * Create an instance of {@link StreamingCapabilities }
     *
     * @return
     *     the new instance of {@link StreamingCapabilities }
     */
    public StreamingCapabilities createStreamingCapabilities() {
        return new StreamingCapabilities();
    }

    /**
     * Create an instance of {@link MulticastAudioDecoderCapabilities }
     *
     * @return
     *     the new instance of {@link MulticastAudioDecoderCapabilities }
     */
    public MulticastAudioDecoderCapabilities createMulticastAudioDecoderCapabilities() {
        return new MulticastAudioDecoderCapabilities();
    }

    /**
     * Create an instance of {@link AudioClipCapabilities }
     *
     * @return
     *     the new instance of {@link AudioClipCapabilities }
     */
    public AudioClipCapabilities createAudioClipCapabilities() {
        return new AudioClipCapabilities();
    }

    /**
     * Create an instance of {@link TTSCapabilities }
     *
     * @return
     *     the new instance of {@link TTSCapabilities }
     */
    public TTSCapabilities createTTSCapabilities() {
        return new TTSCapabilities();
    }

    /**
     * Create an instance of {@link ReceiverConfiguration }
     *
     * @return
     *     the new instance of {@link ReceiverConfiguration }
     */
    public ReceiverConfiguration createReceiverConfiguration() {
        return new ReceiverConfiguration();
    }

    /**
     * Create an instance of {@link ConfigurationSet }
     *
     * @return
     *     the new instance of {@link ConfigurationSet }
     */
    public ConfigurationSet createConfigurationSet() {
        return new ConfigurationSet();
    }

    /**
     * Create an instance of {@link EncoderInstance }
     *
     * @return
     *     the new instance of {@link EncoderInstance }
     */
    public EncoderInstance createEncoderInstance() {
        return new EncoderInstance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities2 }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities2> createCapabilities(Capabilities2 value) {
        return new JAXBElement<>(_Capabilities_QNAME, Capabilities2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationEnumeration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationEnumeration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "ConfigurationEnumeration")
    public JAXBElement<ConfigurationEnumeration> createConfigurationEnumeration(ConfigurationEnumeration value) {
        return new JAXBElement<>(_ConfigurationEnumeration_QNAME, ConfigurationEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoEncoderConfigurations")
    public JAXBElement<GetConfiguration> createGetVideoEncoderConfigurations(GetConfiguration value) {
        return new JAXBElement<>(_GetVideoEncoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoSourceConfigurations")
    public JAXBElement<GetConfiguration> createGetVideoSourceConfigurations(GetConfiguration value) {
        return new JAXBElement<>(_GetVideoSourceConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioEncoderConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioEncoderConfigurations(GetConfiguration value) {
        return new JAXBElement<>(_GetAudioEncoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioSourceConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioSourceConfigurations(GetConfiguration value) {
        return new JAXBElement<>(_GetAudioSourceConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAnalyticsConfigurations")
    public JAXBElement<GetConfiguration> createGetAnalyticsConfigurations(GetConfiguration value) {
        return new JAXBElement<>(_GetAnalyticsConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetMetadataConfigurations")
    public JAXBElement<GetConfiguration> createGetMetadataConfigurations(GetConfiguration value) {
        return new JAXBElement<>(_GetMetadataConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioOutputConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioOutputConfigurations(GetConfiguration value) {
        return new JAXBElement<>(_GetAudioOutputConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioDecoderConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioDecoderConfigurations(GetConfiguration value) {
        return new JAXBElement<>(_GetAudioDecoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetVideoEncoderConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetVideoEncoderConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetVideoEncoderConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetVideoSourceConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetVideoSourceConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetVideoSourceConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetAudioEncoderConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetAudioEncoderConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetAudioEncoderConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetAudioSourceConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetAudioSourceConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetAudioSourceConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetMetadataConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetMetadataConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetMetadataConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetAudioOutputConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetAudioOutputConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetAudioOutputConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetAudioDecoderConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetAudioDecoderConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetAudioDecoderConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetEQPresetConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetEQPresetConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetEQPresetConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoSourceConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetVideoSourceConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<>(_GetVideoSourceConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoEncoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetVideoEncoderConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<>(_GetVideoEncoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioSourceConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioSourceConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<>(_GetAudioSourceConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioEncoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioEncoderConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<>(_GetAudioEncoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetMetadataConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetMetadataConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<>(_GetMetadataConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioOutputConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioOutputConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<>(_GetAudioOutputConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioDecoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioDecoderConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<>(_GetAudioDecoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartStopMulticastStreaming }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StartStopMulticastStreaming }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "StartMulticastStreaming")
    public JAXBElement<StartStopMulticastStreaming> createStartMulticastStreaming(StartStopMulticastStreaming value) {
        return new JAXBElement<>(_StartMulticastStreaming_QNAME, StartStopMulticastStreaming.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "StartMulticastStreamingResponse")
    public JAXBElement<SetConfigurationResponse> createStartMulticastStreamingResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_StartMulticastStreamingResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartStopMulticastStreaming }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StartStopMulticastStreaming }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "StopMulticastStreaming")
    public JAXBElement<StartStopMulticastStreaming> createStopMulticastStreaming(StartStopMulticastStreaming value) {
        return new JAXBElement<>(_StopMulticastStreaming_QNAME, StartStopMulticastStreaming.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "StopMulticastStreamingResponse")
    public JAXBElement<SetConfigurationResponse> createStopMulticastStreamingResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_StopMulticastStreamingResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetOSDResponse")
    public JAXBElement<SetConfigurationResponse> createSetOSDResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetOSDResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "DeleteOSDResponse")
    public JAXBElement<SetConfigurationResponse> createDeleteOSDResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_DeleteOSDResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetMaskResponse")
    public JAXBElement<SetConfigurationResponse> createSetMaskResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetMaskResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "DeleteMaskResponse")
    public JAXBElement<SetConfigurationResponse> createDeleteMaskResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_DeleteMaskResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetConfigurationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "SetMulticastAudioDecoderConfigurationResponse")
    public JAXBElement<SetConfigurationResponse> createSetMulticastAudioDecoderConfigurationResponse(SetConfigurationResponse value) {
        return new JAXBElement<>(_SetMulticastAudioDecoderConfigurationResponse_QNAME, SetConfigurationResponse.class, null, value);
    }

}
