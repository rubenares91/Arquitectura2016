package pro.arq.dao.clases;

import java.util.Date;

public class Ibex35 {

	private String empresa;
	private Date fechaCierre;
	private float valorAccion;


	public Ibex35(){
		super();
	}
	public Ibex35(String empresa, Date fechaCierre, float valorAccion) {
		super();
		this.empresa = empresa;
		this.fechaCierre = fechaCierre;
		this.valorAccion = valorAccion;
		
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Date getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	public float getValorAccion() {
		return valorAccion;
	}
	public void setValorAccion(float valorAccion) {
		this.valorAccion = valorAccion;
	}

}
