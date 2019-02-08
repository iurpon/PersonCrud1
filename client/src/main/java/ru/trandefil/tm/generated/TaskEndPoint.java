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
 * 2019-02-08T17:29:13.073+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://generated.tm.trandefil.ru/", name = "TaskEndPoint")
@XmlSeeAlso({ObjectFactory.class})
public interface TaskEndPoint {

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/TaskEndPoint/publishRequest", output = "http://generated.tm.trandefil.ru/TaskEndPoint/publishResponse")
    @RequestWrapper(localName = "publish", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.Publish")
    @ResponseWrapper(localName = "publishResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.PublishResponse")
    public void publish();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/TaskEndPoint/getAllTasksRequest", output = "http://generated.tm.trandefil.ru/TaskEndPoint/getAllTasksResponse")
    @RequestWrapper(localName = "getAllTasks", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetAllTasks")
    @ResponseWrapper(localName = "getAllTasksResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetAllTasksResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.trandefil.tm.generated.Task> getAllTasks();

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/TaskEndPoint/saveTaskRequest", output = "http://generated.tm.trandefil.ru/TaskEndPoint/saveTaskResponse")
    @RequestWrapper(localName = "saveTask", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveTask")
    @ResponseWrapper(localName = "saveTaskResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.SaveTaskResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.Task saveTask(
        @WebParam(name = "task", targetNamespace = "")
        ru.trandefil.tm.generated.Task task
    );

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/TaskEndPoint/getTaskByNameRequest", output = "http://generated.tm.trandefil.ru/TaskEndPoint/getTaskByNameResponse")
    @RequestWrapper(localName = "getTaskByName", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetTaskByName")
    @ResponseWrapper(localName = "getTaskByNameResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.GetTaskByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.Task getTaskByName(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/TaskEndPoint/deleteTaskRequest", output = "http://generated.tm.trandefil.ru/TaskEndPoint/deleteTaskResponse")
    @RequestWrapper(localName = "deleteTask", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.DeleteTask")
    @ResponseWrapper(localName = "deleteTaskResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.DeleteTaskResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.Task deleteTask(
        @WebParam(name = "task", targetNamespace = "")
        ru.trandefil.tm.generated.Task task
    );

    @WebMethod
    @Action(input = "http://generated.tm.trandefil.ru/TaskEndPoint/deleteTaskByNameRequest", output = "http://generated.tm.trandefil.ru/TaskEndPoint/deleteTaskByNameResponse")
    @RequestWrapper(localName = "deleteTaskByName", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.DeleteTaskByName")
    @ResponseWrapper(localName = "deleteTaskByNameResponse", targetNamespace = "http://generated.tm.trandefil.ru/", className = "ru.trandefil.tm.generated.DeleteTaskByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.trandefil.tm.generated.Task deleteTaskByName(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );
}