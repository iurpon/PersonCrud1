package ru.trandefil.tm.generated;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-02-13T14:10:14.764+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://generated.tm.trandefil.ru/", name = "FileEndPoint")
@XmlSeeAlso({ObjectFactory.class})
public interface FileEndPoint {

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/loadJsonRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/loadJsonResponse")
    @RequestWrapper(localName = "loadJson", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.LoadJson")
    @ResponseWrapper(localName = "loadJsonResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.LoadJsonResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.Domain loadJson();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/loadBinRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/loadBinResponse")
    @RequestWrapper(localName = "loadBin", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.LoadBin")
    @ResponseWrapper(localName = "loadBinResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.LoadBinResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.Domain loadBin();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/loadXmlRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/loadXmlResponse")
    @RequestWrapper(localName = "loadXml", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.LoadXml")
    @ResponseWrapper(localName = "loadXmlResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.LoadXmlResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.Domain loadXml();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/clearXmlRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/clearXmlResponse")
    @RequestWrapper(localName = "clearXml", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.ClearXml")
    @ResponseWrapper(localName = "clearXmlResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.ClearXmlResponse")
    public void clearXml();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/clearBinRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/clearBinResponse")
    @RequestWrapper(localName = "clearBin", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.ClearBin")
    @ResponseWrapper(localName = "clearBinResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.ClearBinResponse")
    public void clearBin();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/saveJsonRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/saveJsonResponse")
    @RequestWrapper(localName = "saveJson", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveJson")
    @ResponseWrapper(localName = "saveJsonResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveJsonResponse")
    public void saveJson();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/saveXmlRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/saveXmlResponse")
    @RequestWrapper(localName = "saveXml", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveXml")
    @ResponseWrapper(localName = "saveXmlResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveXmlResponse")
    public void saveXml();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/saveBinRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/saveBinResponse")
    @RequestWrapper(localName = "saveBin", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveBin")
    @ResponseWrapper(localName = "saveBinResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveBinResponse")
    public void saveBin();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/FileEndPoint/clearJsonRequest", output = "http://generated.tm.trandefil.ru/FileEndPoint/clearJsonResponse")
    @RequestWrapper(localName = "clearJson", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.ClearJson")
    @ResponseWrapper(localName = "clearJsonResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.ClearJsonResponse")
    public void clearJson();
}
