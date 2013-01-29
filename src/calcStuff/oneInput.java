package calcStuff;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class oneInput {

	private JFrame frame;
	public static JTextField textField;
	public static JTextField textField_1;
	private JButton btnSine;
	private JButton btnTangent;
	private JButton btnCosine;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oneInput window = new oneInput();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public oneInput() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(oneInput.class.getResource("/calcStuff/318930-680071_charlie_sheen_icon.jpg")));
		frame.setBounds(100, 100, 450, 432);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(142, 50, 155, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 140, 155, 19);
		frame.getContentPane().add(textField_1);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(183, 113, 70, 15);
		frame.getContentPane().add(lblAnswer);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(183, 23, 70, 15);
		frame.getContentPane().add(lblInput);
		
		JButton btnSquareRoot = new JButton("Square Root");
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actCalcs.sqroot();
			}
		});
		btnSquareRoot.setBounds(12, 207, 140, 25);
		frame.getContentPane().add(btnSquareRoot);
		
		btnSine = new JButton("Sine");
		btnSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actCalcs.sin();
			}
		});
		btnSine.setBounds(12, 267, 117, 25);
		frame.getContentPane().add(btnSine);
		
		btnTangent = new JButton("Tangent");
		btnTangent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actCalcs.tan();
			}
		});
		btnTangent.setBounds(305, 267, 117, 25);
		frame.getContentPane().add(btnTangent);
		
		btnCosine = new JButton("Cosine");
		btnCosine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actCalcs.cos();
			}
		});
		btnCosine.setBounds(164, 267, 117, 25);
		frame.getContentPane().add(btnCosine);
	}
}
