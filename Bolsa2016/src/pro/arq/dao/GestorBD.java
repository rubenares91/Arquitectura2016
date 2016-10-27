package pro.arq.dao;

import java.sql.*;

import java.util.Vector;

import pro.arq.dao.clases.Cliente;
import pro.arq.dao.clases.Cartera;
import pro.arq.dao.clases.Ibex35;
import pro.arq.dao.clases.Peticion;


public class GestorBD {

	private Connection con;
    
    private String dataSource = "//localhost/Bolsa2016";
    private String username = "estudiante";
    private String password = "estudiante";
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
    /*NO CREO QUE LA NECESITEMOS
    public Vector<Cliente> obtenerClientesPorNombre(String nombre) throws SQLException{        
        Vector<Cliente> clientes = new Vector<Cliente>();
    	String select = "select * from CLIENTES where nombre like '%" + nombre + "%'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Cliente cliente = new Cliente();
        	cliente.setDni(rs.getString("dni"));
        	cliente.setNombre(rs.getString("nombre"));
        	cliente.setDireccion(rs.getString("direccion"));
        	cliente.setEmail(rs.getString("email"));
        	clientes.add(cliente);
        }
        rs.close();
        stmt.close();  
        return clientes;
    }
    */
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
    /*
    public void borrarClientes() throws SQLException{
       	String delete = "delete from CLIENTES";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }
	*/
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
    
