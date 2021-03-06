package calcStuff;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;

public class firstClass {

	private JFrame frmCalculator;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JLabel lblSecondNumber;
	public static JLabel lblAnswer;
	public static JButton btnNewButton;
	public static JButton btnNewButton_1;
	public static JButton btnNewButton_2;
	public static JButton btnPower;
	public static JButton btnSquareRoot;
	public static JButton btnQuadratic;
	private JButton btnSine;
	private JButton btnCosine;
	private JButton btnTangent;
	private JButton btnDistance;
	private JButton btnPyTheorum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstClass window = new firstClass();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public firstClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(firstClass.class.getResource("/calcStuff/318930-680071_charlie_sheen_icon.jpg")));
		frmCalculator.setBounds(100, 100, 563, 604);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(203, 70, 114, 19);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 148, 114, 19);
		frmCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(203, 230, 114, 19);
		frmCalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstNumber.setBounds(203, 42, 114, 15);
		frmCalculator.getContentPane().add(lblFirstNumber);
		
		lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecondNumber.setBounds(203, 121, 145, 15);
		frmCalculator.getContentPane().add(lblSecondNumber);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(231, 203, 70, 15);
		frmCalculator.getContentPane().add(lblAnswer);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actCalcs.add();
			}
		});
		btnAdd.setBounds(12, 339, 117, 25);
		frmCalculator.getContentPane().add(btnAdd);
		
		btnNewButton = new JButton("Sub");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actCalcs.sub();
			}
		});
		btnNewButton.setBounds(147, 339, 117, 25);
		frmCalculator.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Multiply");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actCalcs.mult();
			}
		});
		btnNewButton_1.setBounds(289, 339, 117, 25);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Divide");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actCalcs.div();
			}
		});
		btnNewButton_2.setBounds(428, 339, 117, 25);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		btnPower = new JButton("Power");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actCalcs.power();
			}
		});
		btnPower.setBounds(12, 391, 117, 25);
		frmCalculator.getContentPane().add(btnPower);
		
		btnSquareRoot = new JButton("Square Root");
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherWindows.oneInput.main(null);
				URL url = firstClass.class.getResource("/sounds/button-5.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnSquareRoot.setBounds(151, 391, 139, 25);
		frmCalculator.getContentPane().add(btnSquareRoot);
		
		btnQuadratic = new JButton("Quadratic");
		btnQuadratic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherWindows.quadWindow.main(null);
				URL url = firstClass.class.getResource("/sounds/button-5.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnQuadratic.setBounds(314, 391, 117, 25);
		frmCalculator.getContentPane().add(btnQuadratic);
		
		btnSine = new JButton("Sine");
		btnSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherWindows.oneInput.main(null);
				URL url = firstClass.class.getResource("/sounds/button-5.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnSine.setBounds(12, 441, 117, 25);
		frmCalculator.getContentPane().add(btnSine);
		
		btnCosine = new JButton("Cosine");
		btnCosine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherWindows.oneInput.main(null);
				URL url = firstClass.class.getResource("/sounds/button-5.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnCosine.setBounds(147, 441, 117, 25);
		frmCalculator.getContentPane().add(btnCosine);
		
		btnTangent = new JButton("Tangent");
		btnTangent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherWindows.oneInput.main(null);
				URL url = firstClass.class.getResource("/sounds/button-5.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnTangent.setBounds(314, 441, 117, 25);
		frmCalculator.getContentPane().add(btnTangent);
		
		btnDistance = new JButton("Distance");
		btnDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherWindows.distanceFormula.main(null);
				URL url = firstClass.class.getResource("/sounds/button-5.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnDistance.setBounds(12, 490, 117, 25);
		frmCalculator.getContentPane().add(btnDistance);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnClear.setBounds(463, 0, 98, 25);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "This progam was made by Brandon, also known as \n" + 
			"GeneralSnith, HorseMaskInc, or TheBros35.");
			}
		});
		btnAbout.setBounds(463, 37, 98, 25);
		frmCalculator.getContentPane().add(btnAbout);
		
		btnPyTheorum = new JButton("Py Theorum");
		btnPyTheorum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				otherWindows.pyTheorum.main(null);
				URL url = firstClass.class.getResource("/sounds/button-5.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnPyTheorum.setBounds(151, 490, 117, 25);
		frmCalculator.getContentPane().add(btnPyTheorum);
	}
}
