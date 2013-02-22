package proportionStuff;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import calcStuff.ActCalcs;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;

public class Proportions {

	private JFrame frame;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	public static JButton btnAreTheyEqual;
	private JButton btnMissing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proportions window = new Proportions();
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
	public Proportions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Proportions");
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
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 114, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(254, 114, 114, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(172, 172, 114, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		btnAreTheyEqual = new JButton("Are they equal?");
		btnAreTheyEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcStuff.ActCalcs.proportions();
			}
		});
		btnAreTheyEqual.setBounds(24, 221, 150, 25);
		frame.getContentPane().add(btnAreTheyEqual);
		
		btnMissing = new JButton("Missing?");
		btnMissing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Missing.main(null);
				URL url = ActCalcs.class.getResource("/sounds/open.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnMissing.setBounds(307, 221, 117, 25);
		frame.getContentPane().add(btnMissing);
	}
}
