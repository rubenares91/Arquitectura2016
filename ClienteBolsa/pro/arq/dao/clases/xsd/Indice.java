package pro.arq.dao.clases.xsd;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "indice")
public class Indice {

	private String nombre;
	private ArrayList<Ibex35> empresas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElementWrapper(name = "empresas")
	@XmlElement(name = "empresa")
	public ArrayList<Ibex35> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Ibex35> empresas) {
		this.empresas = empresas;
	}

}
