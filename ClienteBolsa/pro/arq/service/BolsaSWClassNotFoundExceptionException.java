
/**
 * BolsaSWClassNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */

package pro.arq.service;

public class BolsaSWClassNotFoundExceptionException extends java.lang.Exception {

	private static final long serialVersionUID = 1477660931988L;

	private pro.arq.service.BolsaSWClassNotFoundException faultMessage;

	public BolsaSWClassNotFoundExceptionException() {
		super("BolsaSWClassNotFoundExceptionException");
	}

	public BolsaSWClassNotFoundExceptionException(java.lang.String s) {
		super(s);
	}

	public BolsaSWClassNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
		super(s, ex);
	}

	public BolsaSWClassNotFoundExceptionException(java.lang.Throwable cause) {
		super(cause);
	}

	public void setFaultMessage(pro.arq.service.BolsaSWClassNotFoundException msg) {
		faultMessage = msg;
	}

	public pro.arq.service.BolsaSWClassNotFoundException getFaultMessage() {
		return faultMessage;
	}
}
