package pro.arq.gui.cliente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.axis2.AxisFault;

import pro.arq.dao.clases.xsd.Ibex35;
import pro.arq.dao.clases.xsd.Indice;
import pro.arq.service.BolsaSWSQLExceptionException;
import pro.arq.service.BolsaSWStub;

public class VisualizarIbex35 extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final String IBEX35_XML = "./files/ibex35-jaxb.xml";
	private static final long serialVersionUID = 1L;
	private JFrame frmVisualizarElIbex;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table;
	private JButton btnEliminar;
	private JButton btnModificar;
	// private JButton btnAbiriPeticionesPendientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarIbex35 window = new VisualizarIbex35();
					window.frmVisualizarElIbex.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VisualizarIbex35() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVisualizarElIbex = new JFrame();
		frmVisualizarElIbex.setBounds(100, 100, 450, 300);
		frmVisualizarElIbex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmVisualizarElIbex.setTitle("Visualizar el Ibex25");

		frmVisualizarElIbex.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ibex35:", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 11, 434, 180);
		frmVisualizarElIbex.getContentPane().add(panel);
		panel.setLayout(null);
		scrollPane.setBounds(10, 21, 414, 148);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, },
				new String[] { "Empresa", "Valor $", "Fecha Cierre" }));
		scrollPane.setViewportView(table);

		btnEliminar = new JButton("Actualizar");
		btnEliminar.setBounds(335, 228, 89, 23);
		frmVisualizarElIbex.getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println("btnEliminar.actionPerformed, event=" + evt);
				// TODO add your code for btnEliminar.actionPerformed
				botonCargar();
			}
		});

		btnModificar = new JButton("A\u00F1adir");
		btnModificar.setBounds(237, 228, 89, 23);
		frmVisualizarElIbex.getContentPane().add(btnModificar);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println("btnModificar.actionPerformed, event=" + evt);
				// TODO add your code for btnModificar.actionPerformed
				insertarIBEX35();
			}
		});

		// btnAbiriPeticionesPendientes = new JButton("Volver");
		// btnAbiriPeticionesPendientes.setBounds(10, 221, 126, 30);
		// frmVisualizarElIbex.getContentPane().add(btnAbiriPeticionesPendientes);
		// botonCerrar.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent evt) {
		// System.out.println("botonCerrar.actionPerformed, event="+evt);
		// //TODO add your code for botonCerrar.actionPerformed
		// botonCerrar();
		// }
		// });
	}

	private void botonCargar() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(Ibex35.class);
		System.out.println("Output from our XML File: ");
		Unmarshaller um = context.createUnmarshaller();
		Indice indice2 = (Indice) um.unmarshal(new FileReader(IBEX35_XML));

		for (int i = 0; i < indice2.getEmpresas().toArray().length; i++) {
			System.out.println("Empresa " + (i + 1) + ": " + indice2.getEmpresas().get(i).getEmpresa() + " = "
					+ indice2.getEmpresas().get(i).getValorAccion());
		}
	}

	private void insertarIBEX35() {
		try {

			Ibex35 ib = new Ibex35();

			BolsaSWStub stub = new BolsaSWStub("http://localhost:8080/axis2/services/BolsaSW");

			pro.arq.service.InsertarIbex35 addIBEX = new pro.arq.service.InsertarIbex35();
			addIBEX.setIbex35(ib);

			stub.insertarIbex35(addIBEX);

		} catch (AxisFault e) {
			System.out.println("#AxisFault (addClient) " + e.getMessage());
		} catch (RemoteException e) {
			System.out.println("#RemoteException (addClient) " + e.getMessage());
		} catch (BolsaSWSQLExceptionException e) {
			System.out.println("#BolsaSWSQLExceptionException (addClient) " + e.getMessage());
		}
	}

	private List<String> readFile(String filename) {
		List<String> records = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				records.add(line);
			}
			reader.close();
			return records;
		} catch (Exception e) {
			System.err.format("Exception occurred trying to read '%s'.", filename);
			e.printStackTrace();
			return null;
		}
	}

}
