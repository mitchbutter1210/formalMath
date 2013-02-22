package proportionStuff;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;

import calcStuff.ActCalcs;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;

public class Missing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Missing window = new Missing();
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
	public Missing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Proportions.class.getResource("/calcStuff/318930-680071_charlie_sheen_icon.jpg")));
		frame.setTitle("Missing?");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTopLeft = new JButton("Top Left?");
		btnTopLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TopLeft.main(null);
				URL url = ActCalcs.class.getResource("/sounds/open.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnTopLeft.setBounds(56, 75, 135, 25);
		frame.getContentPane().add(btnTopLeft);
		
		JButton btnBottomLeft = new JButton("Bottom Left?");
		btnBottomLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BottomLeft.main(null);
				URL url = ActCalcs.class.getResource("/sounds/open.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnBottomLeft.setBounds(56, 148, 135, 25);
		frame.getContentPane().add(btnBottomLeft);
		
		JButton btnTopRight = new JButton("Top Right?");
		btnTopRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TopRight.main(null);
				URL url = ActCalcs.class.getResource("/sounds/open.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnTopRight.setBounds(268, 75, 135, 25);
		frame.getContentPane().add(btnTopRight);
		
		JButton btnBottomRight = new JButton("Bottom Right?");
		btnBottomRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BottomRight.main(null);
				URL url = ActCalcs.class.getResource("/sounds/open.wav");
				AudioClip click = Applet.newAudioClip(url);
				click.play();
			}
		});
		btnBottomRight.setBounds(268, 148, 135, 25);
		frame.getContentPane().add(btnBottomRight);
	}

}
