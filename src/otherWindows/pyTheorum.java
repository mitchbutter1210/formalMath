package otherWindows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class pyTheorum {

	private JFrame frmPythag;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	private JButton btnFindA;
	private JButton btnFindB;
	private JButton btnFindC;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pyTheorum window = new pyTheorum();
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
	public pyTheorum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPythag = new JFrame();
		frmPythag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmPythag.setIconImage(Toolkit.getDefaultToolkit().getImage(pyTheorum.class.getResource("/calcStuff/318930-680071_charlie_sheen_icon.jpg")));
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
				calcStuff.actCalcs.pyFindA();
			}
		});
		btnFindA.setBounds(33, 261, 117, 25);
		frmPythag.getContentPane().add(btnFindA);
		
		btnFindB = new JButton("Find B");
		btnFindB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcStuff.actCalcs.pyFindB();
			}
		});
		btnFindB.setBounds(162, 261, 117, 25);
		frmPythag.getContentPane().add(btnFindB);
		
		btnFindC = new JButton("Find C");
		btnFindC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcStuff.actCalcs.pyFindC();
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
			}
		});
		btnClear.setBounds(354, 0, 87, 25);
		frmPythag.getContentPane().add(btnClear);
	}
}
