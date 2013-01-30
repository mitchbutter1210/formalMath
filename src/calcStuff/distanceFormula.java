package calcStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class distanceFormula {

	private JFrame frmDistanceFormula;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JLabel lblY;
	public static JLabel lblX_1;
	public static JLabel lblY_1;
	public static JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distanceFormula window = new distanceFormula();
					window.frmDistanceFormula.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public distanceFormula() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDistanceFormula = new JFrame();
		frmDistanceFormula.setTitle("Distance Formula");
		frmDistanceFormula.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		frmDistanceFormula.setBounds(100, 100, 530, 396);
		frmDistanceFormula.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(60, 88, 185, 19);
		frmDistanceFormula.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 88, 172, 19);
		frmDistanceFormula.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(60, 170, 185, 19);
		frmDistanceFormula.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(283, 170, 172, 19);
		frmDistanceFormula.getContentPane().add(textField_3);
		
		JLabel lblX = new JLabel("X 1");
		lblX.setBounds(132, 62, 70, 15);
		frmDistanceFormula.getContentPane().add(lblX);
		
		lblY = new JLabel("Y 1");
		lblY.setBounds(132, 143, 70, 15);
		frmDistanceFormula.getContentPane().add(lblY);
		
		lblX_1 = new JLabel("X 2");
		lblX_1.setBounds(338, 61, 70, 15);
		frmDistanceFormula.getContentPane().add(lblX_1);
		
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actCalcs.distance();
			}
		});
		btnAnswer.setBounds(316, 264, 117, 25);
		frmDistanceFormula.getContentPane().add(btnAnswer);
		
		lblY_1 = new JLabel("Y 2");
		lblY_1.setBounds(338, 143, 70, 15);
		frmDistanceFormula.getContentPane().add(lblY_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(60, 267, 185, 22);
		frmDistanceFormula.getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}
}
