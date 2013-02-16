package otherWindows;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JLabel;

public class PyTheorum {

	private JFrame frmPythag;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	private JButton btnFindA;
	private JButton btnFindB;
	private JButton btnFindC;
	private JButton btnClear;
	private JLabel lblB;
	private JLabel lblC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PyTheorum window = new PyTheorum();
					window.frmPythag.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PyTheorum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPythag = new JFrame();
		frmPythag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmPythag.setIconImage(Toolkit.getDefaultToolkit().getImage(PyTheorum.class.getResource("/calcStuff/318930-680071_charlie_sheen_icon.jpg")));
		frmPythag.setTitle("Pythagorean Theorem");
		frmPythag.setBounds(100, 100, 441, 394);
		frmPythag.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(141, 67, 139, 19);
		frmPythag.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 133, 139, 19);
		frmPythag.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 206, 139, 19);
		frmPythag.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		btnFindA = new JButton("Find A");
		btnFindA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcStuff.ActCalcs.pyFindA();
			}
		});
		btnFindA.setBounds(33, 261, 117, 25);
		frmPythag.getContentPane().add(btnFindA);
		
		btnFindB = new JButton("Find B");
		btnFindB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcStuff.ActCalcs.pyFindB();
			}
		});
		btnFindB.setBounds(162, 261, 117, 25);
		frmPythag.getContentPane().add(btnFindB);
		
		btnFindC = new JButton("Find C");
		btnFindC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcStuff.ActCalcs.pyFindC();
			}
		});
		btnFindC.setBounds(291, 261, 117, 25);
		frmPythag.getContentPane().add(btnFindC);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				URL url = PyTheorum.class.getResource("/sounds/click.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnClear.setBounds(354, 0, 87, 25);
		frmPythag.getContentPane().add(btnClear);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(202, 41, 32, 15);
		frmPythag.getContentPane().add(lblA);
		
		lblB = new JLabel("B");
		lblB.setBounds(202, 106, 32, 15);
		frmPythag.getContentPane().add(lblB);
		
		lblC = new JLabel("C");
		lblC.setBounds(202, 184, 32, 15);
		frmPythag.getContentPane().add(lblC);
	}
}
