package pro.arq.gui.cliente;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class ModificarCartera {

	private JFrame frmModificarCartera;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarCartera window = new ModificarCartera();
					window.frmModificarCartera.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModificarCartera() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModificarCartera = new JFrame();
		frmModificarCartera.setTitle("Modificar cartera");
		frmModificarCartera.setBounds(100, 100, 450, 237);
		frmModificarCartera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		frmModificarCartera.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cartera a modificar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 434, 205);
		frmModificarCartera.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(32, 38, 46, 14);
		panel.add(lblDni);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setBounds(210, 38, 46, 14);
		panel.add(lblEmpresa);
		
		JLabel lblDireccin = new JLabel("Cantidad");
		lblDireccin.setBounds(32, 97, 46, 14);
		panel.add(lblDireccin);
		
		JLabel lblEmail = new JLabel("Valor");
		lblEmail.setBounds(210, 97, 46, 14);
		panel.add(lblEmail);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.setBounds(319, 156, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(210, 156, 89, 23);
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
	}


}
