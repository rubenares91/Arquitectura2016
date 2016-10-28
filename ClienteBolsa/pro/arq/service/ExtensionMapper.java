
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */

        
            package pro.arq.service;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://clases.dao.arq.pro/xsd".equals(namespaceURI) &&
                  "Cliente".equals(typeName)){
                   
                            return  pro.arq.dao.clases.xsd.Cliente.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://clases.dao.arq.pro/xsd".equals(namespaceURI) &&
                  "Ibex35".equals(typeName)){
                   
                            return  pro.arq.dao.clases.xsd.Ibex35.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://clases.dao.arq.pro/xsd".equals(namespaceURI) &&
                  "Peticion".equals(typeName)){
                   
                            return  pro.arq.dao.clases.xsd.Peticion.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://sql.java/xsd".equals(namespaceURI) &&
                  "SQLException".equals(typeName)){
                   
                            return  java.sql.xsd.SQLException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://clases.dao.arq.pro/xsd".equals(namespaceURI) &&
                  "Cartera".equals(typeName)){
                   
                            return  pro.arq.dao.clases.xsd.Cartera.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    