package pro.arq.gui.cliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

public class VisualizarCartera {

	private JFrame frmCarteraDeAcciones;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table;
	private JButton btnEliminar;
	private JButton btnAbiriPeticionesPendientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizarCartera window = new VisualizarCartera();
					window.frmCarteraDeAcciones.setVisible(true);
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
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Empresa", "Numero de acciones", "Valor"
			}
		));
		scrollPane.setViewportView(table);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(335, 228, 89, 23);
		frmCarteraDeAcciones.getContentPane().add(btnEliminar);
		
		btnAbiriPeticionesPendientes = new JButton("Gestion peticiones");
		btnAbiriPeticionesPendientes.setBounds(10, 221, 126, 30);
		frmCarteraDeAcciones.getContentPane().add(btnAbiriPeticionesPendientes);
	}

}
