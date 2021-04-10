package nóminas;

/**
 * @author Felipe Argandoña Alonso
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Nominas extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private JTextField txtNIF;
	private JTextField txtSS;
	private JTextField txtTarifa;
	private JTextField txtHoras;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nominas frame = new Nominas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Nominas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Informaci\u00F3n del trabajador");
		lblNewLabel.setBounds(150, 11, 142, 14);
		contentPane.add(lblNewLabel);

		/**
		 * Se generan los cuadros de texto donde se introduciran los datos:
		 * 
		 * @param txtNombre
		 * @param txtApellido1
		 * @param txtApellido2
		 * @param txtNIF
		 * @param txtSS
		 * @param txtHoras
		 * 
		 * Tras lo cual devuevlve:
		 * 
		 * @return bonificaciones
		 * @return salarioBruto
		 * @return retenciones
		 * @return salarioNeto
		 */
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(56, 58, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido1 = new JTextField();
		txtApellido1.setText("Primer apellido");
		txtApellido1.setBounds(56, 89, 86, 20);
		contentPane.add(txtApellido1);
		txtApellido1.setColumns(10);

		txtApellido2 = new JTextField();
		txtApellido2.setText("Segundo apellido");
		txtApellido2.setBounds(56, 120, 86, 20);
		contentPane.add(txtApellido2);
		txtApellido2.setColumns(10);

		txtNIF = new JTextField();
		txtNIF.setText("NIF");
		txtNIF.setBounds(56, 182, 86, 20);
		contentPane.add(txtNIF);
		txtNIF.setColumns(10);

		txtSS = new JTextField();
		txtSS.setText("Seguridad social");
		txtSS.setBounds(56, 151, 86, 20);
		contentPane.add(txtSS);
		txtSS.setColumns(10);

		txtTarifa = new JTextField();
		txtTarifa.setText("Tarifa (\u20AC/h)");
		txtTarifa.setBounds(263, 58, 97, 20);
		contentPane.add(txtTarifa);
		txtTarifa.setColumns(10);

		txtHoras = new JTextField();
		txtHoras.setText("Horas trabajadas");
		txtHoras.setBounds(263, 89, 97, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);

		JTextArea txtNomina = new JTextArea();
		txtNomina.setBounds(10, 269, 414, 242);
		contentPane.add(txtNomina);

		JButton btnNewButton = new JButton("Generar n\u00F3mina");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				String apellido1 = txtApellido1.getText();
				String apellido2 = txtApellido2.getText();
				String nif = txtNIF.getText();
				String ss = txtSS.getText();
				double tarifa = Double.parseDouble(txtTarifa.getText());
				double salarioBruto = 0, retenciones = 0;
				int horas = Integer.parseInt(txtHoras.getText());
				txtNomina.append(nombre + " " + apellido1 + " " + apellido2 + ".\n");
				txtNomina.append("NIF: " + nif + ".\n");
				txtNomina.append("Número de SS: " + ss + ".\n");
				txtNomina.append("\n");
				txtNomina.append("Salario base: " + (horas * tarifa) + "€.\n");
				double bonificacion = 0;
				if (horas <= 10) {
					bonificacion = 0.05;
				} else if (horas > 10 && horas <= 20) {
					bonificacion = 0.1;
				} else {
					bonificacion = 0.3;
				}
				salarioBruto = (horas * tarifa) + (horas * tarifa * bonificacion);
				retenciones = Math.round(salarioBruto * 0.15);
				txtNomina.append("\n");
				txtNomina.append("Bonificación aplicada " + bonificacion + "%.\n");
				txtNomina.append(" ");
				txtNomina.append("Salario bruto: " + salarioBruto + "€.\n");
				txtNomina.append("\n");
				txtNomina.append("Retenciones: " + retenciones + "€.\n");
				txtNomina.append("\n");
				txtNomina.append("Salario neto: " + (salarioBruto-retenciones) + "€.\n");
			}
		});
		btnNewButton.setBounds(160, 235, 117, 23);
		contentPane.add(btnNewButton);

	}
}
