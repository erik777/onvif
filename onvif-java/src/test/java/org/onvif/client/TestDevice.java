package org.onvif.client;

import de.onvif.beans.DeviceInfo;
import de.onvif.soap.OnvifDevice;
import de.onvif.utils.OnvifUtils;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.xml.soap.SOAPException;
import org.onvif.ver10.device.wsdl.DeviceServiceCapabilities;
import org.onvif.ver10.events.wsdl.EventPortType;
import org.onvif.ver10.events.wsdl.GetEventProperties;
import org.onvif.ver10.events.wsdl.GetEventPropertiesResponse;
import org.onvif.ver10.media.wsdl.Media;
import org.onvif.ver10.schema.AudioSource;
import org.onvif.ver10.schema.Config;
import org.onvif.ver10.schema.ConfigDescription;
import org.onvif.ver10.schema.ItemList;
import org.onvif.ver10.schema.ItemList.SimpleItem;
import org.onvif.ver10.schema.MetadataConfiguration;
import org.onvif.ver10.schema.PTZPreset;
import org.onvif.ver10.schema.PTZStatus;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.VideoAnalyticsConfiguration;
import org.onvif.ver10.schema.VideoSource;
import org.onvif.ver20.analytics.wsdl.AnalyticsEnginePort;
import org.onvif.ver20.imaging.wsdl.ImagingPort;
import org.onvif.ver20.ptz.wsdl.Capabilities;
import org.onvif.ver20.ptz.wsdl.PTZ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/** @author Brad Lowe */
public class TestDevice {
	private static final Logger LOG = LoggerFactory.getLogger(TestDevice.class);

	public static String testCamera(OnvifCredentials creds) throws SOAPException, IOException {
		URL u = creds.getHost().startsWith("http") ? new URL(creds.getHost()) : new URL("http://" + creds.getHost());
		return testCamera(u, creds.getUser(), creds.getPassword());
	}

	static String sep = "\n";

	private static void pause(long millis, String msg) {
		try {
			if (millis > 0)
				Thread.currentThread().sleep(millis);
		} catch (InterruptedException e1) {
		}
		System.out.println(msg);
	}

	public static long pauseTime = 0;

