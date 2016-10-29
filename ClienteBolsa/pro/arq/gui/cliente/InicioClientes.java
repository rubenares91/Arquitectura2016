package pro.arq.gui.cliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pro.arq.dao.clases.xsd.MiModeloTabla;
import pro.arq.dao.clases.Cliente;
import pro.arq.service.BolsaSWStub;
import pro.arq.service.ObtenerClientes;
import pro.arq.service.ObtenerClientesResponse;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class InicioClientes {

	private JFrame frmClientes;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/*
				 A PARTIR DE AQUI EN EL MAIN LO QUE HAGO ES CREAR EL STUB, LLAMO AL METODO
				 QUE NOS DEVUELVE EL VECTOR Y LO GESTIONO PARA METERLO EN LA TABLA DE LA INTERFAZ
				 EL FALLO QUE DA ES SIMPLEMENTE QUE NO CONCUERDAN LOS PARAMETROS VECTOR CON LO QUE 
				 DEVUELVE EL RETURN DEL RESPONSE
				 */
				try {
					InicioClientes window = new InicioClientes();
					window.frmClientes.setVisible(true);
					BolsaSWStub stub;
		        	stub = new BolsaSWStub("http://localhost:8080/axis2/services/BolsaSW");
		        	Vector<Cliente> clientes = new Vector<Cliente>();
		        	ObtenerClientes obCl;
		        	ObtenerClientesResponse seResp = stub.obtenerClientes(obCl);
		        	Vector<Cliente> v = new  Vector<Cliente>();
		        	v = seResp.get_return();
		            MiModeloTabla modelo = new MiModeloTabla();
		            Object client= "Dni";modelo.addColumn(client);
		            client= "Nombre"; modelo.addColumn(client);
		            client= "Direccion"; modelo.addColumn(client);
		            client= "Email"; modelo.addColumn(client);
		            client= "Fecha";modelo.addColumn(client);
		            int i=0;
		            int j=v.size();
		            while (i<j){
		            	  		  Cliente cli=v.get(i);
		                          String dni=cli.getDni();
		                          String nom=cli.getNombre();
		                          String dir=cli.getDireccion();
		                          String email=cli.getEmail();
		                          String fech="-".toString();
		                          if (cli.getFechaInscripcion()!=null)
		                          {
		                          fech=cli.getFechaInscripcion().toString();
		                          }
		                          Object[] dat={dni,nom,dir,email,fech};
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
	public InicioClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClientes = new JFrame();
		frmClientes.setTitle("Clientes");
		frmClientes.setBounds(100, 100, 515, 498);
		frmClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClientes.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 471);
		frmClientes.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("A\u00F1adir Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(363, 420, 126, 29);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 45, 468, 364);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setColumnHeaderView(table_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"DNI", "Nombre", "Direccion", "Email", "Fecha"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClientes.setBounds(21, 11, 95, 23);
		panel.add(lblClientes);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(258, 420, 95, 29);
		panel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(153, 420, 95, 29);
		panel.add(btnEliminar);
		
		JButton btnVerCartera = new JButton("Ver Cartera");
		btnVerCartera.setBounds(21, 420, 95, 29);
		panel.add(btnVerCartera);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(383, 14, 89, 23);
		panel.add(btnSalir);
	}
}
