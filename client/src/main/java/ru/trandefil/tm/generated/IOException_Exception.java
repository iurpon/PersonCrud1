
package ru.trandefil.tm.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-02-10T13:02:08.777+03:00
 * Generated source version: 3.2.7
 */

@WebFault(name = "IOException", targetNamespace = "http://generated.tm.trandefil.ru/")
public class IOException_Exception extends Exception {

    private ru.trandefil.tm.generated.IOException ioException;

    public IOException_Exception() {
        super();
    }

    public IOException_Exception(String message) {
        super(message);
    }

    public IOException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IOException_Exception(String message, ru.trandefil.tm.generated.IOException ioException) {
        super(message);
        this.ioException = ioException;
    }

    public IOException_Exception(String message, ru.trandefil.tm.generated.IOException ioException, java.lang.Throwable cause) {
        super(message, cause);
        this.ioException = ioException;
    }

    public ru.trandefil.tm.generated.IOException getFaultInfo() {
        return this.ioException;
    }
}
