
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.trandefil.tm.api;

import java.util.List;
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
 * 2019-02-07T17:02:23.418+03:00
 * Generated source version: 3.2.7
 *
 */

@javax.jws.WebService(
                      serviceName = "ProjectEndPointImplService",
                      portName = "ProjectEndPointImplPort",
                      targetNamespace = "http://endpoint.tm.trandefil.ru/",
                      wsdlLocation = "http://localhost:8080/projectEndPoint?wsdl",
                      endpointInterface = "ru.trandefil.tm.api.ProjectEndPoint")

public class ProjectEndPointImplPortImpl implements ProjectEndPoint {

    private static final Logger LOG = Logger.getLogger(ProjectEndPointImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see ru.trandefil.tm.api.ProjectEndPoint#getByName(java.lang.String projectName)*
     */
    public ru.trandefil.tm.api.Project getByName(java.lang.String projectName) {
        LOG.info("Executing operation getByName");
        System.out.println(projectName);
        try {
            ru.trandefil.tm.api.Project _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.trandefil.tm.api.ProjectEndPoint#save(ru.trandefil.tm.api.Project project)*
     */
    public ru.trandefil.tm.api.Project save(ru.trandefil.tm.api.Project project) {
        LOG.info("Executing operation save");
        System.out.println(project);
        try {
            ru.trandefil.tm.api.Project _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.trandefil.tm.api.ProjectEndPoint#deleteByName(java.lang.String projectName)*
     */
    public void deleteByName(java.lang.String projectName) {
        LOG.info("Executing operation deleteByName");
        System.out.println(projectName);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.trandefil.tm.api.ProjectEndPoint#delete(ru.trandefil.tm.api.Project project)*
     */
    public void delete(ru.trandefil.tm.api.Project project) {
        LOG.info("Executing operation delete");
        System.out.println(project);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.trandefil.tm.api.ProjectEndPoint#getAll()*
     */
    public java.util.List<ru.trandefil.tm.api.Project> getAll() {
        LOG.info("Executing operation getAll");
        try {
            java.util.List<ru.trandefil.tm.api.Project> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.trandefil.tm.api.ProjectEndPoint#getById(java.lang.String id)*
     */
    public ru.trandefil.tm.api.Project getById(java.lang.String id) {
        LOG.info("Executing operation getById");
        System.out.println(id);
        try {
            ru.trandefil.tm.api.Project _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args){
        List<Project> projectList = new ProjectEndPointImplPortImpl().getAll();
        projectList.forEach(System.out::println);
    }

}
