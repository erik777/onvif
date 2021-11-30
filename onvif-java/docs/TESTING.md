In the parent, run

```
mvn clean install
```

In onvif-java/src/test/resources/onvif.properties, setup your camera's info.

Run TestDevice.java.

In there you can set the pause time

```java
	public static long pauseTime = 1000;
```

If less than 1000, you may get an error like this

```
[main] WARN org.apache.cxf.phase.PhaseInterceptorChain - Interceptor for {http://www.onvif.org/ver10/device/wsdl}DeviceService#{http://www.onvif.org/ver10/device/wsdl}GetDeviceInformation has thrown exception, unwinding now
```

caused by the camera's HTTP server

```
Caused by: org.apache.cxf.transport.http.HTTPException: HTTP response '400: Bad Request' when communicating with http://10.0.0.35/onvif/services
```

You can resolve it by disabling "replay attack protection" in the camera:

Some things to check on the camera would be to make sure the date and time are synched the same as the server, another check would be to log into the camera's web gui and go to Settings > System > PlainConfig > Webservices and make sure that the enable replay attack protection is unchecked.

