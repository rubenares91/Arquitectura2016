package pro.arq.service;

import java.sql.*;
import java.util.*;
import java.util.Date;

import pro.arq.dao.GestorBD;
import pro.arq.dao.clases.Cliente;
import pro.arq.dao.clases.Cartera;
import pro.arq.dao.clases.Ibex35;
import pro.arq.dao.clases.Peticion;

public class BolsaService {

private GestorBD gsbd;

	    public void conectar() throws ClassNotFoundException, SQLException{
	        gsbd = new GestorBD();
	        gsbd.conectar();
	    }
	    
	    public void desconectar() throws SQLException{
	    	gsbd = new GestorBD();
	        gsbd.desconectar();
	    } 
	    
	    public Cliente obtenerCliente(String dni) throws SQLException{        
	    	gsbd = new GestorBD();
	    	Cliente cli = new Cliente();
	        cli = gsbd.obtenerCliente(dni);
	        return cli;
	    }
	    
	    public Vector<Cliente> obtenerClientes() throws SQLException{        
	    	gsbd = new GestorBD();
	    	Vector<Cliente> clientes = new Vector<Cliente>();
	    	clientes =gsbd.obtenerClientes();
	    	return clientes;
	    }
	    
	    public void insertarCliente(Cliente cliente) throws SQLException{
	    	gsbd = new GestorBD();
	        gsbd.insertarCliente(cliente);   
	    }
	    public void modificarCliente(String dni, Cliente cliente) throws SQLException{
	    	gsbd = new GestorBD();
	        gsbd.modificarCliente(dni, cliente);  
	    }
	    
	    public void eliminarCliente(String dni) throws SQLException{
	    	gsbd = new GestorBD();
	        gsbd.eliminarCliente(dni);
	    }
	    
	    
	    public Cartera obtenerCartera(String dni, String empresa) throws SQLException{        
	    	gsbd = new GestorBD();
	    	Cartera car = new Cartera();
	        car = gsbd.obtenerCartera(dni, empresa);
	        return car;
	    }
	    
	    public Vector<Cartera> obtenerCarteras(String dni) throws SQLException{        
	    	gsbd = new GestorBD();
	    	Vector<Cartera> cartera = new Vector<Cartera>();
	    	cartera =gsbd.obtenerCarteras(dni);
	    	return cartera;
	    }
	    
	    public void eliminarCarteras(String dni) throws SQLException{  
	    	gsbd = new GestorBD();
	        gsbd.eliminarCarteras(dni);
	    } 	
	    
	    public void eliminarCartera(String dni, String empresa) throws SQLException{ 
	    	gsbd = new GestorBD();
	        gsbd.eliminarCartera(dni, empresa);
	    }
	    
	    public void modificarCartera(String dni, String empresa, Cartera cartera) throws SQLException{  
	    	gsbd = new GestorBD();
	        gsbd.modificarCartera(dni, empresa, cartera);
	    }
	    public void insertarCartera(Cartera cartera) throws SQLException{
	    	gsbd = new GestorBD();
	        gsbd.insertarCartera(cartera);
	    }  
	    
	    public Vector<Peticion> obtenerPeticiones() throws SQLException{        
	    	gsbd = new GestorBD();
	    	Vector<Peticion> peticion = new Vector<Peticion>();
	    	peticion =gsbd.obtenerPeticiones();
	    	return peticion;
	    }  
	    public Peticion obtenerPeticion(String dni, int idPeticion) throws SQLException{     
	    	gsbd = new GestorBD();
	    	Peticion peticion = new Peticion();
	        peticion = gsbd.obtenerPeticion(dni, idPeticion);
	        return peticion;
	    }	
	    
	    public void eliminarPeticiones(String dni) throws SQLException{  
	    	gsbd = new GestorBD();
	        gsbd.eliminarPeticiones(dni);
	    }  	
	    
	    public void eliminarPeticion(String dni, String empresa) throws SQLException{ 
	    	gsbd = new GestorBD();
	        gsbd.eliminarPeticion(dni, empresa);
	    }  	
	    public void insertarPeticion(Peticion peticion) throws SQLException{
	    	gsbd = new GestorBD();
	        gsbd.insertarPeticion(peticion);
	    }  
	    
	    public Vector<Ibex35> obtenerIbexs() throws SQLException{        
	    	gsbd = new GestorBD();
	    	Vector<Ibex35> ibex35 = new Vector<Ibex35>();
	    	ibex35 =gsbd.obtenerIbexs();
	    	return ibex35;
	    }  
	    
	    public Ibex35 obtenerIbex(String empresa, Date fechaCierre) throws SQLException{
	    	gsbd = new GestorBD();
	    	Ibex35 ibex35 = new Ibex35();
	    	ibex35 = gsbd.obtenerIbex(empresa, fechaCierre);
	        return ibex35;
	    }	
	    
	    public void eliminarIbexs(String empresa) throws SQLException{  
	    	gsbd = new GestorBD();
	        gsbd.eliminarIbexs(empresa);
	    }
	    
	    public void eliminarIbex35(String empresa, Date fechaCierre) throws SQLException{  
	    	gsbd = new GestorBD();
	        gsbd.eliminarIbex35(empresa, fechaCierre);
	    } 
	    
	    public void insertarIbex35(Ibex35 ibex35) throws SQLException{
	    	gsbd = new GestorBD();
	        gsbd.insertarIbex35(ibex35);
	    }  
	    
	    public void modificarIbex35(String empresa, Date fechaCierre, Ibex35 ibex35) throws SQLException{  
	    	gsbd = new GestorBD();
	        gsbd.modificarIbex35(empresa, fechaCierre, ibex35);
	    }
	    
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    	
	    }	
	    }
