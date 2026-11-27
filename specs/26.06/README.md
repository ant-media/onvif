# ONVIF 26.06 binding sources

Source: https://github.com/onvif/specs/tree/26.06

Release commit: `68ee1b540a40f848c9599eba2c55b87547c588d6`.
Release notes: https://www.onvif.org/profiles/specifications/specification-history/june-2026/

The `wsdl` directory contains the unmodified release definitions for the services
already present in this library: Device Management, Events, Media, Media2,
Imaging, and PTZ, plus the shared, metadata, human body, and human face schemas.
The specification's `ver10` and `ver20` namespaces remain unchanged in 26.06.
This library does not implement all ONVIF services or claim ONVIF certification.

`external` contains the W3C/OASIS dependencies listed in
`external-sources.json`. `catalog.xml` resolves their HTTP and HTTPS URLs to
local files. Original copyright and license notices are retained.

Run from the repository root:

```sh
bash scripts/generate-bindings.sh
mvn clean test -DskipTests=false
```

The extraction script creates `binding-*.xsd` beside each WSDL, preserving
inherited namespace declarations. These extracted schemas and the metadata
schema are compiled together with JAXB 4.0.5 via the pinned Maven plugin.
The generation profile writes to `target/generated-bindings`; the shell script
copies those bindings into `src/main/java` and removes obsolete ONVIF classes.
The Java sources are checked in, so normal builds do not invoke the generator.
After Maven dependencies have been downloaded, generation works offline:
`bash scripts/generate-bindings.sh -o`.

Strict XSD validation is disabled for generation because the official schemas
contain extension wildcards overlapping explicit elements (XSD 1.0 Unique
Particle Attribution errors). The original schemas are preserved. JAXB binding
and XML round-trip tests run by default; this project overrides the parent
configuration that otherwise skips tests.

## API compatibility

The handwritten Device, Media, PTZ, and Imaging wrappers retain their existing
methods. Generated model classes now follow the 26.06 definitions. Some old
anonymous type names and list mappings have changed, so consumers must recompile.
For example, Media2 uses `GetServiceCapabilitiesResponse` and
`StartStopMulticastStreaming` rather than older suffixed response classes.
Media2 TTS and WebRTC capabilities, SRTP parameters, and metadata extensions are
available through the generated models. These models do not add an SRTP media
transport, a WebRTC client, or new convenience methods to the existing wrappers.
