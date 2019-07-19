package org.onvif.ver10.accessrules.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", name = "AccessRulesPort")
@XmlSeeAlso({ObjectFactory.class, org.onvif.ver10.pacs.ObjectFactory.class})
public interface AccessRulesPort {

    /**
     * This operation will modify the access profile for the specified access profile token. If several access
     * 				policies specifying different schedules for the same access point will result in a union of the
     * 				schedule.
     * 				If the device could not store the access profile information then a fault will be generated.
     * 			
     */
    @WebMethod(operationName = "ModifyAccessProfile", action = "http://www.onvif.org/ver10/accessrules/wsdl/ModifyAccessProfile")
    @RequestWrapper(localName = "ModifyAccessProfile", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.ModifyAccessProfile")
    @ResponseWrapper(localName = "ModifyAccessProfileResponse", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.ModifyAccessProfileResponse")
    public void modifyAccessProfile(

        @WebParam(name = "AccessProfile", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        org.onvif.ver10.accessrules.wsdl.AccessProfile accessProfile
    );

    /**
     * This operation returns the specified access profile item matching the given tokens.
     * 				The device shall ignore tokens it cannot resolve and shall return an empty list if there are no items
     * 				matching specified tokens. The device shall not return a fault in this case.
     * 			
     */
    @WebMethod(operationName = "GetAccessProfiles", action = "http://www.onvif.org/ver10/accessrules/wsdl/GetAccessProfiles")
    @RequestWrapper(localName = "GetAccessProfiles", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetAccessProfiles")
    @ResponseWrapper(localName = "GetAccessProfilesResponse", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetAccessProfilesResponse")
    @WebResult(name = "AccessProfile", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
    public java.util.List<org.onvif.ver10.accessrules.wsdl.AccessProfile> getAccessProfiles(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        java.util.List<java.lang.String> token
    );

    /**
     * This operation requests a list of AccessProfileInfo items matching the given tokens. The device shall
     * 				ignore tokens it cannot resolve and shall return an empty list if there are no items matching specified
     * 				tokens. The device shall not return a fault in this case.
     * 				If the number of requested items is greater than MaxLimit, a TooManyItems fault shall be returned.
     * 			
     */
    @WebMethod(operationName = "GetAccessProfileInfo", action = "http://www.onvif.org/ver10/accessrules/wsdl/GetAccessProfileInfo")
    @RequestWrapper(localName = "GetAccessProfileInfo", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetAccessProfileInfo")
    @ResponseWrapper(localName = "GetAccessProfileInfoResponse", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetAccessProfileInfoResponse")
    @WebResult(name = "AccessProfileInfo", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
    public java.util.List<org.onvif.ver10.accessrules.wsdl.AccessProfileInfo> getAccessProfileInfo(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        java.util.List<java.lang.String> token
    );

    /**
     * This operation returns the capabilities of the access rules service.
     * 			
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/accessrules/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
    public org.onvif.ver10.accessrules.wsdl.ServiceCapabilities getServiceCapabilities()
;

    /**
     * This operation requests a list of all of access profile items provided by the device.
     * 				A call to this method shall return a StartReference when not all data is returned and more data is
     * 				available. The reference shall be valid for retrieving the next set of data. Please refer Access Control
     * 				Service Specification for more details.
     * 				The number of items returned shall not be greater the Limit parameter.
     * 			
     */
    @WebMethod(operationName = "GetAccessProfileList", action = "http://www.onvif.org/ver10/accessrules/wsdl/GetAccessProfileList")
    @RequestWrapper(localName = "GetAccessProfileList", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetAccessProfileList")
    @ResponseWrapper(localName = "GetAccessProfileListResponse", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetAccessProfileListResponse")
    public void getAccessProfileList(

        @WebParam(name = "Limit", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        java.lang.Integer limit,
        @WebParam(name = "StartReference", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        java.lang.String startReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "NextStartReference", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        javax.xml.ws.Holder<java.lang.String> nextStartReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "AccessProfile", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        javax.xml.ws.Holder<java.util.List<org.onvif.ver10.accessrules.wsdl.AccessProfile>> accessProfile
    );

    /**
     * This operation will delete the specified access profile.
     * 				If it is associated with one or more entities some devices may not be able to delete the access profile,
     * 				and consequently a ReferenceInUse fault shall be generated.
     * 				If the access profile is deleted, all access policies associated to the access profile will also be
     * 				deleted.
     * 			
     */
    @WebMethod(operationName = "DeleteAccessProfile", action = "http://www.onvif.org/ver10/accessrules/wsdl/DeleteAccessProfile")
    @RequestWrapper(localName = "DeleteAccessProfile", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.DeleteAccessProfile")
    @ResponseWrapper(localName = "DeleteAccessProfileResponse", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.DeleteAccessProfileResponse")
    public void deleteAccessProfile(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        java.lang.String token
    );

    /**
     * This operation creates the specified access profile. The token field of the access profile shall be
     * 				empty, the service shall allocate a token for the access profile. The allocated token shall be returned
     * 				in the response. If the client sends any value in the token field, the device shall return InvalidArgVal
     * 				as generic fault code.
     * 				In an access profile, if several access policies specifying different schedules for the same access
     * 				point will result in a union of the schedule.
     * 			
     */
    @WebMethod(operationName = "CreateAccessProfile", action = "http://www.onvif.org/ver10/accessrules/wsdl/CreateAccessProfile")
    @RequestWrapper(localName = "CreateAccessProfile", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.CreateAccessProfile")
    @ResponseWrapper(localName = "CreateAccessProfileResponse", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.CreateAccessProfileResponse")
    @WebResult(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
    public java.lang.String createAccessProfile(

        @WebParam(name = "AccessProfile", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        org.onvif.ver10.accessrules.wsdl.AccessProfile accessProfile
    );

    /**
     * This operation requests a list of all of AccessProfileInfo items provided by the device.
     * 				A call to this method shall return a StartReference when not all data is returned and more data is
     * 				available. The reference shall be valid for retrieving the next set of data. Please refer Access Control
     * 				Service Specification for more details.
     * 				The number of items returned shall not be greater than Limit parameter.
     * 			
     */
    @WebMethod(operationName = "GetAccessProfileInfoList", action = "http://www.onvif.org/ver10/accessrules/wsdl/GetAccessProfileInfoList")
    @RequestWrapper(localName = "GetAccessProfileInfoList", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetAccessProfileInfoList")
    @ResponseWrapper(localName = "GetAccessProfileInfoListResponse", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl", className = "org.onvif.ver10.accessrules.wsdl.GetAccessProfileInfoListResponse")
    public void getAccessProfileInfoList(

        @WebParam(name = "Limit", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        java.lang.Integer limit,
        @WebParam(name = "StartReference", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        java.lang.String startReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "NextStartReference", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        javax.xml.ws.Holder<java.lang.String> nextStartReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "AccessProfileInfo", targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
        javax.xml.ws.Holder<java.util.List<org.onvif.ver10.accessrules.wsdl.AccessProfileInfo>> accessProfileInfo
    );
}
