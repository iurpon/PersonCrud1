package ru.trandefil.tm.endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import ru.trandefil.tm.generated.AdminEndPoint;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-02-28T11:43:18.214+03:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "AdminEndPointImplService",
                  wsdlLocation = "http://localhost:8080/adminEndPoint?wsdl",
                  targetNamespace = "http://endpoint.tm.trandefil.ru/")
public class AdminEndPointImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://endpoint.tm.trandefil.ru/", "AdminEndPointImplService");
    public final static QName AdminEndPointImplPort = new QName("http://endpoint.tm.trandefil.ru/", "AdminEndPointImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/adminEndPoint?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AdminEndPointImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/adminEndPoint?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AdminEndPointImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AdminEndPointImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdminEndPointImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AdminEndPointImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AdminEndPointImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AdminEndPointImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AdminEndPoint
     */
    @WebEndpoint(name = "AdminEndPointImplPort")
    public AdminEndPoint getAdminEndPointImplPort() {
        return super.getPort(AdminEndPointImplPort, AdminEndPoint.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdminEndPoint
     */
    @WebEndpoint(name = "AdminEndPointImplPort")
    public AdminEndPoint getAdminEndPointImplPort(WebServiceFeature... features) {
        return super.getPort(AdminEndPointImplPort, AdminEndPoint.class, features);
    }

}
