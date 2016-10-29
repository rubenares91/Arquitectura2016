package pro.arq.dao.clases;
//
//
public class Cartera {

private String dni;
private String empresa;
private int numAcciones;


public Cartera(){
	super();
}
public Cartera(String dni, String empresa, int numAcciones) {
	super();
	this.dni = dni;
	this.empresa = empresa;
	this.numAcciones = numAcciones;
	
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
public int getNumAcciones() {
	return numAcciones;
}
public void setNumAcciones(int numAcciones) {
	this.numAcciones = numAcciones;
}

}
