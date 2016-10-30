
/**
 * BolsaSWSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */

package pro.arq.service;

public class BolsaSWSQLExceptionException extends java.lang.Exception {

	private static final long serialVersionUID = 1477660931965L;

	private pro.arq.service.BolsaSWSQLException faultMessage;

	public BolsaSWSQLExceptionException() {
		super("BolsaSWSQLExceptionException");
	}

	public BolsaSWSQLExceptionException(java.lang.String s) {
		super(s);
	}

	public BolsaSWSQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
		super(s, ex);
	}

	public BolsaSWSQLExceptionException(java.lang.Throwable cause) {
		super(cause);
	}

	public void setFaultMessage(pro.arq.service.BolsaSWSQLException msg) {
		faultMessage = msg;
	}

	public pro.arq.service.BolsaSWSQLException getFaultMessage() {
		return faultMessage;
	}
}
