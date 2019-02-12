package ru.trandefil.tm.endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import ru.trandefil.tm.generated.FileEndPoint;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-02-12T11:19:42.534+03:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "FileEndPointImplService",
                  wsdlLocation = "http://localhost:8080/fileEndPoint?wsdl",
                  targetNamespace = "http://endpoint.tm.trandefil.ru/")
public class FileEndPointImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://endpoint.tm.trandefil.ru/", "FileEndPointImplService");
    public final static QName FileEndPointImplPort = new QName("http://endpoint.tm.trandefil.ru/", "FileEndPointImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/fileEndPoint?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FileEndPointImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/fileEndPoint?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FileEndPointImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FileEndPointImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FileEndPointImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public FileEndPointImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FileEndPointImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FileEndPointImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns FileEndPoint
     */
    @WebEndpoint(name = "FileEndPointImplPort")
    public FileEndPoint getFileEndPointImplPort() {
        return super.getPort(FileEndPointImplPort, FileEndPoint.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FileEndPoint
     */
    @WebEndpoint(name = "FileEndPointImplPort")
    public FileEndPoint getFileEndPointImplPort(WebServiceFeature... features) {
        return super.getPort(FileEndPointImplPort, FileEndPoint.class, features);
    }

}
