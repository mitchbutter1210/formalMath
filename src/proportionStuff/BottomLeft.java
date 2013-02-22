package proportionStuff;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class BottomLeft {

	private JFrame frame;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_3;
	public static JTextField textField_4;
	public static JButton btnAreTheyEqual;
	private JButton btnMissingIs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BottomLeft window = new BottomLeft();
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
	public BottomLeft() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Bottom Left");
		frame.setBounds(100, 100, 450, 314);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(80, 54, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 54, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(254, 114, 114, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(151, 172, 152, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		btnMissingIs = new JButton("Missing Is...");
		btnMissingIs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcStuff.ActCalcs.bottomLeft();
			}
		});
		btnMissingIs.setBounds(31, 220, 141, 25);
		frame.getContentPane().add(btnMissingIs);
	}

}
