Service classes such as the following are not generated from original ONVIF wsdl.

org.onvif.ver10.device.wsdl.DeviceService
org.onvif.ver10.events.wsdl.EventService
org.onvif.ver10.media.wsdl.MediaService

In order to generate, you need to update new wsdl with a service section near the end when bringing in any new ONVIF wsdl.


```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project onvif-java: Compilation failure: Compilation failure: 
[ERROR] fp-onvif/onvif-java/src/main/java/de/onvif/soap/OnvifDevice.java:[26,35] cannot find symbol
[ERROR]   symbol:   class DeviceService
[ERROR]   location: package org.onvif.ver10.device.wsdl
[ERROR] fp-onvif/onvif-java/src/main/java/de/onvif/soap/OnvifDevice.java:[28,35] cannot find symbol
[ERROR]   symbol:   class EventService
[ERROR]   location: package org.onvif.ver10.events.wsdl
[ERROR] fp-onvif/onvif-java/src/main/java/de/onvif/soap/OnvifDevice.java:[30,34] cannot find symbol
[ERROR]   symbol:   class MediaService
[ERROR]   location: package org.onvif.ver10.media.wsdl
[ERROR] fp-onvif/onvif-java/src/main/java/de/onvif/soap/OnvifDevice.java:[134,5] cannot find symbol
[ERROR]   symbol:   class DeviceService
[ERROR]   location: class de.onvif.soap.OnvifDevice
[ERROR] fp-onvif/onvif-java/src/main/java/de/onvif/soap/OnvifDevice.java:[134,39] cannot find symbol
[ERROR]   symbol:   class DeviceService
[ERROR]   location: class de.onvif.soap.OnvifDevice
[ERROR] fp-onvif/onvif-java/src/main/java/de/onvif/soap/OnvifDevice.java:[134,59] cannot find symbol
[ERROR]   symbol:   variable DeviceService
[ERROR]   location: class de.onvif.soap.OnvifDevice
[ERROR] fp-onvif/onvif-java/src/main/java/de/onvif/soap/OnvifDevice.java:[148,24] cannot find symbol
[ERROR]   symbol:   class MediaService
[ERROR]   location: class de.onvif.soap.OnvifDevice
[ERROR] fp-onvif/onvif-java/src/main/java/de/onvif/soap/OnvifDevice.java:[169,25] cannot find symbol
[ERROR]   symbol:   class EventService
[ERROR]   location: class de.onvif.soap.OnvifDevice
[ERROR] -> [Help 1]
```