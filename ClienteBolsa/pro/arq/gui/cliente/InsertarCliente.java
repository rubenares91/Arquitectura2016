package pro.arq.gui.cliente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class InsertarCliente {

	private JFrame frmAadirCliente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertarCliente window = new InsertarCliente();
					window.frmAadirCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InsertarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAadirCliente = new JFrame();
		frmAadirCliente.setTitle("A\u00F1adir cliente");
		frmAadirCliente.setBounds(100, 100, 450, 293);
		frmAadirCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAadirCliente.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cliente nuevo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 434, 251);
		frmAadirCliente.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(32, 38, 46, 14);
		panel.add(lblDni);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBounds(210, 38, 46, 14);
		panel.add(lblEmpresa);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(32, 97, 46, 14);
		panel.add(lblDireccin);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(210, 97, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblFechaDeInscripcion = new JLabel("Fecha de inscripcion");
		lblFechaDeInscripcion.setBounds(32, 161, 110, 14);
		panel.add(lblFechaDeInscripcion);
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.setBounds(320, 215, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(210, 215, 89, 23);
		panel.add(btnVolver);
		
		textField = new JTextField();
		textField.setBounds(88, 35, 100, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(266, 35, 143, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 94, 100, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(266, 94, 143, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(154, 158, 102, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
	}

}
