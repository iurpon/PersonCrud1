
package ru.trandefil.tm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="task" type="{http://generated.tm.trandefil.ru/}taskDTO" minOccurs="0"/&gt;
 *         &lt;element name="session" type="{http://generated.tm.trandefil.ru/}session" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteTask", propOrder = {
    "task",
    "session"
})
public class DeleteTask {

    protected TaskDTO task;
    protected Session session;

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDTO }
     *     
     */
    public TaskDTO getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDTO }
     *     
     */
    public void setTask(TaskDTO value) {
        this.task = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setSession(Session value) {
        this.session = value;
    }

}
