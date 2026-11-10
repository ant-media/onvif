package io.antmedia.ipcamera.onvif;

import static org.junit.Assert.*;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import org.junit.Test;
import org.onvif.ver10.schema.SRTPPreShared;
import org.onvif.ver20.media.wsdl.AddTTSAudioClip;
import org.onvif.ver20.media.wsdl.GetServiceCapabilitiesResponse;
import org.onvif.ver20.media.wsdl.TTSAudio;

public class Specification2606Test {
    @Test
    public void allServicePackagesShareOneContext() throws Exception {
        JAXBContext.newInstance("org.onvif.ver10.schema:org.onvif.ver10.device.wsdl:"
                + "org.onvif.ver10.media.wsdl:org.onvif.ver20.media.wsdl:"
                + "org.onvif.ver20.imaging.wsdl:org.onvif.ver20.ptz.wsdl:"
                + "org.onvif.ver10.events.wsdl");
    }

    @Test
    public void media2CapabilitiesRead2606AttributesAndPreserveExtensions() throws Exception {
        String xml = "<GetServiceCapabilitiesResponse xmlns='http://www.onvif.org/ver20/media/wsdl'>"
                + "<Capabilities WebRTC='2' WebRTC_codecs='H264 H265' xmlns:v='urn:vendor' v:flag='yes'>"
                + "<StreamingCapabilities SecureRTSPStreaming='true'/><v:Extension/>"
                + "</Capabilities></GetServiceCapabilitiesResponse>";
        JAXBContext context = JAXBContext.newInstance(GetServiceCapabilitiesResponse.class);
        GetServiceCapabilitiesResponse response = (GetServiceCapabilitiesResponse)
                context.createUnmarshaller().unmarshal(new StringReader(xml));
        assertEquals(Integer.valueOf(2), response.getCapabilities().getWebRTC());
        assertEquals(java.util.Arrays.asList("H264", "H265"), response.getCapabilities().getWebRTCCodecs());
        assertTrue(response.getCapabilities().getStreamingCapabilities().isSecureRTSPStreaming());
        assertEquals("yes", response.getCapabilities().getOtherAttributes().get(new QName("urn:vendor", "flag")));
        StringWriter output = new StringWriter();
        context.createMarshaller().marshal(response, output);
        assertTrue(output.toString().contains("urn:vendor"));
        assertTrue(output.toString().contains("Extension"));
    }

    @Test
    public void srtpParametersRoundTrip() throws Exception {
        String xml = "<SRTPPreSharedParameters xmlns='http://www.onvif.org/ver10/schema' "
                + "SecureStreamingProtocolAlgorithm='AES_CM_128_HMAC_SHA1_80'>"
                + "<SRTPPSK>00112233</SRTPPSK><ROCExtMapID>5</ROCExtMapID></SRTPPreSharedParameters>";
        JAXBContext context = JAXBContext.newInstance(SRTPPreShared.class);
        JAXBElement<SRTPPreShared> element = context.createUnmarshaller().unmarshal(
                new StreamSource(new StringReader(xml)), SRTPPreShared.class);
        assertEquals("00112233", element.getValue().getSRTPPSK());
        assertEquals(5, element.getValue().getROCExtMapID());
        assertEquals("AES_CM_128_HMAC_SHA1_80", element.getValue().getSecureStreamingProtocolAlgorithm());
        StringWriter output = new StringWriter();
        context.createMarshaller().marshal(element, output);
        SRTPPreShared restored = context.createUnmarshaller().unmarshal(
                new StreamSource(new StringReader(output.toString())), SRTPPreShared.class).getValue();
        assertEquals(element.getValue().getSRTPPSK(), restored.getSRTPPSK());
        assertEquals(5, restored.getROCExtMapID());
    }

    @Test
    public void textToSpeechRequestUsesMedia2Namespace() throws Exception {
        AddTTSAudioClip request = new AddTTSAudioClip();
        TTSAudio audio = new TTSAudio();
        audio.setContent("Camera ready");
        audio.setLanguage("en");
        request.setTTSConfiguration(audio);
        JAXBContext context = JAXBContext.newInstance(AddTTSAudioClip.class);
        StringWriter output = new StringWriter();
        context.createMarshaller().marshal(request, output);
        assertTrue(output.toString().contains("http://www.onvif.org/ver20/media/wsdl"));
        AddTTSAudioClip restored = (AddTTSAudioClip) context.createUnmarshaller()
                .unmarshal(new StringReader(output.toString()));
        assertEquals("Camera ready", restored.getTTSConfiguration().getContent());
        assertEquals("en", restored.getTTSConfiguration().getLanguage());
    }
    @Test
    public void metadataSensorValuesRemainTyped() throws Exception {
        String xml = "<SensorData xmlns='http://www.onvif.org/ver10/schema' SensorID='temperature' "
                + "UtcTime='2026-06-01T12:00:00Z'><Type>temperature</Type><Value>21.5</Value>"
                + "</SensorData>";
        JAXBContext context = JAXBContext.newInstance(org.onvif.ver10.schema.SensorData.class);
        org.onvif.ver10.schema.SensorData sensor = context.createUnmarshaller().unmarshal(
                new StreamSource(new StringReader(xml)), org.onvif.ver10.schema.SensorData.class).getValue();
        assertEquals("temperature", sensor.getSensorID());
        assertEquals(21.5f, sensor.getValue(), 0.001f);
        assertEquals(2026, sensor.getUtcTime().getYear());
    }

    @Test
    public void legacyMediaStreamRequestRetainsWireFormat() throws Exception {
        org.onvif.ver10.media.wsdl.GetStreamUri request = new org.onvif.ver10.media.wsdl.GetStreamUri();
        request.setProfileToken("profile1");
        org.onvif.ver10.schema.StreamSetup setup = new org.onvif.ver10.schema.StreamSetup();
        setup.setStream(org.onvif.ver10.schema.StreamType.RTP_UNICAST);
        org.onvif.ver10.schema.Transport transport = new org.onvif.ver10.schema.Transport();
        transport.setProtocol(org.onvif.ver10.schema.TransportProtocol.RTSP);
        setup.setTransport(transport);
        request.setStreamSetup(setup);
        JAXBContext context = JAXBContext.newInstance(request.getClass());
        StringWriter output = new StringWriter();
        context.createMarshaller().marshal(request, output);
        assertTrue(output.toString().contains("http://www.onvif.org/ver10/media/wsdl"));
        org.onvif.ver10.media.wsdl.GetStreamUri restored = (org.onvif.ver10.media.wsdl.GetStreamUri)
                context.createUnmarshaller().unmarshal(new StringReader(output.toString()));
        assertEquals("profile1", restored.getProfileToken());
        assertEquals(org.onvif.ver10.schema.TransportProtocol.RTSP,
                restored.getStreamSetup().getTransport().getProtocol());
    }

}
