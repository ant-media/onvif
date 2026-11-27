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

## Publishing to GitHub Packages

After merging the version change into `master`, open **Actions → Publish Maven
package → Run workflow**. Select `master` and enter the release version from
`pom.xml` (for example, `1.3.0`). The workflow tests the selected commit and
publishes the JAR, sources JAR, and POM using the repository token.

Use the Maven repository `https://maven.pkg.github.com/ant-media/onvif` and
dependency `io.antmedia.ipcamera.onvif:onvif:1.3.0` for the first GitHub
Packages release. The artifact ID is lowercase. Maven clients need a GitHub
credential to download public packages. See the
[GitHub Maven authentication guide](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages).