    /*NO LO USAMOS
    public Vector<Linea> obtenerLineasActivas(boolean activa) throws SQLException{        
        Vector<Linea> lineas = new Vector<Linea>();
    	String select = "select * from LINEAS where activa=" + activa + " order by antiguedad";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Linea linea = new Linea();
        	linea.setTelefono(rs.getString("telefono"));
        	linea.setAntiguedad(rs.getString("antiguedad"));
        	linea.setActiva(rs.getBoolean("activa"));
        	linea.setTarifaVoz(rs.getString("tarifaVoz"));
        	linea.setTarifaDatos(rs.getString("tarifaDatos"));
        	linea.setPromocion(rs.getString("promocion"));
        	linea.setDni(rs.getString("dni"));
        	lineas.add(linea);
        }
        rs.close();
        stmt.close();  
        return lineas;
    }
  
    public Vector<Linea> obtenerLineasCliente(String dni) throws SQLException{        
        Vector<Linea> lineas = new Vector<Linea>();
    	String select = "select * from LINEAS where dni='" + dni + "' order by antiguedad";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Linea linea = new Linea();
        	linea.setTelefono(rs.getString("telefono"));
        	linea.setAntiguedad(rs.getString("antiguedad"));
        	linea.setActiva(rs.getBoolean("activa"));
        	linea.setTarifaVoz(rs.getString("tarifaVoz"));
        	linea.setTarifaDatos(rs.getString("tarifaDatos"));
        	linea.setPromocion(rs.getString("promocion"));
        	linea.setDni(rs.getString("dni"));
        	lineas.add(linea);
        }
        rs.close();
        stmt.close();  
        return lineas;
    }
    
    public Vector<Linea> obtenerLineasActivasCliente(String dni, boolean activa) throws SQLException{        
        Vector<Linea> lineas = new Vector<Linea>();
    	String select = "select * from LINEAS where dni='" + dni + "' AND activa=" + activa + " order by antiguedad";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Linea linea = new Linea();
        	linea.setTelefono(rs.getString("telefono"));
        	linea.setAntiguedad(rs.getString("antiguedad"));
        	linea.setActiva(rs.getBoolean("activa"));
        	linea.setTarifaVoz(rs.getString("tarifaVoz"));
        	linea.setTarifaDatos(rs.getString("tarifaDatos"));
        	linea.setPromocion(rs.getString("promocion"));
        	linea.setDni(rs.getString("dni"));
        	lineas.add(linea);
        }
        rs.close();
        stmt.close();  
        return lineas;
    }
    
    public void insertarLinea(Linea linea) throws SQLException{
        String insert = "insert into LINEAS " +
                        "(telefono, antiguedad, activa, tarifaVoz, tarifaDatos, promocion, dni) " +
                        "VALUES ('" + linea.getTelefono() +
                        "','" + linea.getAntiguedad() +
                        "'," + linea.isActiva() +
                        ",'" + linea.getTarifaVoz() +
                        "','" + linea.getTarifaDatos() +
                        "','" + linea.getPromocion() +
                        "','"  + linea.getDni() + "')";                        
        Statement stmt = con.createStatement();
        stmt.executeUpdate(insert);
        stmt.close();        
    }
    
    public void actualizarLinea(String telefono, Linea linea) throws SQLException{
        String update = "update LINEAS set telefono='" + linea.getTelefono() + 
        				"', antiguedad='" + linea.getAntiguedad() +
        				"', activa=" + linea.isActiva() +
        				", tarifaVoz='" + linea.getTarifaVoz() +
        				"', tarifaDatos='" + linea.getTarifaDatos() +
        				"', promocion='" + linea.getPromocion() +
        				"', dni='" + linea.getDni() +
        				"' where telefono='" + telefono + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(update);
        stmt.close();                
    }
    
    public void activarLinea(String telefono, boolean activa) throws SQLException{
        String update = "update LINEAS set activa=" + activa + " where telefono='" + telefono + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(update);
        stmt.close();                
    }
    
    public void borrarLinea(String telefono) throws SQLException{
       	String delete = "delete from LINEAS where telefono='" + telefono + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }

    public void borrarLineas() throws SQLException{
       	String delete = "delete from LINEAS";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }

    public int contarLineas() throws SQLException{
    	String count = "select count(*) from LINEAS";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(count);
        rs.next();
        int numFilas = rs.getInt(1);
        rs.close();
        stmt.close();      
        return numFilas;
    }

    public Factura obtenerFactura(int idFactura) throws SQLException{        
        Factura factura = null;
    	String select = "select * from FACTURAS where idFactura=" + idFactura;
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        if (rs.next()){
        	factura = new Factura();
        	factura.setIdFactura(rs.getInt("idFactura"));
        	factura.setFecha(rs.getString("fecha"));
        	factura.setPeriodo(rs.getString("periodo"));
        	factura.setImporte(rs.getFloat("importe"));
        	factura.setTelefono(rs.getString("telefono"));
        }
        rs.close();
        stmt.close();  
        return factura;
    }    
    public Vector<Factura> obtenerFacturas() throws SQLException{        
        Vector<Factura> facturas = new Vector<Factura>();
    	String select = "select * from FACTURAS order by fecha desc";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Factura factura = new Factura();
        	factura.setIdFactura(rs.getInt("idFactura"));
        	factura.setFecha(rs.getString("fecha"));
        	factura.setPeriodo(rs.getString("periodo"));
        	factura.setImporte(rs.getFloat("importe"));
        	factura.setTelefono(rs.getString("telefono"));
        	facturas.add(factura);
        }
        rs.close();
        stmt.close();  
        return facturas;
    }    
    public Vector<Factura> obtenerFacturasLinea(String telefono) throws SQLException{        
        Vector<Factura> facturas = new Vector<Factura>();
    	String select = "select * from FACTURAS where telefono='" + telefono + "' order by fecha desc";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Factura factura = new Factura();
        	factura.setIdFactura(rs.getInt("idFactura"));
        	factura.setFecha(rs.getString("fecha"));
        	factura.setPeriodo(rs.getString("periodo"));
        	factura.setImporte(rs.getFloat("importe"));
        	factura.setTelefono(rs.getString("telefono"));
        	facturas.add(factura);
        }
        rs.close();
        stmt.close();  
        return facturas;
    }

    public Vector<Factura> obtenerFacturasCliente(String dni) throws SQLException{        
        Vector<Factura> facturas = new Vector<Factura>();
    	String select = "select * from FACTURAS as F, LINEAS as L where f.telefono=l.telefono and l.dni='" + dni + "' order by f.telefono, f.fecha desc";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Factura factura = new Factura();
        	factura.setIdFactura(rs.getInt("idFactura"));
        	factura.setFecha(rs.getString("fecha"));
        	factura.setPeriodo(rs.getString("periodo"));
        	factura.setImporte(rs.getFloat("importe"));
        	factura.setTelefono(rs.getString("telefono"));
        	facturas.add(factura);
        }
        rs.close();
        stmt.close();  
        return facturas;
    }
    
    public int insertarFactura(Factura factura) throws SQLException{
        String insert = "insert into FACTURAS " +
                        "(fecha, periodo, importe, telefono) " +
                        "VALUES ('" + factura.getFecha() +
                        "','" + factura.getPeriodo() +
                        "'," + factura.getImporte() +
                        ",'"  + factura.getTelefono() + "')";                        
        Statement stmt = con.createStatement();
        stmt.executeUpdate(insert);
        stmt.close();
        
        String max = "select MAX(idFactura) as id from FACTURAS";
        Statement stmt1 = con.createStatement();
        ResultSet rs = stmt1.executeQuery(max);
        int id = 0;
        if (rs.next()){
        	id = rs.getInt("id");
        }
        stmt1.close();
        factura.setIdFactura(id);
        return id;
    }
    
    public void actualizarFactura(int idFactura, Factura factura) throws SQLException{
        String update = "update FACTURAS set idFactura=" + factura.getIdFactura() + 
        				", fecha='" + factura.getFecha() +
        				"', periodo='" + factura.getPeriodo() +
        				"', importe=" + factura.getImporte() +
        				", telefono='" + factura.getTelefono() +
        				"' where idFactura=" + idFactura;
        Statement stmt = con.createStatement();
        stmt.executeUpdate(update);
        stmt.close();                
    }
    
    public void borrarFactura(int idFactura) throws SQLException{
       	String delete = "delete from FACTURAS where idFactura=" + idFactura;
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }

    public void borrarFacturas() throws SQLException{
       	String delete = "delete from FACTURAS";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }

    public int contarFacturas() throws SQLException{
    	String count = "select count(*) from FACTURAS";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(count);
        rs.next();
        int numFilas = rs.getInt(1);
        rs.close();
        stmt.close();      
        return numFilas;
    }
  
    public Terminal obtenerTerminal(String idTerminal) throws SQLException{        
        Terminal terminal = null;
    	String select = "select * from TERMINALES where idTerminal='" + idTerminal + "'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        if (rs.next()){
        	terminal = new Terminal();
        	terminal.setIdTerminal(rs.getString("idTerminal"));
        	terminal.setMarca(rs.getString("marca"));
        	terminal.setModelo(rs.getString("modelo"));
        	terminal.setPrecio(rs.getFloat("precio"));
        	terminal.setPromoOro(rs.getFloat("promoOro"));
        	terminal.setPromoPlata(rs.getFloat("promoPlata"));
        	terminal.setPromoBronce(rs.getFloat("promoBronce"));        	
        }
        rs.close();
        stmt.close();  
        return terminal;
    }
    
    public Vector<Terminal> obtenerTerminales() throws SQLException{        
        Vector<Terminal> terminales = new Vector<Terminal>();
    	String select = "select * from TERMINALES order by precio desc";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Terminal terminal = new Terminal();
        	terminal.setIdTerminal(rs.getString("idTerminal"));
        	terminal.setMarca(rs.getString("marca"));
        	terminal.setModelo(rs.getString("modelo"));
        	terminal.setPrecio(rs.getFloat("precio"));
        	terminal.setPromoOro(rs.getFloat("promoOro"));
        	terminal.setPromoPlata(rs.getFloat("promoPlata"));
        	terminal.setPromoBronce(rs.getFloat("promoBronce"));        	
        	terminales.add(terminal);
        }
        rs.close();
        stmt.close();  
        return terminales;
    }
    
    public Vector<Terminal> obtenerTerminalesPorMarca(String marca) throws SQLException{        
        Vector<Terminal> terminales = new Vector<Terminal>();
    	String select = "select * from TERMINALES where marca like '%" + marca + "%' order by precio desc";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Terminal terminal = new Terminal();
        	terminal.setIdTerminal(rs.getString("idTerminal"));
        	terminal.setMarca(rs.getString("marca"));
        	terminal.setModelo(rs.getString("modelo"));
        	terminal.setPrecio(rs.getFloat("precio"));
        	terminal.setPromoOro(rs.getFloat("promoOro"));
        	terminal.setPromoPlata(rs.getFloat("promoPlata"));
        	terminal.setPromoBronce(rs.getFloat("promoBronce"));        	
        	terminales.add(terminal);
        }
        rs.close();
        stmt.close();  
        return terminales;
    }

    public Vector<Terminal> obtenerTerminalesPorModelo(String modelo) throws SQLException{        
        Vector<Terminal> terminales = new Vector<Terminal>();
    	String select = "select * from TERMINALES where modelo like '%" + modelo + "%' order by precio desc";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Terminal terminal = new Terminal();
        	terminal.setIdTerminal(rs.getString("idTerminal"));
        	terminal.setMarca(rs.getString("marca"));
        	terminal.setModelo(rs.getString("modelo"));
        	terminal.setPrecio(rs.getFloat("precio"));
        	terminal.setPromoOro(rs.getFloat("promoOro"));
        	terminal.setPromoPlata(rs.getFloat("promoPlata"));
        	terminal.setPromoBronce(rs.getFloat("promoBronce"));        	
        	terminales.add(terminal);
        }
        rs.close();
        stmt.close();  
        return terminales;
    }

    public Vector<Terminal> obtenerTerminalesPorPrecio(float min, float max) throws SQLException{        
        Vector<Terminal> terminales = new Vector<Terminal>();
    	String select = "select * from TERMINALES where precio >= " + min + " AND precio <= " + max + " order by precio desc";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(select);
        while (rs.next()){
        	Terminal terminal = new Terminal();
        	terminal.setIdTerminal(rs.getString("idTerminal"));
        	terminal.setMarca(rs.getString("marca"));
        	terminal.setModelo(rs.getString("modelo"));
        	terminal.setPrecio(rs.getFloat("precio"));
        	terminal.setPromoOro(rs.getFloat("promoOro"));
        	terminal.setPromoPlata(rs.getFloat("promoPlata"));
        	terminal.setPromoBronce(rs.getFloat("promoBronce"));        	
        	terminales.add(terminal);
        }
        rs.close();
        stmt.close();  
        return terminales;
    }

    
    public void insertarTerminal(Terminal terminal) throws SQLException{
        String insert = "insert into TERMINALES " +
                        "(idTerminal, marca, modelo, precio, promoOro, promoPlata, promoBronce) " +
                        "VALUES ('" + terminal.getIdTerminal() +
                        "','" + terminal.getMarca() +
                        "','" + terminal.getModelo() +
                        "'," + terminal.getPrecio() +
                        "," + terminal.getPromoOro() +
                        "," + terminal.getPromoPlata() +
                        ","  + terminal.getPromoBronce() + ")";                        
        Statement stmt = con.createStatement();
        stmt.executeUpdate(insert);
        stmt.close();        
    }
    
    public void actualizarTerminal(String idTerminal, Terminal terminal) throws SQLException{
        String update = "update TERMINALES set idTerminal='" + terminal.getIdTerminal() + 
        				"', marca='" + terminal.getMarca() +
        				"', modelo='" + terminal.getModelo() +
        				"', precio=" + terminal.getPrecio() +
        				", promoOro=" + terminal.getPromoOro() +
        				", promoPlata=" + terminal.getPromoPlata() +
        				", promoBronce=" + terminal.getPromoBronce() +
        				" where idTerminal='" + idTerminal + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(update);
        stmt.close();                
    }
    
    public void borrarTerminal(String idTerminal) throws SQLException{
       	String delete = "delete from TERMINALES where idTerminal='" + idTerminal + "'";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }

    public void borrarTerminales() throws SQLException{
       	String delete = "delete from TERMINALES";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(delete);
        stmt.close();	                  
    }

    public int contarTerminales() throws SQLException{
    	String count = "select count(*) from TERMINALES";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(count);
        rs.next();
        int numFilas = rs.getInt(1);
        rs.close();
        stmt.close();      
        return numFilas;
    }
*/
}