	// This method returns information about an initialized OnvifDevice.
	// This could throw an uncaught SOAP or other error on some cameras...
	// Would accept Pull Requests on printing out additional information about
	// devices.
	public static String inspect(OnvifDevice device) {
		System.out.println("inspect...");

		String out = "";
		pause(pauseTime, "info...");
		DeviceInfo info = device.getDeviceInfo();
		pause(pauseTime, "info!");
		System.out.println("capabilities...");
		DeviceServiceCapabilities caps = device.getDevice().getServiceCapabilities();
		String sysCaps = OnvifUtils.format(caps);
		sysCaps = sysCaps.replace("],", "],\t\n");

		out += "\tgetServiceCapabilities: " + sysCaps + sep;
		// out += "\tgetServiceCapabilities.getSystem: " +
		// OnvifUtils.format(caps.getSystem()) + sep;

		pause(pauseTime, "capabilities... " + out);
		System.out.println("media... ");
		Media media = device.getMedia();

		pause(pauseTime, "video sources... ");
		media.getVideoSources();
		pause(pauseTime, "profiles... ");
		List<Profile> profiles = media.getProfiles();
		out += "Media Profiles: " + profiles.size() + sep;
		for (Profile profile : profiles) {
			String profileToken = profile.getToken();
			pause(pauseTime, "stream uri... profile token: " + profileToken);
			String rtsp = device.getStreamUri(profileToken);
			out += "\tProfile: " + profile.getName() + " token=" + profile.getToken() + sep;
			out += "\t\tstream: " + rtsp + sep;
			if (profile.getMetadataConfiguration() != null) {
//				profile.getMetadataConfiguration().get;
				String metaToken = profile.getMetadataConfiguration().getToken();
				out += "\t\tmetadata token: " + metaToken + sep;
//				out += "\t\tmetadata stream: " + device.getStreamUri(new Integer(metaToken)) + sep;
			} else {
				out += "\t\tgetMetadataConfiguration: " + null + sep;
			}
			pause(pauseTime, "getSnapshotUri... ");
			try {
				out += "\t\tsnapshot: " + device.getSnapshotUri(profileToken) + sep;
			} catch (Exception e) {
				out += "\t\tsnapshot: " + e.getMessage() + sep;
			}
			out += "\t\tdetails:" + OnvifUtils.format(profile) + sep;
		}
		pause(pauseTime, "getVideoSources... ");

		try {
			List<VideoSource> videoSources = media.getVideoSources();
			out += "VideoSources: " + videoSources.size() + sep;
			for (VideoSource v : videoSources)
				out += "\t" + OnvifUtils.format(v) + sep;

			pause(pauseTime, "getImaging... ");
			ImagingPort imaging = device.getImaging();
			if (imaging != null && videoSources.size() > 0) {
				String token = videoSources.get(0).getToken();

				out += "Imaging:" + token + sep;
				try {
					pause(pauseTime, "getServiceCapabilities... ");
					org.onvif.ver20.imaging.wsdl.Capabilities image_caps = imaging.getServiceCapabilities();
					out += "\tgetServiceCapabilities=" + OnvifUtils.format(image_caps) + sep;

					if (token != null) {
						pause(pauseTime, "getImagingSettings... ");
						out += "\tgetImagingSettings=" + OnvifUtils.format(imaging.getImagingSettings(token)) + sep;
						pause(pauseTime, "getImagingSettings... ");
						out += "\tgetMoveOptions=" + OnvifUtils.format(imaging.getMoveOptions(token)) + sep;
						pause(pauseTime, "getImagingSettings... ");
						out += "\tgetStatus=" + OnvifUtils.format(imaging.getStatus(token)) + sep;
						pause(pauseTime, "getImagingSettings... ");
						out += "\tgetOptions=" + OnvifUtils.format(imaging.getOptions(token)) + sep;
					}
				} catch (Throwable th) {
					out += "Imaging unavailable:" + th.getMessage() + sep;
				}
			}
		} catch (Throwable th) {
			// this can fail if the device doesn't support video sources.
			out += "VideoSources: " + th.getMessage() + sep;
		}
		
    	try {
    		List<MetadataConfiguration> aConfigs = media.getMetadataConfigurations();
			if (aConfigs != null && aConfigs.size() > 0) {
				out += "MetadataConfiguration items: " + aConfigs.size() + sep;
				for (MetadataConfiguration cfg : aConfigs) {
					out += "\t" + cfg.getName() + ": " + cfg.toString() + sep;
					out += "\t\t Analytics? " + cfg.getAnalytics() + sep;
					if ("user0".equals(cfg.getName())) {
						// update 
						cfg.setAnalytics(true);
						media.setMetadataConfiguration(cfg, false);
					}
				}
			} else {
				out += "No MetadataConfiguration items returned" + sep;
			}
		} catch (Throwable th) {
			out += "! ERROR Cannot obtain media.getMetadataConfigurations(): " + th.getMessage() + sep;
		}

		try {
			// This may throw a SoapFaultException with the message "This device does not
			// support audio"
			pause(pauseTime, "getAudioSources... ");
			List<AudioSource> audioSources = media.getAudioSources();
			out += "AudioSources: " + audioSources.size() + sep;
			for (AudioSource a : audioSources)
				out += "\t" + OnvifUtils.format(a) + sep;
		} catch (Throwable th) {
			out += "AudioSources Unavailable: " + th.getMessage() + sep;
		}

		boolean showTopics = false;
		try {
			EventPortType events = device.getEvents();
			if (events != null) {
				out += "Events:" + sep;
				pause(pauseTime, "getServiceCapabilities... ");
				out += "\tgetServiceCapabilities=" + OnvifUtils.format(events.getServiceCapabilities()) + sep;

				pause(pauseTime, "getEventProperties... ");
				GetEventProperties getEventProperties = new GetEventProperties();
				GetEventPropertiesResponse getEventPropertiesResp = events.getEventProperties(getEventProperties);
				out += "\tMessageContentFilterDialects:" + sep;
				for (String f : getEventPropertiesResp.getMessageContentFilterDialect())
					out += ("\t\t" + f + sep);
				out += "\tTopicExpressionDialects:" + sep;
				for (String f : getEventPropertiesResp.getTopicExpressionDialect())
					out += ("\t\t" + f + sep);

				out += "\tTopics:" + sep;
				if (showTopics) {
					StringBuffer tree = new StringBuffer();
					for (Object object : getEventPropertiesResp.getTopicSet().getAny()) {
						Element e = (Element) object;
						printTree(e, e.getNodeName(), tree);
						// WsNotificationTest.printTree(e, e.getNodeName());
					}
					out += tree;
				}
			}
		} catch (Throwable th) {
			out += "Events Unavailable: " + th.getMessage() + sep;
		}
		PTZ ptz = device.getPtz();
		if (ptz != null) {

			String profileToken = profiles.get(0).getToken();
			try {
				Capabilities ptz_caps = ptz.getServiceCapabilities();
				out += "PTZ:" + sep;
				out += "\tgetServiceCapabilities=" + OnvifUtils.format(ptz_caps) + sep;
				PTZStatus s = ptz.getStatus(profileToken);
				out += "\tgetStatus=" + OnvifUtils.format(s) + sep;
				// out += "ptz.getConfiguration=" + ptz.getConfiguration(profileToken) + sep;
				List<PTZPreset> presets = ptz.getPresets(profileToken);
				if (presets != null && !presets.isEmpty()) {
					out += "\tPresets:" + presets.size() + sep;
					for (PTZPreset p : presets)
						out += "\t\t" + OnvifUtils.format(p) + sep;
				}
			} catch (Throwable th) {
				out += "PTZ: Unavailable" + th.getMessage() + sep;
			}
		}
		
    	// analytics
		VideoAnalyticsConfiguration vac = null;
		String task = "obtain media.getVideoAnalyticsConfigurations()";
    	try {
			List<VideoAnalyticsConfiguration> aConfigs = media.getVideoAnalyticsConfigurations();
			if (aConfigs != null && aConfigs.size() > 0) {
				vac = aConfigs.get(0);   // used below for rules
				out += "VideoAnalyticsConfiguration items: " + aConfigs.size() + sep;
				task = "iterating configs";
				AnalyticsEnginePort analyticsEngine = device.getAnalyticsEngine();
				for (VideoAnalyticsConfiguration cfg : aConfigs) {
					out += "\tName: " + cfg.getName() + ", Token: " + cfg.getToken() + ": " + cfg.toString() + sep;
					task = "iterating configs - getting modules for token " + cfg.getToken();
					List<Config> modules = analyticsEngine.getAnalyticsModules(cfg.getToken());
					task = "...iterating configs - getting modules for token " + cfg.getToken();
					if (modules != null) {
						out +=  "\t\tModules: " + modules.size() + sep;
						for (Config module : modules) {
							// List module parameters
							ItemList params = module.getParameters();
							out += "\t\t\tName: " + module.getName() + ", type: " + module.getType() + ", params: " + params + sep;
							if (params != null) {
								for (SimpleItem item : params.getSimpleItem()) {
									out += "\t\t\t\tParam: " + item.getName() + sep;
								}
							}
						}
					}
					
					// other attributes
					if (cfg.getOtherAttributes() != null) {
						out += "\t\tgetOtherAttributes: " + cfg.getOtherAttributes().size() + sep;
					}

				}
			} else {
				out += "No VideoAnalyticsConfiguration items returned" + sep;
			}
			out += "\t\tprofile getRule " +
					  media.getVideoAnalyticsConfiguration("0").getRuleEngineConfiguration()
					  .getRule() + sep;
			out += "\t\tprofile getExtension " +
					  media.getVideoAnalyticsConfiguration("0").getRuleEngineConfiguration()
					  .getExtension() +
					  sep;
			out += "\t\tprofile getOtherAttributes " +
					  media.getVideoAnalyticsConfiguration("0").getRuleEngineConfiguration()
					  .getOtherAttributes().size() +
					  sep;
			//here
		} catch (Throwable th) {
			out += "! ERROR Cannot " + task + ": " + th.getMessage() + sep;
			// Cannot obtain media.getVideoAnalyticsConfigurations(): 
			// Can not set org.onvif.ver10.schema.Object field org.onvif.ver10.schema.ItemList$ElementItem.any to 
			// com.sun.org.apache.xerces.internal.dom.ElementNSImpl
		}

		try {
			org.onvif.ver20.analytics.wsdl.Capabilities ae_caps = device.getAnalyticsEngine().getServiceCapabilities();
			out += "Analytics Engine:" + sep;
			out += "\tgetServiceCapabilities=" + OnvifUtils.format(ae_caps) + sep;
			
//			List<Config> configs = device.getAnalyticsEngine().getAnalyticsModules("analytics0");
//			out += "Analytics modules for analytics0: " + configs.size() + sep;
			String token ;
			
			if (vac != null) {
				token = vac.getToken();
				System.out.println("Using vac.getToken(): " + token);
			} else {
				token = "0";   // temp workaround getVideoAnalyticsConfigurations() error for now
				System.out.println("Using temp token for getVideoAnalyticsConfigurations(): " + token);
			}
			if (device.getRulesEngine() != null) {
				out += "\tRules Engine: token: " + token + sep;
				device.getRulesEngine().getSupportedRules(token);
				List<Config> rules = device.getRulesEngine().getRules(token);
				out += "\t\tRules: " + rules.size() + sep;
				for (Config rule : rules) {
					out += "\t\t\tName: " + rule.getName();
				}
			} else {
				out += "\tNo rules engine" + sep;
			}
			//here
			// 	roof: getServiceCapabilities=[any=,ruleSupport=true,analyticsModuleSupport=false,cellBasedSceneDescriptionSupported=,ruleOptionsSupported=true,analyticsModuleOptionsSupported=,supportedMetadata=,imageSendingType=,otherAttributes={}]
		} catch (Exception e) {
			out += "AnalyticsEngine Exception: " + e.getMessage() + sep;
			e.printStackTrace();
		} catch (Throwable th) {
			out += "AnalyticsEngine Unavailable: " + th.getMessage() + sep;
		}

		return out;
	}

	public static void printTree(Node node, String name, StringBuffer buffer) {
		if (node.hasChildNodes()) {
			NodeList nodes = node.getChildNodes();
			for (int i = 0; i < nodes.getLength(); i++) {
				Node n = nodes.item(i);
				printTree(n, name + " - " + n.getNodeName(), buffer);
			}
		} else {
			buffer.append("\t\t" + name + " - [" + node.getNodeName() + "]\n");
		}
	}

	public static String testCamera(URL url, String user, String password) throws SOAPException, IOException {
		LOG.info("Testing camera:" + url);
		OnvifDevice device = new OnvifDevice(url, user, password);

//    LOG.info( String.format("Connected to device %s %n", device.getDeviceInfo()) );
		System.out.printf("Connected to device %s %n", device.getDeviceInfo());
		LOG.info("Inspecting:" + device);
		return inspect(device);
//    return "OK";
	}

	public static void main(String[] args) {
		OnvifCredentials creds = GetTestDevice.getOnvifCredentials(args);
		try {
			// OnvifDevice.setVerbose(true);
			String out = testCamera(creds);

			LOG.info("\n" + out + "\n");
		} catch (Throwable th) {
			LOG.error("Failed for " + creds, th);
			th.printStackTrace();
		}
	}
}
