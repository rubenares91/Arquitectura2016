package pro.arq.gui.cliente;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import pro.arq.dao.clases.xsd.Ibex35;
import pro.arq.dao.clases.xsd.Indice;



public class GestionXML {
	
	private static final String IBEX35_XML = "./files/ibex35-jaxb.xml";

	public static void main(String[] args) throws JAXBException, IOException{
		
		// Primero rellenamos los objetos Java y generamos un XML
		ArrayList<Ibex35> carteraValores = new ArrayList<Ibex35>();

		// creamos empresas
		Ibex35 empr = new Ibex35();
		empr.setEmpresa("BBVA");
		empr.setFechaCierre(new java.util.Date());
		empr.setValorAccion((float) 6.59);
		carteraValores.add(empr);

		Ibex35 empr2 = new Ibex35();
		empr2.setEmpresa("ENAGAS");
		empr2.setFechaCierre(new java.util.Date());
		empr2.setValorAccion((float) 26.22);
		carteraValores.add(empr2);

		Indice indice = new Indice();
		indice.setNombre("IBEX35");
		indice.setEmpresas(carteraValores);

		// Creamos el contexto e instanciamos el marshaller
		JAXBContext context = JAXBContext.newInstance(Ibex35.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(indice, System.out);

		Writer w = null;
		try {
			w = new FileWriter(IBEX35_XML);
			m.marshal(indice, w);
		} finally {
			try {
				w.close();
			} catch (Exception e) {
			}
		}

		// Ahora leemos el XML e instanciamos las clases Java
		System.out.println();
		System.out.println("Output from our XML File: ");
		Unmarshaller um = context.createUnmarshaller();
		Indice indice2 = (Indice) um.unmarshal(new FileReader(
				IBEX35_XML));

		for (int i = 0; i < indice2.getEmpresas().toArray().length; i++) {
			System.out.println("Empresa " + (i + 1) + ": "
					+ indice2.getEmpresas().get(i).getEmpresa() + " = "
					+ indice2.getEmpresas().get(i).getValorAccion());
		}

	}
	
}
