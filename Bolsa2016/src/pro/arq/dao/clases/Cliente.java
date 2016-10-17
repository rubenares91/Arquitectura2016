package pro.arq.dao.clases;

import java.util.Date;

public class Cliente {
	private String dni;
	private String nombre;
	private String direccion;
	private String email;
	private int idCartera;
	private Date fechaInscripcion;
	
	public Cliente(){
		super();
	}
	public Cliente(String dni, String nombre, String direccion, String email, int idCartera, Date fechaInscripcion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.idCartera = idCartera;
		this.fechaInscripcion = fechaInscripcion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getidCartera() {
		return idCartera;
	}
	public void setIdCartera(int idCartera){
		this.idCartera = idCartera;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion){
		this.fechaInscripcion = fechaInscripcion;
	}
	
}
