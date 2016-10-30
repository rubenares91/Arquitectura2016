package pro.arq.gui.cliente;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import pro.arq.dao.clases.Ibex35;



public class GestionXML {
	
	private static final String IBEX35_XML = "./files/ibex35-jaxb.xml";

	public static void main(String[] args) {
		try{
			
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

		// create bookstore, assigning book
//		Bookstore bookstore = new Bookstore();
//		bookstore.setName("Fraport Bookstore");
//		bookstore.setLocation("Frankfurt Airport");
//		bookstore.setUrl("www.allbooks.com");
//		bookstore.setBookList(bookList);

		// create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext.newInstance(Ibex35.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(carteraValores, System.out);

		Writer w = null;
		try {
			w = new FileWriter(IBEX35_XML);
			m.marshal(carteraValores, w);
		} finally {
			try {
				w.close();
			} catch (Exception e) {
			}
		}
		System.out.println();
		//System.out.println("And also only one book: ");
		m.marshal(empr2, System.out);

		// get variables from our xml file, created before
//		System.out.println();
//		System.out.println("Output from our XML File: ");
//		Unmarshaller um = context.createUnmarshaller();
//		Ibex35 carteraValores2 = (Ibex35) um.unmarshal(new FileReader(
//				IBEX35_XML));
//
//		for (int i = 0; i < carteraValores2.getBookList().toArray().length; i++) {
//			System.out.println("Book " + (i + 1) + ": "
//					+ carteraValores2.getBookList().get(i).getName() + " from "
//					+ carteraValores2.getBookList().get(i).getAuthor());
//		}
		
		} catch (Exception e) {
		}

	}

}
