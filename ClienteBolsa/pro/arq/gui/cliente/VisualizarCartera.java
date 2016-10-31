package pro.arq.gui.cliente;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.axis2.AxisFault;

import pro.arq.dao.clases.xsd.MiModeloTabla;
import pro.arq.service.BolsaSWSQLExceptionException;
import pro.arq.service.BolsaSWStub;
import pro.arq.service.ObtenerCarteras;
import pro.arq.service.ObtenerCarterasResponse;

public class VisualizarCartera extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmCarteraDeAcciones;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table;
	private JButton btnEliminar;
	// private JButton btnAbiriPeticionesPendientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarCartera window = new VisualizarCartera();
					window.frmCarteraDeAcciones.setVisible(true);
					/// STUB
					BolsaSWStub stub;
					stub = new BolsaSWStub("http://localhost:8080/axis2/services/BolsaSW");

					ObtenerCarteras obCl = new ObtenerCarteras();
					ObtenerCarterasResponse seResp = stub.obtenerCarteras(obCl);
					pro.arq.dao.clases.xsd.Cartera[] cartera = seResp.get_return();
					MiModeloTabla modelo = new MiModeloTabla();
					Object cart = "dni";
					modelo.addColumn(cart);
					cart = "empresa";
					modelo.addColumn(cart);
					cart = "numAcciones";
					modelo.addColumn(cart);
					int i = 0;
					int j = cartera.length;
					while (i < j) {
						pro.arq.dao.clases.xsd.Cartera bolsa = cartera[i];
						String dni = bolsa.getDni();
						String empresa = bolsa.getEmpresa();
						int nacciones = bolsa.getNumAcciones();
						Object[] dat = { dni, empresa, nacciones };
						modelo.addRow(dat);
						i++;
					}
					JTable table2 = new JTable();
					table2.setModel(modelo);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VisualizarCartera() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarteraDeAcciones = new JFrame();
		frmCarteraDeAcciones.setTitle("Cartera de acciones");
		frmCarteraDeAcciones.setBounds(100, 100, 450, 300);
		frmCarteraDeAcciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarteraDeAcciones.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dni:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 11, 434, 180);
		frmCarteraDeAcciones.getContentPane().add(panel);
		panel.setLayout(null);
		scrollPane.setBounds(10, 21, 414, 148);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, },
				new String[] { "Empresa", "Numero de acciones", "Valor" }));
		scrollPane.setViewportView(table);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(335, 228, 89, 23);
		frmCarteraDeAcciones.getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println("btnEliminar.actionPerformed, event=" + evt);
				// TODO add your code for btnEliminar.actionPerformed
				eliminarCartera();
			}
		});

		// btnAbiriPeticionesPendientes = new JButton("Gestion peticiones");
		// btnAbiriPeticionesPendientes.setBounds(10, 221, 126, 30);
		// frmCarteraDeAcciones.getContentPane().add(btnAbiriPeticionesPendientes);
	}

	private void eliminarCartera() {
		try {

			int posDni = 0;

			BolsaSWStub stub = new BolsaSWStub("http://localhost:8080/axis2/services/BolsaSW");

			pro.arq.service.EliminarCarteras delCartera = new pro.arq.service.EliminarCarteras();
			delCartera.setDni(table.getColumnName(posDni));

			stub.eliminarCarteras(delCartera);

		} catch (AxisFault e) {
			System.out.println("#AxisFault (delCartera) " + e.getMessage());
		} catch (RemoteException e) {
			System.out.println("#RemoteException (delCartera) " + e.getMessage());
		} catch (BolsaSWSQLExceptionException e) {
			System.out.println("#BolsaSWSQLExceptionException (delCartera) " + e.getMessage());
		}
	}

}
