package pro.arq.dao.clases;

import java.util.Date;

public class Peticion {

private String dni;
private String empresa;
private boolean compraVenta;
private int cantidad;
private Date fechaPeticion;
private int idPeticion;

public Peticion(){
	super();
}
public Peticion(String dni, String empresa, boolean compaVenta, int cantidad, Date fechaPeticion, int idPeticion) {
	super();
	this.dni = dni;
	this.empresa = empresa;
	this.compraVenta = compaVenta;
	this.cantidad = cantidad;
	this.fechaPeticion = fechaPeticion;
	this.idPeticion = idPeticion;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getEmpresa() {
	return empresa;
}
public void setEmpresa(String empresa) {
	this.empresa = empresa;
}
public boolean getCompraVenta() {
	return compraVenta;
}
public void setcompraVenta(boolean compraVenta) {
	this.compraVenta = compraVenta;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public Date getFechaPeticion() {
	return fechaPeticion;
}
public void setFechaPeticion(Date fechaPeticion){
	this.fechaPeticion = fechaPeticion;
}
public int getIdPeticion() {
	return idPeticion;
}
public void setIdPeticion(int idPeticion) {
	this.idPeticion = idPeticion;
}
}