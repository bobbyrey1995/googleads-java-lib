
package com.google.api.ads.adwords.jaxws.v201402.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CampaignSharedSetService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201402/CampaignSharedSetService?wsdl")
public class CampaignSharedSetService
    extends Service
{

    private final static URL CAMPAIGNSHAREDSETSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAMPAIGNSHAREDSETSERVICE_EXCEPTION;
    private final static QName CAMPAIGNSHAREDSETSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201402", "CampaignSharedSetService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201402/CampaignSharedSetService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMPAIGNSHAREDSETSERVICE_WSDL_LOCATION = url;
        CAMPAIGNSHAREDSETSERVICE_EXCEPTION = e;
    }

    public CampaignSharedSetService() {
        super(__getWsdlLocation(), CAMPAIGNSHAREDSETSERVICE_QNAME);
    }

    public CampaignSharedSetService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CampaignSharedSetServiceInterface
     */
    @WebEndpoint(name = "CampaignSharedSetServiceInterfacePort")
    public CampaignSharedSetServiceInterface getCampaignSharedSetServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201402", "CampaignSharedSetServiceInterfacePort"), CampaignSharedSetServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CampaignSharedSetServiceInterface
     */
    @WebEndpoint(name = "CampaignSharedSetServiceInterfacePort")
    public CampaignSharedSetServiceInterface getCampaignSharedSetServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201402", "CampaignSharedSetServiceInterfacePort"), CampaignSharedSetServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMPAIGNSHAREDSETSERVICE_EXCEPTION!= null) {
            throw CAMPAIGNSHAREDSETSERVICE_EXCEPTION;
        }
        return CAMPAIGNSHAREDSETSERVICE_WSDL_LOCATION;
    }

}
