# onvif-java-lib
ONVIF (Open Network Video Interface Forum) is a community to standardize communication between IP-based security products (like cameras).

I developed a Java library for the ONVIF spezification. It helps you with the basics (you don't need to learn SOAP e.g.) but you may need to learn a few basics about the ONVIF spezification. As far as I know, this is the first public Java project for the ONVIF spezification.

The project is still in development, so if you need features or know better solutions than mine, let me know.

This project is not officially supported by ONVIF! It has been created in a academic project from Hochschule Trier in Germany. 

## ONVIF 26.06

Version `1.3.0` updates the Device, Events, Media, Media2, Imaging,
PTZ, and shared metadata JAXB models to the official June 2026 release.
Existing client wrappers remain available. See [binding sources and upgrade
notes](specs/26.06/README.md) for scope, API changes, and regeneration.

Build and run the XML compatibility tests with:

```sh
mvn clean test -DskipTests=false
```
