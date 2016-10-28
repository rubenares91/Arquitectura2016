package pro.arq.gui.cliente;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;

public class VisualizarIbex35 {

	private JFrame frmVisualizarElIbex;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnAbiriPeticionesPendientes;

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
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ibex35:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 11, 434, 180);
		frmVisualizarElIbex.getContentPane().add(panel);
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
				"Empresa", "Valor $", "Fecha Cierre"
			}
		));
		scrollPane.setViewportView(table);
		
		btnEliminar = new JButton("Actualizar");
		btnEliminar.setBounds(335, 228, 89, 23);
		frmVisualizarElIbex.getContentPane().add(btnEliminar);
		
		btnModificar = new JButton("A\u00F1adir");
		btnModificar.setBounds(237, 228, 89, 23);
		frmVisualizarElIbex.getContentPane().add(btnModificar);
		
		btnAbiriPeticionesPendientes = new JButton("Volver");
		btnAbiriPeticionesPendientes.setBounds(10, 221, 126, 30);
		frmVisualizarElIbex.getContentPane().add(btnAbiriPeticionesPendientes);
	}


}
