
/**
 * BolsaSWCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */

    package pro.arq.service;

    /**
     *  BolsaSWCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BolsaSWCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BolsaSWCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BolsaSWCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for eliminarCartera method
            * override this method for handling normal response from eliminarCartera operation
            */
           public void receiveResulteliminarCartera(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from eliminarCartera operation
           */
            public void receiveErroreliminarCartera(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerCliente method
            * override this method for handling normal response from obtenerCliente operation
            */
           public void receiveResultobtenerCliente(
                    pro.arq.service.ObtenerClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerCliente operation
           */
            public void receiveErrorobtenerCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerClientes method
            * override this method for handling normal response from obtenerClientes operation
            */
           public void receiveResultobtenerClientes(
                    pro.arq.service.ObtenerClientesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerClientes operation
           */
            public void receiveErrorobtenerClientes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for eliminarIbexs method
            * override this method for handling normal response from eliminarIbexs operation
            */
           public void receiveResulteliminarIbexs(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from eliminarIbexs operation
           */
            public void receiveErroreliminarIbexs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerIbex method
            * override this method for handling normal response from obtenerIbex operation
            */
           public void receiveResultobtenerIbex(
                    pro.arq.service.ObtenerIbexResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerIbex operation
           */
            public void receiveErrorobtenerIbex(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for eliminarCliente method
            * override this method for handling normal response from eliminarCliente operation
            */
           public void receiveResulteliminarCliente(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from eliminarCliente operation
           */
            public void receiveErroreliminarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerCarteras method
            * override this method for handling normal response from obtenerCarteras operation
            */
           public void receiveResultobtenerCarteras(
                    pro.arq.service.ObtenerCarterasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerCarteras operation
           */
            public void receiveErrorobtenerCarteras(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for main method
            * override this method for handling normal response from main operation
            */
           public void receiveResultmain(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from main operation
           */
            public void receiveErrormain(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for eliminarCarteras method
            * override this method for handling normal response from eliminarCarteras operation
            */
           public void receiveResulteliminarCarteras(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from eliminarCarteras operation
           */
            public void receiveErroreliminarCarteras(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for conectar method
            * override this method for handling normal response from conectar operation
            */
           public void receiveResultconectar(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from conectar operation
           */
            public void receiveErrorconectar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for eliminarPeticion method
            * override this method for handling normal response from eliminarPeticion operation
            */
           public void receiveResulteliminarPeticion(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from eliminarPeticion operation
           */
            public void receiveErroreliminarPeticion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for eliminarIbex35 method
            * override this method for handling normal response from eliminarIbex35 operation
            */
           public void receiveResulteliminarIbex35(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from eliminarIbex35 operation
           */
            public void receiveErroreliminarIbex35(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarCliente method
            * override this method for handling normal response from insertarCliente operation
            */
           public void receiveResultinsertarCliente(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarCliente operation
           */
            public void receiveErrorinsertarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for eliminarPeticiones method
            * override this method for handling normal response from eliminarPeticiones operation
            */
           public void receiveResulteliminarPeticiones(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from eliminarPeticiones operation
           */
            public void receiveErroreliminarPeticiones(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificarCliente method
            * override this method for handling normal response from modificarCliente operation
            */
           public void receiveResultmodificarCliente(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificarCliente operation
           */
            public void receiveErrormodificarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarPeticion method
            * override this method for handling normal response from insertarPeticion operation
            */
           public void receiveResultinsertarPeticion(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarPeticion operation
           */
            public void receiveErrorinsertarPeticion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificarIbex35 method
            * override this method for handling normal response from modificarIbex35 operation
            */
           public void receiveResultmodificarIbex35(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificarIbex35 operation
           */
            public void receiveErrormodificarIbex35(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPeticiones method
            * override this method for handling normal response from obtenerPeticiones operation
            */
           public void receiveResultobtenerPeticiones(
                    pro.arq.service.ObtenerPeticionesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPeticiones operation
           */
            public void receiveErrorobtenerPeticiones(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPeticion method
            * override this method for handling normal response from obtenerPeticion operation
            */
           public void receiveResultobtenerPeticion(
                    pro.arq.service.ObtenerPeticionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPeticion operation
           */
            public void receiveErrorobtenerPeticion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerIbexs method
            * override this method for handling normal response from obtenerIbexs operation
            */
           public void receiveResultobtenerIbexs(
                    pro.arq.service.ObtenerIbexsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerIbexs operation
           */
            public void receiveErrorobtenerIbexs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for desconectar method
            * override this method for handling normal response from desconectar operation
            */
           public void receiveResultdesconectar(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from desconectar operation
           */
            public void receiveErrordesconectar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarCartera method
            * override this method for handling normal response from insertarCartera operation
            */
           public void receiveResultinsertarCartera(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarCartera operation
           */
            public void receiveErrorinsertarCartera(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarIbex35 method
            * override this method for handling normal response from insertarIbex35 operation
            */
           public void receiveResultinsertarIbex35(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarIbex35 operation
           */
            public void receiveErrorinsertarIbex35(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificarCartera method
            * override this method for handling normal response from modificarCartera operation
            */
           public void receiveResultmodificarCartera(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificarCartera operation
           */
            public void receiveErrormodificarCartera(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerCartera method
            * override this method for handling normal response from obtenerCartera operation
            */
           public void receiveResultobtenerCartera(
                    pro.arq.service.ObtenerCarteraResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerCartera operation
           */
            public void receiveErrorobtenerCartera(java.lang.Exception e) {
            }
                


    }
    