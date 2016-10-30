
/**
 * BolsaSWStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package pro.arq.service;

/*
*  BolsaSWStub java implementation
*/

public class BolsaSWStub extends org.apache.axis2.client.Stub implements BolsaSW {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("BolsaSW" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[25];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCartera"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCliente"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerClientes"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbexs"));
		_service.addOperation(__operation);

		_operations[3] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbex"));
		_service.addOperation(__operation);

		_operations[4] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCliente"));
		_service.addOperation(__operation);

		_operations[5] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCarteras"));
		_service.addOperation(__operation);

		_operations[6] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "main"));
		_service.addOperation(__operation);

		_operations[7] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCarteras"));
		_service.addOperation(__operation);

		_operations[8] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "conectar"));
		_service.addOperation(__operation);

		_operations[9] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticion"));
		_service.addOperation(__operation);

		_operations[10] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbex35"));
		_service.addOperation(__operation);

		_operations[11] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "insertarCliente"));
		_service.addOperation(__operation);

		_operations[12] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticiones"));
		_service.addOperation(__operation);

		_operations[13] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "modificarCliente"));
		_service.addOperation(__operation);

		_operations[14] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "insertarPeticion"));
		_service.addOperation(__operation);

		_operations[15] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "modificarIbex35"));
		_service.addOperation(__operation);

		_operations[16] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticiones"));
		_service.addOperation(__operation);

		_operations[17] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticion"));
		_service.addOperation(__operation);

		_operations[18] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbexs"));
		_service.addOperation(__operation);

		_operations[19] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "desconectar"));
		_service.addOperation(__operation);

		_operations[20] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "insertarCartera"));
		_service.addOperation(__operation);

		_operations[21] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "insertarIbex35"));
		_service.addOperation(__operation);

		_operations[22] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "modificarCartera"));
		_service.addOperation(__operation);

		_operations[23] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCartera"));
		_service.addOperation(__operation);

		_operations[24] = __operation;

	}

	// populates the faults
	private void populateFaults() {

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCartera"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCartera"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCartera"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCliente"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCliente"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCliente"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerClientes"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerClientes"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerClientes"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarIbexs"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarIbexs"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarIbexs"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerIbex"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerIbex"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerIbex"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCliente"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCliente"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCliente"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCarteras"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCarteras"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCarteras"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWClassNotFoundException"), "main"),
				"pro.arq.service.BolsaSWClassNotFoundExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWClassNotFoundException"), "main"),
				"pro.arq.service.BolsaSWClassNotFoundExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWClassNotFoundException"), "main"),
				"pro.arq.service.BolsaSWClassNotFoundException");

		faultExceptionNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "main"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "main"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "main"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCarteras"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCarteras"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarCarteras"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWClassNotFoundException"), "conectar"),
				"pro.arq.service.BolsaSWClassNotFoundExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWClassNotFoundException"), "conectar"),
				"pro.arq.service.BolsaSWClassNotFoundExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWClassNotFoundException"), "conectar"),
				"pro.arq.service.BolsaSWClassNotFoundException");

		faultExceptionNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "conectar"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "conectar"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "conectar"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarPeticion"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarPeticion"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarPeticion"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarIbex35"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarIbex35"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarIbex35"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarCliente"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarCliente"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarCliente"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarPeticiones"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarPeticiones"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "eliminarPeticiones"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarCliente"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarCliente"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarCliente"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarPeticion"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarPeticion"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarPeticion"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarIbex35"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarIbex35"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarIbex35"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerPeticiones"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerPeticiones"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerPeticiones"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerPeticion"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerPeticion"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerPeticion"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerIbexs"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerIbexs"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerIbexs"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "desconectar"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "desconectar"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(
				new org.apache.axis2.client.FaultMapKey(
						new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "desconectar"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarCartera"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarCartera"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarCartera"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarIbex35"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarIbex35"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "insertarIbex35"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarCartera"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarCartera"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "modificarCartera"),
				"pro.arq.service.BolsaSWSQLException");

		faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCartera"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCartera"),
				"pro.arq.service.BolsaSWSQLExceptionException");
		faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
				new javax.xml.namespace.QName("http://service.arq.pro", "BolsaSWSQLException"), "obtenerCartera"),
				"pro.arq.service.BolsaSWSQLException");

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public BolsaSWStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public BolsaSWStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		// Set the soap version
		_serviceClient.getOptions()
				.setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

	}

	/**
	 * Default Constructor
	 */
	public BolsaSWStub(org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext, "http://localhost:8080/axis2/services/BolsaSW.BolsaSWHttpSoap12Endpoint/");

	}

	/**
	 * Default Constructor
	 */
	public BolsaSWStub() throws org.apache.axis2.AxisFault {

		this("http://localhost:8080/axis2/services/BolsaSW.BolsaSWHttpSoap12Endpoint/");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public BolsaSWStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#eliminarCartera
	 * @param eliminarCartera67
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void eliminarCartera(

			pro.arq.service.EliminarCartera eliminarCartera67)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("urn:eliminarCartera");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarCartera67,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCartera")),
					new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCartera"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCartera"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCartera"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCartera"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#starteliminarCartera
	 * @param eliminarCartera67
	 * 
	 */
	public void starteliminarCartera(

			pro.arq.service.EliminarCartera eliminarCartera67,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("urn:eliminarCartera");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarCartera67,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCartera")),
				new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCartera"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#obtenerCliente
	 * @param obtenerCliente69
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public pro.arq.service.ObtenerClienteResponse obtenerCliente(

			pro.arq.service.ObtenerCliente obtenerCliente69)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("urn:obtenerCliente");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerCliente69,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCliente")),
					new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCliente"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					pro.arq.service.ObtenerClienteResponse.class);

			return (pro.arq.service.ObtenerClienteResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCliente"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCliente"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCliente"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startobtenerCliente
	 * @param obtenerCliente69
	 * 
	 */
	public void startobtenerCliente(

			pro.arq.service.ObtenerCliente obtenerCliente69,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("urn:obtenerCliente");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerCliente69,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCliente")),
				new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCliente"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							pro.arq.service.ObtenerClienteResponse.class);
					callback.receiveResultobtenerCliente((pro.arq.service.ObtenerClienteResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorobtenerCliente(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCliente"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCliente"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCliente"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
									callback.receiveErrorobtenerCliente(
											(pro.arq.service.BolsaSWSQLExceptionException) ex);
									return;
								}

								callback.receiveErrorobtenerCliente(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCliente(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCliente(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCliente(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCliente(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCliente(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCliente(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCliente(f);
							}
						} else {
							callback.receiveErrorobtenerCliente(f);
						}
					} else {
						callback.receiveErrorobtenerCliente(f);
					}
				} else {
					callback.receiveErrorobtenerCliente(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorobtenerCliente(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#obtenerClientes
	 * @param obtenerClientes71
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public pro.arq.service.ObtenerClientesResponse obtenerClientes(

			pro.arq.service.ObtenerClientes obtenerClientes71)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("urn:obtenerClientes");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerClientes71,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerClientes")),
					new javax.xml.namespace.QName("http://service.arq.pro", "obtenerClientes"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					pro.arq.service.ObtenerClientesResponse.class);

			return (pro.arq.service.ObtenerClientesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerClientes"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerClientes"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerClientes"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startobtenerClientes
	 * @param obtenerClientes71
	 * 
	 */
	public void startobtenerClientes(

			pro.arq.service.ObtenerClientes obtenerClientes71,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("urn:obtenerClientes");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerClientes71,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerClientes")),
				new javax.xml.namespace.QName("http://service.arq.pro", "obtenerClientes"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							pro.arq.service.ObtenerClientesResponse.class);
					callback.receiveResultobtenerClientes((pro.arq.service.ObtenerClientesResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorobtenerClientes(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerClientes"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"obtenerClientes"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"obtenerClientes"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
									callback.receiveErrorobtenerClientes(
											(pro.arq.service.BolsaSWSQLExceptionException) ex);
									return;
								}

								callback.receiveErrorobtenerClientes(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerClientes(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerClientes(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerClientes(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerClientes(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerClientes(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerClientes(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerClientes(f);
							}
						} else {
							callback.receiveErrorobtenerClientes(f);
						}
					} else {
						callback.receiveErrorobtenerClientes(f);
					}
				} else {
					callback.receiveErrorobtenerClientes(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorobtenerClientes(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#eliminarIbexs
	 * @param eliminarIbexs73
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void eliminarIbexs(

			pro.arq.service.EliminarIbexs eliminarIbexs73)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction("urn:eliminarIbexs");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarIbexs73,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbexs")),
					new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbexs"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarIbexs"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarIbexs"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarIbexs"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#starteliminarIbexs
	 * @param eliminarIbexs73
	 * 
	 */
	public void starteliminarIbexs(

			pro.arq.service.EliminarIbexs eliminarIbexs73,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("urn:eliminarIbexs");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarIbexs73,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbexs")),
				new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbexs"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#obtenerIbex
	 * @param obtenerIbex75
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public pro.arq.service.ObtenerIbexResponse obtenerIbex(

			pro.arq.service.ObtenerIbex obtenerIbex75)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction("urn:obtenerIbex");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerIbex75,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbex")),
					new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbex"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					pro.arq.service.ObtenerIbexResponse.class);

			return (pro.arq.service.ObtenerIbexResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbex"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbex"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbex"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startobtenerIbex
	 * @param obtenerIbex75
	 * 
	 */
	public void startobtenerIbex(

			pro.arq.service.ObtenerIbex obtenerIbex75,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction("urn:obtenerIbex");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerIbex75,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbex")),
				new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbex"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							pro.arq.service.ObtenerIbexResponse.class);
					callback.receiveResultobtenerIbex((pro.arq.service.ObtenerIbexResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorobtenerIbex(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbex"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbex"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbex"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
									callback.receiveErrorobtenerIbex((pro.arq.service.BolsaSWSQLExceptionException) ex);
									return;
								}

								callback.receiveErrorobtenerIbex(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbex(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbex(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbex(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbex(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbex(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbex(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbex(f);
							}
						} else {
							callback.receiveErrorobtenerIbex(f);
						}
					} else {
						callback.receiveErrorobtenerIbex(f);
					}
				} else {
					callback.receiveErrorobtenerIbex(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorobtenerIbex(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#eliminarCliente
	 * @param eliminarCliente77
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void eliminarCliente(

			pro.arq.service.EliminarCliente eliminarCliente77)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[5].getName());
			_operationClient.getOptions().setAction("urn:eliminarCliente");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarCliente77,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCliente")),
					new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCliente"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCliente"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCliente"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCliente"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#starteliminarCliente
	 * @param eliminarCliente77
	 * 
	 */
	public void starteliminarCliente(

			pro.arq.service.EliminarCliente eliminarCliente77,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[5].getName());
		_operationClient.getOptions().setAction("urn:eliminarCliente");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarCliente77,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCliente")),
				new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCliente"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[5].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[5].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#obtenerCarteras
	 * @param obtenerCarteras79
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public pro.arq.service.ObtenerCarterasResponse obtenerCarteras(

			pro.arq.service.ObtenerCarteras obtenerCarteras79)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[6].getName());
			_operationClient.getOptions().setAction("urn:obtenerCarteras");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerCarteras79,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCarteras")),
					new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCarteras"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					pro.arq.service.ObtenerCarterasResponse.class);

			return (pro.arq.service.ObtenerCarterasResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCarteras"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCarteras"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCarteras"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startobtenerCarteras
	 * @param obtenerCarteras79
	 * 
	 */
	public void startobtenerCarteras(

			pro.arq.service.ObtenerCarteras obtenerCarteras79,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[6].getName());
		_operationClient.getOptions().setAction("urn:obtenerCarteras");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerCarteras79,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCarteras")),
				new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCarteras"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							pro.arq.service.ObtenerCarterasResponse.class);
					callback.receiveResultobtenerCarteras((pro.arq.service.ObtenerCarterasResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorobtenerCarteras(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCarteras"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"obtenerCarteras"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"obtenerCarteras"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
									callback.receiveErrorobtenerCarteras(
											(pro.arq.service.BolsaSWSQLExceptionException) ex);
									return;
								}

								callback.receiveErrorobtenerCarteras(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCarteras(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCarteras(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCarteras(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCarteras(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCarteras(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCarteras(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCarteras(f);
							}
						} else {
							callback.receiveErrorobtenerCarteras(f);
						}
					} else {
						callback.receiveErrorobtenerCarteras(f);
					}
				} else {
					callback.receiveErrorobtenerCarteras(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorobtenerCarteras(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[6].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[6].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#main
	 * @param main81
	 * 
	 * @throws pro.arq.service.BolsaSWClassNotFoundExceptionException
	 *             :
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void main(

			pro.arq.service.Main main81)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWClassNotFoundExceptionException, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[7].getName());
			_operationClient.getOptions().setAction("urn:main");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), main81,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "main")),
					new javax.xml.namespace.QName("http://service.arq.pro", "main"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "main"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "main"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "main"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWClassNotFoundExceptionException) {
							throw (pro.arq.service.BolsaSWClassNotFoundExceptionException) ex;
						}

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startmain
	 * @param main81
	 * 
	 */
	public void startmain(

			pro.arq.service.Main main81,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[7].getName());
		_operationClient.getOptions().setAction("urn:main");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), main81,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "main")),
				new javax.xml.namespace.QName("http://service.arq.pro", "main"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[7].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[7].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#eliminarCarteras
	 * @param eliminarCarteras83
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void eliminarCarteras(

			pro.arq.service.EliminarCarteras eliminarCarteras83)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[8].getName());
			_operationClient.getOptions().setAction("urn:eliminarCarteras");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarCarteras83,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCarteras")),
					new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCarteras"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCarteras"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCarteras"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarCarteras"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#starteliminarCarteras
	 * @param eliminarCarteras83
	 * 
	 */
	public void starteliminarCarteras(

			pro.arq.service.EliminarCarteras eliminarCarteras83,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[8].getName());
		_operationClient.getOptions().setAction("urn:eliminarCarteras");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarCarteras83,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCarteras")),
				new javax.xml.namespace.QName("http://service.arq.pro", "eliminarCarteras"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[8].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[8].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#conectar
	 * @param conectar85
	 * 
	 * @throws pro.arq.service.BolsaSWClassNotFoundExceptionException
	 *             :
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void conectar(

			pro.arq.service.Conectar conectar85)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWClassNotFoundExceptionException, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[9].getName());
			_operationClient.getOptions().setAction("urn:conectar");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), conectar85,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "conectar")),
					new javax.xml.namespace.QName("http://service.arq.pro", "conectar"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "conectar"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "conectar"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "conectar"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWClassNotFoundExceptionException) {
							throw (pro.arq.service.BolsaSWClassNotFoundExceptionException) ex;
						}

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startconectar
	 * @param conectar85
	 * 
	 */
	public void startconectar(

			pro.arq.service.Conectar conectar85,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[9].getName());
		_operationClient.getOptions().setAction("urn:conectar");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), conectar85,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "conectar")),
				new javax.xml.namespace.QName("http://service.arq.pro", "conectar"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[9].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[9].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#eliminarPeticion
	 * @param eliminarPeticion87
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void eliminarPeticion(

			pro.arq.service.EliminarPeticion eliminarPeticion87)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[10].getName());
			_operationClient.getOptions().setAction("urn:eliminarPeticion");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarPeticion87,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticion")),
					new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticion"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarPeticion"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarPeticion"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarPeticion"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#starteliminarPeticion
	 * @param eliminarPeticion87
	 * 
	 */
	public void starteliminarPeticion(

			pro.arq.service.EliminarPeticion eliminarPeticion87,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[10].getName());
		_operationClient.getOptions().setAction("urn:eliminarPeticion");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarPeticion87,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticion")),
				new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticion"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[10].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[10].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#eliminarIbex35
	 * @param eliminarIbex3589
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void eliminarIbex35(

			pro.arq.service.EliminarIbex35 eliminarIbex3589)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[11].getName());
			_operationClient.getOptions().setAction("urn:eliminarIbex35");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarIbex3589,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbex35")),
					new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbex35"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarIbex35"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarIbex35"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarIbex35"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#starteliminarIbex35
	 * @param eliminarIbex3589
	 * 
	 */
	public void starteliminarIbex35(

			pro.arq.service.EliminarIbex35 eliminarIbex3589,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[11].getName());
		_operationClient.getOptions().setAction("urn:eliminarIbex35");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarIbex3589,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbex35")),
				new javax.xml.namespace.QName("http://service.arq.pro", "eliminarIbex35"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[11].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[11].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#insertarCliente
	 * @param insertarCliente91
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void insertarCliente(

			pro.arq.service.InsertarCliente insertarCliente91)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[12].getName());
			_operationClient.getOptions().setAction("urn:insertarCliente");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), insertarCliente91,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "insertarCliente")),
					new javax.xml.namespace.QName("http://service.arq.pro", "insertarCliente"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarCliente"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarCliente"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarCliente"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startinsertarCliente
	 * @param insertarCliente91
	 * 
	 */
	public void startinsertarCliente(

			pro.arq.service.InsertarCliente insertarCliente91,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[12].getName());
		_operationClient.getOptions().setAction("urn:insertarCliente");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), insertarCliente91,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "insertarCliente")),
				new javax.xml.namespace.QName("http://service.arq.pro", "insertarCliente"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[12].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[12].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#eliminarPeticiones
	 * @param eliminarPeticiones93
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void eliminarPeticiones(

			pro.arq.service.EliminarPeticiones eliminarPeticiones93)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[13].getName());
			_operationClient.getOptions().setAction("urn:eliminarPeticiones");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarPeticiones93,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticiones")),
					new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticiones"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarPeticiones"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarPeticiones"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "eliminarPeticiones"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#starteliminarPeticiones
	 * @param eliminarPeticiones93
	 * 
	 */
	public void starteliminarPeticiones(

			pro.arq.service.EliminarPeticiones eliminarPeticiones93,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[13].getName());
		_operationClient.getOptions().setAction("urn:eliminarPeticiones");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), eliminarPeticiones93,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticiones")),
				new javax.xml.namespace.QName("http://service.arq.pro", "eliminarPeticiones"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[13].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[13].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#modificarCliente
	 * @param modificarCliente95
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void modificarCliente(

			pro.arq.service.ModificarCliente modificarCliente95)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[14].getName());
			_operationClient.getOptions().setAction("urn:modificarCliente");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), modificarCliente95,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "modificarCliente")),
					new javax.xml.namespace.QName("http://service.arq.pro", "modificarCliente"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarCliente"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarCliente"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarCliente"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startmodificarCliente
	 * @param modificarCliente95
	 * 
	 */
	public void startmodificarCliente(

			pro.arq.service.ModificarCliente modificarCliente95,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[14].getName());
		_operationClient.getOptions().setAction("urn:modificarCliente");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), modificarCliente95,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "modificarCliente")),
				new javax.xml.namespace.QName("http://service.arq.pro", "modificarCliente"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[14].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[14].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#insertarPeticion
	 * @param insertarPeticion97
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void insertarPeticion(

			pro.arq.service.InsertarPeticion insertarPeticion97)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[15].getName());
			_operationClient.getOptions().setAction("urn:insertarPeticion");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), insertarPeticion97,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "insertarPeticion")),
					new javax.xml.namespace.QName("http://service.arq.pro", "insertarPeticion"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarPeticion"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarPeticion"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarPeticion"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startinsertarPeticion
	 * @param insertarPeticion97
	 * 
	 */
	public void startinsertarPeticion(

			pro.arq.service.InsertarPeticion insertarPeticion97,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[15].getName());
		_operationClient.getOptions().setAction("urn:insertarPeticion");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), insertarPeticion97,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "insertarPeticion")),
				new javax.xml.namespace.QName("http://service.arq.pro", "insertarPeticion"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[15].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[15].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#modificarIbex35
	 * @param modificarIbex3599
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void modificarIbex35(

			pro.arq.service.ModificarIbex35 modificarIbex3599)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[16].getName());
			_operationClient.getOptions().setAction("urn:modificarIbex35");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), modificarIbex3599,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "modificarIbex35")),
					new javax.xml.namespace.QName("http://service.arq.pro", "modificarIbex35"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarIbex35"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarIbex35"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarIbex35"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startmodificarIbex35
	 * @param modificarIbex3599
	 * 
	 */
	public void startmodificarIbex35(

			pro.arq.service.ModificarIbex35 modificarIbex3599,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[16].getName());
		_operationClient.getOptions().setAction("urn:modificarIbex35");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), modificarIbex3599,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "modificarIbex35")),
				new javax.xml.namespace.QName("http://service.arq.pro", "modificarIbex35"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[16].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[16].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#obtenerPeticiones
	 * @param obtenerPeticiones101
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public pro.arq.service.ObtenerPeticionesResponse obtenerPeticiones(

			pro.arq.service.ObtenerPeticiones obtenerPeticiones101)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[17].getName());
			_operationClient.getOptions().setAction("urn:obtenerPeticiones");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerPeticiones101,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticiones")),
					new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticiones"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					pro.arq.service.ObtenerPeticionesResponse.class);

			return (pro.arq.service.ObtenerPeticionesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerPeticiones"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerPeticiones"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerPeticiones"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startobtenerPeticiones
	 * @param obtenerPeticiones101
	 * 
	 */
	public void startobtenerPeticiones(

			pro.arq.service.ObtenerPeticiones obtenerPeticiones101,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[17].getName());
		_operationClient.getOptions().setAction("urn:obtenerPeticiones");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerPeticiones101,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticiones")),
				new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticiones"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							pro.arq.service.ObtenerPeticionesResponse.class);
					callback.receiveResultobtenerPeticiones((pro.arq.service.ObtenerPeticionesResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorobtenerPeticiones(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerPeticiones"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"obtenerPeticiones"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"obtenerPeticiones"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
									callback.receiveErrorobtenerPeticiones(
											(pro.arq.service.BolsaSWSQLExceptionException) ex);
									return;
								}

								callback.receiveErrorobtenerPeticiones(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticiones(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticiones(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticiones(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticiones(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticiones(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticiones(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticiones(f);
							}
						} else {
							callback.receiveErrorobtenerPeticiones(f);
						}
					} else {
						callback.receiveErrorobtenerPeticiones(f);
					}
				} else {
					callback.receiveErrorobtenerPeticiones(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorobtenerPeticiones(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[17].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[17].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#obtenerPeticion
	 * @param obtenerPeticion103
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public pro.arq.service.ObtenerPeticionResponse obtenerPeticion(

			pro.arq.service.ObtenerPeticion obtenerPeticion103)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[18].getName());
			_operationClient.getOptions().setAction("urn:obtenerPeticion");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerPeticion103,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticion")),
					new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticion"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					pro.arq.service.ObtenerPeticionResponse.class);

			return (pro.arq.service.ObtenerPeticionResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerPeticion"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerPeticion"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerPeticion"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startobtenerPeticion
	 * @param obtenerPeticion103
	 * 
	 */
	public void startobtenerPeticion(

			pro.arq.service.ObtenerPeticion obtenerPeticion103,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[18].getName());
		_operationClient.getOptions().setAction("urn:obtenerPeticion");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerPeticion103,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticion")),
				new javax.xml.namespace.QName("http://service.arq.pro", "obtenerPeticion"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							pro.arq.service.ObtenerPeticionResponse.class);
					callback.receiveResultobtenerPeticion((pro.arq.service.ObtenerPeticionResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorobtenerPeticion(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerPeticion"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"obtenerPeticion"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"obtenerPeticion"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
									callback.receiveErrorobtenerPeticion(
											(pro.arq.service.BolsaSWSQLExceptionException) ex);
									return;
								}

								callback.receiveErrorobtenerPeticion(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticion(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticion(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticion(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticion(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticion(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticion(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerPeticion(f);
							}
						} else {
							callback.receiveErrorobtenerPeticion(f);
						}
					} else {
						callback.receiveErrorobtenerPeticion(f);
					}
				} else {
					callback.receiveErrorobtenerPeticion(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorobtenerPeticion(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[18].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[18].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#obtenerIbexs
	 * @param obtenerIbexs105
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public pro.arq.service.ObtenerIbexsResponse obtenerIbexs(

			pro.arq.service.ObtenerIbexs obtenerIbexs105)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[19].getName());
			_operationClient.getOptions().setAction("urn:obtenerIbexs");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerIbexs105,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbexs")),
					new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbexs"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					pro.arq.service.ObtenerIbexsResponse.class);

			return (pro.arq.service.ObtenerIbexsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbexs"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbexs"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbexs"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startobtenerIbexs
	 * @param obtenerIbexs105
	 * 
	 */
	public void startobtenerIbexs(

			pro.arq.service.ObtenerIbexs obtenerIbexs105,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[19].getName());
		_operationClient.getOptions().setAction("urn:obtenerIbexs");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerIbexs105,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbexs")),
				new javax.xml.namespace.QName("http://service.arq.pro", "obtenerIbexs"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							pro.arq.service.ObtenerIbexsResponse.class);
					callback.receiveResultobtenerIbexs((pro.arq.service.ObtenerIbexsResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorobtenerIbexs(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbexs"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbexs"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerIbexs"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
									callback.receiveErrorobtenerIbexs(
											(pro.arq.service.BolsaSWSQLExceptionException) ex);
									return;
								}

								callback.receiveErrorobtenerIbexs(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbexs(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbexs(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbexs(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbexs(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbexs(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbexs(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerIbexs(f);
							}
						} else {
							callback.receiveErrorobtenerIbexs(f);
						}
					} else {
						callback.receiveErrorobtenerIbexs(f);
					}
				} else {
					callback.receiveErrorobtenerIbexs(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorobtenerIbexs(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[19].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[19].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#desconectar
	 * @param desconectar107
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void desconectar(

			pro.arq.service.Desconectar desconectar107)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[20].getName());
			_operationClient.getOptions().setAction("urn:desconectar");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), desconectar107,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "desconectar")),
					new javax.xml.namespace.QName("http://service.arq.pro", "desconectar"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "desconectar"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "desconectar"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "desconectar"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startdesconectar
	 * @param desconectar107
	 * 
	 */
	public void startdesconectar(

			pro.arq.service.Desconectar desconectar107,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[20].getName());
		_operationClient.getOptions().setAction("urn:desconectar");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), desconectar107,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "desconectar")),
				new javax.xml.namespace.QName("http://service.arq.pro", "desconectar"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[20].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[20].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#insertarCartera
	 * @param insertarCartera109
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void insertarCartera(

			pro.arq.service.InsertarCartera insertarCartera109)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[21].getName());
			_operationClient.getOptions().setAction("urn:insertarCartera");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), insertarCartera109,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "insertarCartera")),
					new javax.xml.namespace.QName("http://service.arq.pro", "insertarCartera"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarCartera"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarCartera"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarCartera"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startinsertarCartera
	 * @param insertarCartera109
	 * 
	 */
	public void startinsertarCartera(

			pro.arq.service.InsertarCartera insertarCartera109,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[21].getName());
		_operationClient.getOptions().setAction("urn:insertarCartera");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), insertarCartera109,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "insertarCartera")),
				new javax.xml.namespace.QName("http://service.arq.pro", "insertarCartera"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[21].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[21].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#insertarIbex35
	 * @param insertarIbex35111
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void insertarIbex35(

			pro.arq.service.InsertarIbex35 insertarIbex35111)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[22].getName());
			_operationClient.getOptions().setAction("urn:insertarIbex35");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), insertarIbex35111,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "insertarIbex35")),
					new javax.xml.namespace.QName("http://service.arq.pro", "insertarIbex35"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarIbex35"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarIbex35"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "insertarIbex35"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startinsertarIbex35
	 * @param insertarIbex35111
	 * 
	 */
	public void startinsertarIbex35(

			pro.arq.service.InsertarIbex35 insertarIbex35111,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[22].getName());
		_operationClient.getOptions().setAction("urn:insertarIbex35");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), insertarIbex35111,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "insertarIbex35")),
				new javax.xml.namespace.QName("http://service.arq.pro", "insertarIbex35"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[22].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[22].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#modificarCartera
	 * @param modificarCartera113
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public void modificarCartera(

			pro.arq.service.ModificarCartera modificarCartera113)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[23].getName());
			_operationClient.getOptions().setAction("urn:modificarCartera");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), modificarCartera113,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "modificarCartera")),
					new javax.xml.namespace.QName("http://service.arq.pro", "modificarCartera"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			return;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarCartera"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarCartera"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "modificarCartera"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startmodificarCartera
	 * @param modificarCartera113
	 * 
	 */
	public void startmodificarCartera(

			pro.arq.service.ModificarCartera modificarCartera113,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[23].getName());
		_operationClient.getOptions().setAction("urn:modificarCartera");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), modificarCartera113,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "modificarCartera")),
				new javax.xml.namespace.QName("http://service.arq.pro", "modificarCartera"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		// Nothing to pass as the callback!!!

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[23].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[23].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see pro.arq.service.BolsaSW#obtenerCartera
	 * @param obtenerCartera115
	 * 
	 * @throws pro.arq.service.BolsaSWSQLExceptionException
	 *             :
	 */

	public pro.arq.service.ObtenerCarteraResponse obtenerCartera(

			pro.arq.service.ObtenerCartera obtenerCartera115)

			throws java.rmi.RemoteException

			, pro.arq.service.BolsaSWSQLExceptionException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[24].getName());
			_operationClient.getOptions().setAction("urn:obtenerCartera");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerCartera115,
					optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCartera")),
					new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCartera"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					pro.arq.service.ObtenerCarteraResponse.class);

			return (pro.arq.service.ObtenerCarteraResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCartera"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCartera"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCartera"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
							throw (pro.arq.service.BolsaSWSQLExceptionException) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see pro.arq.service.BolsaSW#startobtenerCartera
	 * @param obtenerCartera115
	 * 
	 */
	public void startobtenerCartera(

			pro.arq.service.ObtenerCartera obtenerCartera115,

			final pro.arq.service.BolsaSWCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[24].getName());
		_operationClient.getOptions().setAction("urn:obtenerCartera");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), obtenerCartera115,
				optimizeContent(new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCartera")),
				new javax.xml.namespace.QName("http://service.arq.pro", "obtenerCartera"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							pro.arq.service.ObtenerCarteraResponse.class);
					callback.receiveResultobtenerCartera((pro.arq.service.ObtenerCarteraResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorobtenerCartera(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCartera"))) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCartera"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass
										.getConstructor(java.lang.String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "obtenerCartera"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt, messageClass);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[] { messageClass });
								m.invoke(ex, new java.lang.Object[] { messageObject });

								if (ex instanceof pro.arq.service.BolsaSWSQLExceptionException) {
									callback.receiveErrorobtenerCartera(
											(pro.arq.service.BolsaSWSQLExceptionException) ex);
									return;
								}

								callback.receiveErrorobtenerCartera(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCartera(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCartera(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCartera(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCartera(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCartera(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCartera(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the
								// original Axis fault
								callback.receiveErrorobtenerCartera(f);
							}
						} else {
							callback.receiveErrorobtenerCartera(f);
						}
					} else {
						callback.receiveErrorobtenerCartera(f);
					}
				} else {
					callback.receiveErrorobtenerCartera(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorobtenerCartera(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[24].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[24].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// http://localhost:8080/axis2/services/BolsaSW.BolsaSWHttpSoap12Endpoint/
	private org.apache.axiom.om.OMElement toOM(pro.arq.service.EliminarCartera param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.EliminarCartera.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.BolsaSWSQLException param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.BolsaSWSQLException.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerCliente param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerCliente.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerClienteResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerClienteResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerClientes param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerClientes.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerClientesResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerClientesResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.EliminarIbexs param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.EliminarIbexs.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerIbex param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerIbex.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerIbexResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerIbexResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.EliminarCliente param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.EliminarCliente.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerCarteras param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerCarteras.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerCarterasResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerCarterasResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.Main param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.Main.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.BolsaSWClassNotFoundException param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.BolsaSWClassNotFoundException.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.EliminarCarteras param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.EliminarCarteras.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.Conectar param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.Conectar.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.EliminarPeticion param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.EliminarPeticion.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.EliminarIbex35 param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.EliminarIbex35.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.InsertarCliente param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.InsertarCliente.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.EliminarPeticiones param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.EliminarPeticiones.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ModificarCliente param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ModificarCliente.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.InsertarPeticion param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.InsertarPeticion.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ModificarIbex35 param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ModificarIbex35.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerPeticiones param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerPeticiones.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerPeticionesResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerPeticionesResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerPeticion param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerPeticion.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerPeticionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerPeticionResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerIbexs param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerIbexs.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerIbexsResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerIbexsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.Desconectar param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.Desconectar.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.InsertarCartera param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.InsertarCartera.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.InsertarIbex35 param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.InsertarIbex35.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ModificarCartera param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ModificarCartera.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerCartera param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerCartera.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(pro.arq.service.ObtenerCarteraResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(pro.arq.service.ObtenerCarteraResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.EliminarCartera param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.EliminarCartera.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ObtenerCliente param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ObtenerCliente.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ObtenerClientes param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ObtenerClientes.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.EliminarIbexs param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.EliminarIbexs.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ObtenerIbex param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ObtenerIbex.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.EliminarCliente param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.EliminarCliente.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ObtenerCarteras param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ObtenerCarteras.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.Main param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.Main.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.EliminarCarteras param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.EliminarCarteras.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.Conectar param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.Conectar.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.EliminarPeticion param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.EliminarPeticion.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.EliminarIbex35 param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.EliminarIbex35.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.InsertarCliente param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.InsertarCliente.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.EliminarPeticiones param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.EliminarPeticiones.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ModificarCliente param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ModificarCliente.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.InsertarPeticion param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.InsertarPeticion.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ModificarIbex35 param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ModificarIbex35.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ObtenerPeticiones param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ObtenerPeticiones.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ObtenerPeticion param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ObtenerPeticion.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ObtenerIbexs param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ObtenerIbexs.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.Desconectar param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.Desconectar.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.InsertarCartera param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.InsertarCartera.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.InsertarIbex35 param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.InsertarIbex35.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ModificarCartera param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ModificarCartera.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			pro.arq.service.ObtenerCartera param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
			throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(pro.arq.service.ObtenerCartera.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
			throws org.apache.axis2.AxisFault {

		try {

			if (pro.arq.service.BolsaSWClassNotFoundException.class.equals(type)) {

				return pro.arq.service.BolsaSWClassNotFoundException.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.BolsaSWSQLException.class.equals(type)) {

				return pro.arq.service.BolsaSWSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.Conectar.class.equals(type)) {

				return pro.arq.service.Conectar.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.Desconectar.class.equals(type)) {

				return pro.arq.service.Desconectar.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.EliminarCartera.class.equals(type)) {

				return pro.arq.service.EliminarCartera.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.EliminarCarteras.class.equals(type)) {

				return pro.arq.service.EliminarCarteras.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.EliminarCliente.class.equals(type)) {

				return pro.arq.service.EliminarCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.EliminarIbex35.class.equals(type)) {

				return pro.arq.service.EliminarIbex35.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.EliminarIbexs.class.equals(type)) {

				return pro.arq.service.EliminarIbexs.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.EliminarPeticion.class.equals(type)) {

				return pro.arq.service.EliminarPeticion.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.EliminarPeticiones.class.equals(type)) {

				return pro.arq.service.EliminarPeticiones.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.InsertarCartera.class.equals(type)) {

				return pro.arq.service.InsertarCartera.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.InsertarCliente.class.equals(type)) {

				return pro.arq.service.InsertarCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.InsertarIbex35.class.equals(type)) {

				return pro.arq.service.InsertarIbex35.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.InsertarPeticion.class.equals(type)) {

				return pro.arq.service.InsertarPeticion.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.Main.class.equals(type)) {

				return pro.arq.service.Main.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ModificarCartera.class.equals(type)) {

				return pro.arq.service.ModificarCartera.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ModificarCliente.class.equals(type)) {

				return pro.arq.service.ModificarCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ModificarIbex35.class.equals(type)) {

				return pro.arq.service.ModificarIbex35.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerCartera.class.equals(type)) {

				return pro.arq.service.ObtenerCartera.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerCarteraResponse.class.equals(type)) {

				return pro.arq.service.ObtenerCarteraResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerCarteras.class.equals(type)) {

				return pro.arq.service.ObtenerCarteras.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerCarterasResponse.class.equals(type)) {

				return pro.arq.service.ObtenerCarterasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerCliente.class.equals(type)) {

				return pro.arq.service.ObtenerCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerClienteResponse.class.equals(type)) {

				return pro.arq.service.ObtenerClienteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerClientes.class.equals(type)) {

				return pro.arq.service.ObtenerClientes.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerClientesResponse.class.equals(type)) {

				return pro.arq.service.ObtenerClientesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerIbex.class.equals(type)) {

				return pro.arq.service.ObtenerIbex.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerIbexResponse.class.equals(type)) {

				return pro.arq.service.ObtenerIbexResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerIbexs.class.equals(type)) {

				return pro.arq.service.ObtenerIbexs.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerIbexsResponse.class.equals(type)) {

				return pro.arq.service.ObtenerIbexsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerPeticion.class.equals(type)) {

				return pro.arq.service.ObtenerPeticion.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerPeticiones.class.equals(type)) {

				return pro.arq.service.ObtenerPeticiones.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerPeticionesResponse.class.equals(type)) {

				return pro.arq.service.ObtenerPeticionesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (pro.arq.service.ObtenerPeticionResponse.class.equals(type)) {

				return pro.arq.service.ObtenerPeticionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
