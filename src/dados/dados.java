package dados;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.nio.charset.CoderMalfunctionError;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class dados extends JFrame {

	private JPanel txtMostrar;
	private JTextField txtTiradas;
	private JRadioButton rdbtn4;
	private JRadioButton rdbtn6;
	private JRadioButton rdbtn8;
	private JRadioButton rdbtn10;
	private JRadioButton rdbtn20;
	private JTextArea textRes;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dados frame = new dados();
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
	public dados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 458);
		txtMostrar = new JPanel();
		txtMostrar.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(txtMostrar);
		txtMostrar.setLayout(null);

		JLabel lblNewLabel = new JLabel("Introduzca el n\u00FAmero de tiradas: ");
		lblNewLabel.setBounds(75, 204, 242, 14);
		txtMostrar.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Elija el tipo de dado.\n");
		lblNewLabel_1.setBounds(113, 35, 218, 14);
		txtMostrar.add(lblNewLabel_1);

		rdbtn4 = new JRadioButton("  4 caras");
		rdbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn4.isSelected()) {
					rdbtn6.setSelected(false);
					rdbtn8.setSelected(false);
					rdbtn10.setSelected(false);
					rdbtn20.setSelected(false);
				}

			}
		});
		rdbtn4.setBounds(113, 56, 109, 23);
		txtMostrar.add(rdbtn4);

		rdbtn6 = new JRadioButton("  6 caras");
		rdbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn6.isSelected()) {
					rdbtn4.setSelected(false);
					rdbtn8.setSelected(false);
					rdbtn10.setSelected(false);
					rdbtn20.setSelected(false);
				}
			}
		});
		rdbtn6.setBounds(113, 82, 109, 23);
		txtMostrar.add(rdbtn6);

		rdbtn8 = new JRadioButton("  8 caras");
		rdbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn8.isSelected()) {
					rdbtn4.setSelected(false);
					rdbtn6.setSelected(false);
					rdbtn10.setSelected(false);
					rdbtn20.setSelected(false);
				}
			}
		});
		rdbtn8.setBounds(113, 108, 109, 23);
		txtMostrar.add(rdbtn8);

		rdbtn10 = new JRadioButton("  10 caras");
		rdbtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn10.isSelected()) {
					rdbtn4.setSelected(false);
					rdbtn6.setSelected(false);
					rdbtn8.setSelected(false);
					rdbtn20.setSelected(false);
				}
			}
		});
		rdbtn10.setBounds(113, 134, 109, 23);
		txtMostrar.add(rdbtn10);

		rdbtn20 = new JRadioButton("  20 caras");
		rdbtn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtn20.isSelected()) {
					rdbtn4.setSelected(false);
					rdbtn6.setSelected(false);
					rdbtn8.setSelected(false);
					rdbtn10.setSelected(false);
				}
			}
		});
		rdbtn20.setBounds(113, 160, 109, 23);

		txtMostrar.add(rdbtn20);

		txtTiradas = new JTextField();
		txtTiradas.setText("1");
		txtTiradas.setBounds(137, 229, 43, 20);
		txtMostrar.add(txtTiradas);
		txtTiradas.setColumns(10);

		textRes = new JTextArea();
		textRes.setBounds(10, 293, 297, 115);
		txtMostrar.add(textRes);

		btnNewButton = new JButton("Lanzar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tiradas = Integer.parseInt(txtTiradas.getText());
				if (tiradas == 0) {
					textRes.append("Introduzca el número de tiradas.");
				}
				if (rdbtn4.isSelected()) {
					for (int i = 1; i <= tiradas; i++) {
						int dado = (int) ((Math.random() * 4) + 1);
						textRes.append("Tirada " + i + "º: " + dado + "\n");
					}
				} else if (rdbtn6.isSelected()) {
					for (int i = 1; i <= tiradas; i++) {
						int dado = (int) ((Math.random() * 6) + 1);
						textRes.append("Tirada " + i + "º: " + dado + "\n");
					}
				} else if (rdbtn8.isSelected()) {
					for (int i = 1; i <= tiradas; i++) {
						int dado = (int) ((Math.random() * 8) + 1);
						textRes.append("Tirada " + i + "º: " + dado + "\n");
					}
				} else if (rdbtn10.isSelected()) {
					for (int i = 1; i <= tiradas; i++) {
						int dado = (int) ((Math.random() * 10) + 1);
						textRes.append("Tirada " + i + "º: " + dado + "\n");
					}
				} else if (rdbtn20.isSelected()) {
					for (int i = 1; i <= tiradas; i++) {
						int dado = (int) ((Math.random() * 20) + 1);
						textRes.append("Tirada " + i + "º: " + dado + "\n");
					}
				} else {
					textRes.append("Elija un tipo de dado.");
				}
			}
		});
		btnNewButton.setBounds(54, 259, 89, 23);
		txtMostrar.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRes.setText(null);
			}
		});
		btnNewButton_1.setBounds(174, 259, 89, 23);
		txtMostrar.add(btnNewButton_1);

	}
}
