package ru.trandefil.tm.generated;

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
 * 2019-02-13T13:24:32.553+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://generated.tm.trandefil.ru/", name = "UserEndPoint")
@XmlSeeAlso({ObjectFactory.class})
public interface UserEndPoint {

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/UserEndPoint/getAllUsersRequest", output = "http://generated.tm.trandefil.ru/UserEndPoint/getAllUsersResponse")
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetAllUsers")
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetAllUsersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.trandefil.tm.generated.User> getAllUsers(
        @WebParam(name = "session", targetNamespace = "")
        ru.trandefil.tm.generated.Session session
    );

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/UserEndPoint/deleteUserByNameRequest", output = "http://generated.tm.trandefil.ru/UserEndPoint/deleteUserByNameResponse")
    @RequestWrapper(localName = "deleteUserByName", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.DeleteUserByName")
    @ResponseWrapper(localName = "deleteUserByNameResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.DeleteUserByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.User deleteUserByName(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "session", targetNamespace = "")
        ru.trandefil.tm.generated.Session session
    );

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/UserEndPoint/getUserByNameRequest", output = "http://generated.tm.trandefil.ru/UserEndPoint/getUserByNameResponse")
    @RequestWrapper(localName = "getUserByName", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetUserByName")
    @ResponseWrapper(localName = "getUserByNameResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetUserByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.User getUserByName(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "session", targetNamespace = "")
        ru.trandefil.tm.generated.Session session
    );

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/UserEndPoint/saveUserRequest", output = "http://generated.tm.trandefil.ru/UserEndPoint/saveUserResponse")
    @RequestWrapper(localName = "saveUser", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveUser")
    @ResponseWrapper(localName = "saveUserResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.User saveUser(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "pass", targetNamespace = "")
        java.lang.String pass,
        @WebParam(name = "role", targetNamespace = "")
        java.lang.String role,
        @WebParam(name = "arg3", targetNamespace = "")
        ru.trandefil.tm.generated.Session arg3
    );

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/UserEndPoint/getSessionRequest", output = "http://generated.tm.trandefil.ru/UserEndPoint/getSessionResponse")
    @RequestWrapper(localName = "getSession", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetSession")
    @ResponseWrapper(localName = "getSessionResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetSessionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.Session getSession(
        @WebParam(name = "userName", targetNamespace = "")
        java.lang.String userName,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/UserEndPoint/userLogoutRequest", output = "http://generated.tm.trandefil.ru/UserEndPoint/userLogoutResponse")
    @RequestWrapper(localName = "userLogout", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.UserLogout")
    @ResponseWrapper(localName = "userLogoutResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.UserLogoutResponse")
    public void userLogout(
        @WebParam(name = "session", targetNamespace = "")
        ru.trandefil.tm.generated.Session session
    );
}
