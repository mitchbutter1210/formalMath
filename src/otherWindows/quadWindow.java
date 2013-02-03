package otherWindows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class quadWindow {

	private JFrame frmQuadriatic;
	public static JTextField textField_1;
	public static JTextField textField;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	private JLabel lblEnterC;
	private JLabel lblAnswer;
	private JLabel lblAnswer_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quadWindow window = new quadWindow();
					window.frmQuadriatic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public quadWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuadriatic = new JFrame();
		frmQuadriatic.setTitle("Quadriatic");
		frmQuadriatic.setIconImage(Toolkit.getDefaultToolkit().getImage(quadWindow.class.getResource("/calcStuff/318930-680071_charlie_sheen_icon.jpg")));
		frmQuadriatic.setBounds(100, 100, 408, 543);
		frmQuadriatic.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(133, 67, 114, 19);
		frmQuadriatic.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 136, 114, 19);
		frmQuadriatic.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 211, 114, 19);
		frmQuadriatic.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Answer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcStuff.actCalcs.quadratic();
			}
		});
		btnNewButton.setBounds(234, 418, 117, 25);
		frmQuadriatic.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(35, 320, 154, 19);
		frmQuadriatic.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(214, 320, 159, 19);
		frmQuadriatic.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEnterA = new JLabel("Enter A");
		lblEnterA.setBounds(158, 40, 70, 15);
		frmQuadriatic.getContentPane().add(lblEnterA);
		
		JLabel lblEnterB = new JLabel("Enter B");
		lblEnterB.setBounds(158, 109, 70, 15);
		frmQuadriatic.getContentPane().add(lblEnterB);
		
		lblEnterC = new JLabel("Enter C");
		lblEnterC.setBounds(158, 184, 70, 15);
		frmQuadriatic.getContentPane().add(lblEnterC);
		
		lblAnswer = new JLabel("Answer 1");
		lblAnswer.setBounds(77, 293, 70, 15);
		frmQuadriatic.getContentPane().add(lblAnswer);
		
		lblAnswer_1 = new JLabel("Answer 2");
		lblAnswer_1.setBounds(234, 293, 70, 15);
		frmQuadriatic.getContentPane().add(lblAnswer_1);
	}
}
