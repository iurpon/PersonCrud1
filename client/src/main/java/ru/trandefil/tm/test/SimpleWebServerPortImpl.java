
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.trandefil.tm.test;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-02-07T10:42:57.152+03:00
 * Generated source version: 3.2.7
 *
 */

@javax.jws.WebService(
                      serviceName = "SimpleWebServerService",
                      portName = "SimpleWebServerPort",
                      targetNamespace = "http://test.tm.trandefil.ru/",
                      wsdlLocation = "http://localhost:8080/simpleWebService?wsdl",
                      endpointInterface = "ru.trandefil.tm.test.SimpleWebServer")

public class SimpleWebServerPortImpl implements SimpleWebServer {

    private static final Logger LOG = Logger.getLogger(SimpleWebServerPortImpl.class.getName());

    /* (non-Javadoc)
     * @see ru.trandefil.tm.test.SimpleWebServer#sum(int a, int b)*
     */
    public int sum(int a, int b) {
        LOG.info("Executing operation sum");
        System.out.println(a);
        System.out.println(b);
        try {
            int _return = 0;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
