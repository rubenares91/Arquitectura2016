package pro.arq.dao;

import java.sql.*;
import java.util.*;
//import java.util.Vector;

import pro.arq.dao.clases.Cliente;
import pro.arq.dao.clases.Cartera;
import pro.arq.dao.clases.Ibex35;
import pro.arq.dao.clases.Peticion;


public class GestorBD {

	private Connection con;
    
    private String dataSource = "//localhost:3306/Bolsa2016";
    private String username = "root";
    private String password = "";
    private String driver = "com.mysql.jdbc.Driver";
    private String protocol = "jdbc:mysql";    
    
    public GestorBD(){
    }
    
    public GestorBD(String dataSource, String username, String password){
    	this.dataSource = dataSource;
    	this.username = username;
    	this.password = password;
    }
    
    public void conectar() throws ClassNotFoundException, SQLException{
        Class.forName(driver);        
        String url = protocol + ":" + dataSource;
        con = DriverManager.getConnection(url, username, password);               
    }
    
    public void desconectar() throws SQLException{
        con.close();
    }    
    
    public Cliente obtenerCliente(String dni) throws SQLException{        
    	Cliente cliente = null;
    	String select = "select * from CLIENTES where dni='" + dni +"'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        if (rs.next()){
        	cliente = new Cliente();
        	cliente.setDni(rs.getString("dni"));
        	cliente.setNombre(rs.getString("nombre"));
        	cliente.setDireccion(rs.getString("direccion"));
        	cliente.setEmail(rs.getString("email"));
        	cliente.setFechaInscripcion(rs.getDate("fecha"));
        }
        rs.close();
        stmt.close();  
        return cliente;
    }
    
    public Vector<Cliente> obtenerClientes() throws SQLException{        
        Vector<Cliente> clientes = new Vector<Cliente>();
    	String select = "select * from CLIENTES";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Cliente cliente = new Cliente();
        	cliente.setDni(rs.getString("dni"));
        	cliente.setNombre(rs.getString("nombre"));
        	cliente.setDireccion(rs.getString("direccion"));
        	cliente.setEmail(rs.getString("email"));
        	cliente.setFechaInscripcion(rs.getDate("fecha"));
        	clientes.add(cliente);
        }
        rs.close();
        stmt.close();  
        return clientes;
    }
    
    public void insertarCliente(Cliente cliente) throws SQLException{
        String insert = "insert into CLIENTES " +
                        "(dni, nombre, direccion, email, cartera, fecha) " +
                        "VALUES ('" + cliente.getDni() +
                        "','" + cliente.getNombre() +
                        "','" + cliente.getDireccion() +
                        "','"  + cliente.getEmail() +   
        				"','"  + cliente.getFechaInscripcion() + "')"; 
        Statement stmt = con.createStatement();
        stmt.executeUpdate(insert);
        stmt.close();        
    }
    
    public void modificarCliente(String dni, Cliente cliente) throws SQLException{
        String update = "update CLIENTES set dni='" + cliente.getDni() + 
        				"', nombre='" + cliente.getNombre() +
        				"', direccion='" + cliente.getDireccion() +
        				"', email='" + cliente.getEmail() +
        				"', fecha='" + cliente.getFechaInscripcion() +
        				"' where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(update);
        stmt.close();                
    }
    
    public void eliminarCliente(String dni) throws SQLException{
       	String delete = "delete from CLIENTES where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }

    public int contarClientes() throws SQLException{
    	String count = "select count(*) from CLIENTES";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(count);
        rs.next();
        int numFilas = rs.getInt(1);
        rs.close();
        stmt.close();      
        return numFilas;
    }
    
    public Cartera obtenerCartera(String dni) throws SQLException{        
        Cartera cartera = null;
    	String select = "select * from CARTERAS where dni='" + dni + "'";// Sumarle que tambien la busque por empresa
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        if (rs.next()){
        	cartera = new Cartera();
        	cartera.setEmpresa(rs.getString("empresa"));
        	cartera.setNumAcciones(rs.getInt("numAcciones"));
        	cartera.setDni(rs.getString("dni"));
        }
        rs.close();
        stmt.close();  
        return cartera;
    }
    
    public Vector<Cartera> obtenerCarteras(String dni) throws SQLException{        
        Vector<Cartera> carteras = new Vector<Cartera>();
    	String select = "select * from CARTERAS where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Cartera cartera = new Cartera();
        	cartera.setEmpresa(rs.getString("empresa"));
        	cartera.setNumAcciones(rs.getInt("numAcciones"));
        	cartera.setDni(rs.getString("dni"));
        	carteras.add(cartera);
        }
        rs.close();
        stmt.close();  
        return carteras;
    }
    
    
    public void eliminarCarteras(String dni) throws SQLException{  
       	String delete = "delete from CARTERAS where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }
    
    public void eliminarCartera(String dni) throws SQLException{  //FALTA EL NOMBRE EMPRESA PARA ELIMINARLA
       	String delete = "delete from CARTERAS where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }
    
    public void modificarCartera(String dni, Cartera cartera) throws SQLException{  //FALTA EL NOMBRE DE LA EMPRESA PARA MODIFICARLA
        String update = "update CARTERAS set dni='" + cartera.getDni() + 
        				"', empresa='" + cartera.getEmpresa() +
        				"', nunAcciones='" + cartera.getNumAcciones() +
        				"' where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(update);
        stmt.close();                
    }
    
    public Vector<Peticion> obtenerPeticiones() throws SQLException{        
        Vector<Peticion> peticiones = new Vector<Peticion>();
    	String select = "select * from PETICIONES ";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Peticion peticion = new Peticion();
        	peticion.setDni(rs.getString("dni"));
        	peticion.setEmpresa(rs.getString("empresa"));
        	peticion.setcompraVenta(rs.getBoolean("compraVenta"));
        	peticion.setCantidad(rs.getInt("cantidad"));
        	peticion.setFechaPeticion(rs.getDate("fechaPeticion"));
        	peticion.setIdPeticion(rs.getInt("idPeticion"));
        	peticiones.add(peticion);
        }
        rs.close();
        stmt.close();  
        return peticiones;
    }
    
    public Peticion obtenerPeticion(String dni) throws SQLException{       //FALTA SUMARLE EL IDPETICION 
    	Peticion peticion = new Peticion();
    	String select = "select * from PETICIONES where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        if (rs.next()){
        	peticion = new Peticion();
        	peticion.setDni(rs.getString("dni"));
        	peticion.setEmpresa(rs.getString("empresa"));
        	peticion.setcompraVenta(rs.getBoolean("compraVenta"));
        	peticion.setCantidad(rs.getInt("cantidad"));
        	peticion.setFechaPeticion(rs.getDate("fechaPeticion"));
        	peticion.setIdPeticion(rs.getInt("idPeticion"));
        	
        }
        rs.close();
        stmt.close();  
        return peticion;
    }
    
    public void eliminarPeticiones(String dni) throws SQLException{  
       	String delete = "delete from PETICIONES where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }
    
    public void eliminarPeticion(String dni) throws SQLException{  //FALTA EL NOMBRE EMPRESA PARA ELIMINARLA
       	String delete = "delete from PETICIONES where dni='" + dni + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }
    
    public void insertarPeticion(Peticion peticion) throws SQLException{
        String insert = "insert into PETICIONES " +
                        "(dni, empresa, compraVenta, cantidad, fechaPeticion, idPeticion) " +
                        "VALUES ('" + peticion.getDni() +
                        "','" + peticion.getEmpresa() +
                        "','" + peticion.getCompraVenta() +
                        "','"  + peticion.getCantidad() + 
                        "','"  + peticion.getFechaPeticion() +
        				"','"  + peticion.getIdPeticion() + "')"; 
        Statement stmt = con.createStatement();
        stmt.executeUpdate(insert);
        stmt.close();        
    }
    
    public Vector<Ibex35> obtenerIbexs() throws SQLException{        
        Vector<Ibex35> ibexs = new Vector<Ibex35>();
    	String select = "select * from IBEXS order by fechaCierre";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Ibex35 ibex35 = new Ibex35();
        	ibex35.setEmpresa(rs.getString("empresa"));
        	ibex35.setFechaCierre(rs.getDate("fechaCierre"));
        	ibex35.setValorAccion(rs.getFloat("valorAccion"));
        	ibexs.add(ibex35);
        }
        rs.close();
        stmt.close();  
        return ibexs;
    }
    
    public Ibex35 obtenerIbex(String empresa) throws SQLException{       //FALTA SUMARLE la fecha 
    	Ibex35 ibex35 = new Ibex35();
    	String select = "select * from IBEXS where empresa ='" + empresa + "'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        if (rs.next()){
        	ibex35.setEmpresa(rs.getString("empresa"));
        	ibex35.setFechaCierre(rs.getDate("fechaCierre"));
        	ibex35.setValorAccion(rs.getFloat("valorAccion"));
        }
        rs.close();
        stmt.close();  
        return ibex35;
    }
    
    public void eliminarIbexs(String empresa) throws SQLException{  
       	String delete = "delete from IBEXS where empresa='" + empresa + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }
    
    public void eliminarIbex35(String empresa) throws SQLException{  //FALTA EL NOMBRE EMPRESA PARA ELIMINARLA
       	String delete = "delete from IBEXS where empres='" + empresa + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }
    
    public void insertarIbex35(Ibex35 ibex35) throws SQLException{
        String insert = "insert into IBEXS " +
                        "(empresa, fechaCierre, valorAccion) " +
                        "VALUES ('" + ibex35.getEmpresa() +
                        "','" + ibex35.getFechaCierre() +
        				"','"  + ibex35.getValorAccion() + "')"; 
        Statement stmt = con.createStatement();
        stmt.executeUpdate(insert);
        stmt.close();        
    }
    
    public void modificarIbex35(String empresa, Ibex35 ibex35) throws SQLException{  //FALTA EL NOMBRE DE la fecha PARA MODIFICARLA
        String update = "update IBEXS set EMPRESA='" + ibex35.getEmpresa() + 
        				"', fechaCierre='" + ibex35.getFechaCierre() +
        				"', valorAccion='" + ibex35.getValorAccion() +
        				"' where empresa='" + empresa + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(update);
        stmt.close();                
    } 
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	GestorBD gb = new GestorBD();
    	java.util.Date fecha = new java.util.Date();
    	
    	gb.conectar();
    	Cliente cliente= new Cliente("12345678a","julen","julenar","dir",fecha);
    	gb.insertarCliente(cliente);
    	gb.desconectar();
    }
    }
