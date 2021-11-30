# Test output

```
[main] INFO org.onvif.client.TestDevice - 
getServiceCapabilities: [network=[ipFilter=true,zeroConfiguration=true,ipVersion6=true,dynDNS=true,dot11Configuration=,dot1XConfigurations=,hostnameFromDHCP=,ntp=1,dhcPv6=true,otherAttributes={}], 
security=[tls10=true,tls11=true,tls12=true,onboardKeyGeneration=true,accessPolicyConfig=true,defaultAccessPolicy=true,dot1X=,remoteUserHandling=,x509Token=,samlToken=,kerberosToken=,usernameToken=true,httpDigest=true,relToken=,supportedEAPMethods=,maxUsers=,maxUserNameLength=,maxPasswordLength=,securityPolicies=,maxPasswordHistory=,otherAttributes={}], 
system=[discoveryResolve=true,discoveryBye=true,remoteDiscovery=,systemBackup=,systemLogging=true,firmwareUpgrade=,httpFirmwareUpgrade=,httpSystemBackup=,httpSystemLogging=,httpSupportInformation=,storageConfiguration=,maxStorageConfigurations=,geoLocationEntries=,autoGeo=,storageTypesSupported=,discoveryNotSupported=,networkConfigNotSupported=,userConfigNotSupported=,otherAttributes={}], 
misc=[auxiliaryCommands=[tt:IRLamp|On, tt:IRLamp|Off, tt:IRLamp|Auto], 
otherAttributes={}]]
Media Profiles: 2
 Profile: profile_1 h264 token=profile_1_h264
 stream: rtsp://10.0.0.35/onvif-media/media.amp?profile=profile_1_h264&sessiontimeout=60&streamtype=unicast
 snapshot: http://10.0.0.35/onvif-cgi/jpg/image.cgi?resolution=1920x1080&compression=30
 details:[name=profile_1 h264,videoSourceConfiguration=[sourceToken=0,bounds=[x=0,y=0,width=1920,height=1080],any=,extension=[rotate=[mode=ON,degree=0,extension=,otherAttributes={}],extension=],viewMode=,otherAttributes={},name=user0,useCount=3,token=0],audioSourceConfiguration=,videoEncoderConfiguration=[encoding=H_264,resolution=[width=1920,height=1080],quality=70.0,rateControl=[frameRateLimit=30,encodingInterval=1,bitrateLimit=2147483647],mpeg4=,h264=[govLength=32,h264Profile=MAIN],multicast=[address=[type=I_PV_4,iPv4Address=0.0.0.0,iPv6Address=],port=0,ttl=5,autoStart=false,any=,otherAttributes={}],sessionTimeout=PT60S,any=,guaranteedFrameRate=,otherAttributes={},name=default_1 h264,useCount=1,token=default_1_h264],audioEncoderConfiguration=,videoAnalyticsConfiguration=,ptzConfiguration=,metadataConfiguration=,extension=,token=profile_1_h264,fixed=true,otherAttributes={}]
 Profile: profile_1 jpeg token=profile_1_jpeg
 stream: rtsp://10.0.0.35/onvif-media/media.amp?profile=profile_1_jpeg&sessiontimeout=60&streamtype=unicast
 snapshot: http://10.0.0.35/onvif-cgi/jpg/image.cgi?resolution=1920x1080&compression=30
 details:[name=profile_1 jpeg,videoSourceConfiguration=[sourceToken=0,bounds=[x=0,y=0,width=1920,height=1080],any=,extension=[rotate=[mode=ON,degree=0,extension=,otherAttributes={}],extension=],viewMode=,otherAttributes={},name=user0,useCount=3,token=0],audioSourceConfiguration=,videoEncoderConfiguration=[encoding=JPEG,resolution=[width=1920,height=1080],quality=70.0,rateControl=[frameRateLimit=30,encodingInterval=1,bitrateLimit=2147483647],mpeg4=,h264=,multicast=[address=[type=I_PV_4,iPv4Address=0.0.0.0,iPv6Address=],port=0,ttl=5,autoStart=false,any=,otherAttributes={}],sessionTimeout=PT60S,any=,guaranteedFrameRate=,otherAttributes={},name=default_1 jpeg,useCount=1,token=default_1_jpeg],audioEncoderConfiguration=,videoAnalyticsConfiguration=,ptzConfiguration=,metadataConfiguration=,extension=,token=profile_1_jpeg,fixed=true,otherAttributes={}]
VideoSources: 1
 [framerate=30.0,resolution=[width=1920,height=1080],imaging=,extension=,otherAttributes={},token=0]
Imaging:0
 getServiceCapabilities=[any=,imageStabilization=false,otherAttributes={Presets=false}]
 getImagingSettings=[backlightCompensation=,brightness=50.0,colorSaturation=50.0,contrast=50.0,exposure=[mode=AUTO,priority=FRAME_RATE,window=,minExposureTime=1.0,maxExposureTime=-1.0,minGain=0.0,maxGain=100.0,minIris=,maxIris=,exposureTime=,gain=,iris=],focus=[autoFocusMode=MANUAL,defaultSpeed=,nearLimit=,farLimit=,extension=,afMode=,otherAttributes={}],irCutFilter=AUTO,sharpness=50.0,wideDynamicRange=[mode=ON,level=],whiteBalance=[mode=AUTO,crGain=,cbGain=,extension=,otherAttributes={}],extension=[any=,imageStabilization=,extension=[irCutFilterAutoAdjustment=,extension=[toneCompensation=[mode=ON,level=0.5,extension=,otherAttributes={}],defogging=[mode=OFF,level=0.5,extension=,otherAttributes={}],noiseReduction=,extension=]]],otherAttributes={}]
 getMoveOptions=[absolute=[position=[min=0.0,max=1.0],speed=],relative=[distance=[min=-1.0,max=1.0],speed=],continuous=]
 getStatus=[focusStatus20=[position=0.73232746,moveStatus=IDLE,error=,extension=,otherAttributes={}],extension=,otherAttributes={}]
 getOptions=[backlightCompensation=,brightness=[min=0.0,max=100.0],colorSaturation=[min=0.0,max=100.0],contrast=[min=0.0,max=100.0],exposure=[mode=[AUTO, MANUAL],priority=[LOW_NOISE, FRAME_RATE],minExposureTime=[min=-60.0,max=2000000.0],maxExposureTime=[min=-60.0,max=2000000.0],minGain=[min=0.0,max=100.0],maxGain=[min=0.0,max=100.0],minIris=,maxIris=,exposureTime=[min=-60.0,max=2000000.0],gain=,iris=],focus=[autoFocusModes=[MANUAL, AUTO],defaultSpeed=,nearLimit=,farLimit=,extension=],irCutFilterModes=[OFF, ON, AUTO],sharpness=[min=0.0,max=100.0],wideDynamicRange=[mode=[OFF, ON],level=],whiteBalance=[mode=[AUTO, MANUAL],yrGain=,ybGain=,extension=],extension=[any=,imageStabilization=,extension=[irCutFilterAutoAdjustment=,extension=[toneCompensationOptions=[mode=[OFF, ON],level=true,any=,otherAttributes={}],defoggingOptions=[mode=[OFF, ON, AUTO],level=true,any=,otherAttributes={}],noiseReductionOptions=,extension=]]],otherAttributes={}]
AudioSources Unavailable: No audio support
Events:
 getServiceCapabilities=[any=,wsSubscriptionPolicySupport=,wsPullPointSupport=true,wsPausableSubscriptionManagerInterfaceSupport=,maxNotificationProducers=32,maxPullPoints=32,persistentNotificationStorage=,otherAttributes={}]
 MessageContentFilterDialects:
 http://www.onvif.org/ver10/tev/messageContentFilter/ItemFilter
 TopicExpressionDialects:
 http://www.onvif.org/ver10/tev/topicExpression/ConcreteSet
 http://docs.oasis-open.org/wsn/t-1/TopicExpression/Concrete
 Topics:
 tnsaxis:AudioControl - DigitalSignalStatus - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatus - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatusInvalid - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatusInvalid - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatusMetadata - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatusMetadata - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatusNoSignal - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatusNoSignal - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatusOK - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:AudioControl - DigitalSignalStatusOK - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:RingPowerLimitExceeded - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:RingPowerLimitExceeded - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:HardwareFailure - StorageFailure - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:HardwareFailure - StorageFailure - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:SystemMessage - ActionFailed - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - BlockedIP - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - Lost - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - Lost - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - AddressAdded - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - AddressAdded - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - AddressAdded - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - AddressRemoved - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - AddressRemoved - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Network - AddressRemoved - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Casing - Open - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Casing - Open - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - VirtualPort - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - VirtualPort - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - SupervisedPort - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - SupervisedPort - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - SupervisedPort - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - VirtualInput - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - VirtualInput - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - Port - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:IO - Port - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Sensor - PIR - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Sensor - PIR - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Light - Status - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Light - Status - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Status - SystemReady - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Status - Temperature - Below - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Status - Temperature - Inside - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Status - Temperature - Above - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Status - Temperature - Above_or_below - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - Trigger - DigitalInput - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - Trigger - DigitalInput - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - Trigger - Relay - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - Trigger - Relay - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:MQTT - ClientStatus - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:MQTT - ClientStatus - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Heater - Status - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Device - tnsaxis:Heater - Status - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:LightControl - tnsaxis:LightStatusChanged - Status - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - tnsaxis:LiveStreamAccessed - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - tnsaxis:DayNightVision - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - tnsaxis:DayNightVision - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - tnsaxis:ABR - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - tnsaxis:ABR - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - tnsaxis:Tampering - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - tnsaxis:Tampering - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - GlobalSceneChange - ImagingService - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:VideoSource - GlobalSceneChange - ImagingService - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:PTZController - tnsaxis:PTZError - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:PTZController - tnsaxis:PTZError - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:PTZController - tnsaxis:PTZReady - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:PTZController - tnsaxis:PTZReady - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - CreateRecording - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - CreateTrack - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - CreateTrack - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - DeleteRecording - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - DeleteTrack - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - DeleteTrack - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - JobState - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - JobState - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - JobState - tt:MessageDescription - tt:Data - tt:ElementItemDescription - tt:ElementItemDescription
 tns1:RecordingConfig - RecordingConfiguration - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - RecordingConfiguration - tt:MessageDescription - tt:Data - tt:ElementItemDescription - tt:ElementItemDescription
 tns1:RecordingConfig - RecordingJobConfiguration - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - RecordingJobConfiguration - tt:MessageDescription - tt:Data - tt:ElementItemDescription - tt:ElementItemDescription
 tns1:RecordingConfig - TrackConfiguration - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - TrackConfiguration - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:RecordingConfig - TrackConfiguration - tt:MessageDescription - tt:Data - tt:ElementItemDescription - tt:ElementItemDescription
 tnsaxis:Storage - Alert - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Storage - Alert - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Storage - Alert - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Storage - Alert - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Storage - Alert - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Storage - Disruption - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Storage - Disruption - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Storage - Recording - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Media - ConfigurationChanged - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Media - ConfigurationChanged - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:Media - ProfileChanged - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:MediaClip - Playing - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:MediaClip - Playing - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:MediaClip - CurrentlyPlaying - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:MediaClip - CurrentlyPlaying - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:MQTT - Message - Stateless - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:MQTT - Message - Stateless - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:UserAlarm - tnsaxis:Recurring - Interval - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tns1:UserAlarm - tnsaxis:Recurring - Interval - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - SIPAccountStatus - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - SIPAccountStatus - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - SIPAccountStatus - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - SIPAccountStatus - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - SIPAccountStatus - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - StateChange - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - StateChange - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - StateChange - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - StateChange - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - StateChange - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - StateChange - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - StateChange - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - StateChange - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - IncomingVideo - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - IncomingVideo - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - State - tt:MessageDescription - tt:Source - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - State - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - NetworkQuality - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - NetworkQuality - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
 tnsaxis:Call - NetworkQuality - tt:MessageDescription - tt:Data - tt:SimpleItemDescription - tt:SimpleItemDescription
```


