package pro.arq.dao.clases;


public class Cartera {

private String dni;
private String empresa;
private boolean compraVenta;
private int cantidad;


public Cartera(){
	super();
}
public Cartera(String dni, String empresa, boolean compraVenta,int cantidad) {
	super();
	this.dni = dni;
	this.empresa = empresa;
	this.compraVenta = compraVenta;
	this.cantidad = cantidad;
	
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

}
