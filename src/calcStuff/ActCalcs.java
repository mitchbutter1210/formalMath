package calcStuff;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

public class ActCalcs {

	
	public static void add(){
		double x  = Double.parseDouble(FirstClass.textField.getText()); 
		double y = Double.parseDouble(FirstClass.textField_1.getText());
		double fin = x + y;
		String ans = Double.toString(fin);
		FirstClass.textField_2.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void sub(){
		double x  = Double.parseDouble(FirstClass.textField.getText()); 
		double y = Double.parseDouble(FirstClass.textField_1.getText());
		double fin = x - y;
		String ans = Double.toString(fin);
		FirstClass.textField_2.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void mult(){
		double x  = Double.parseDouble(FirstClass.textField.getText()); 
		double y = Double.parseDouble(FirstClass.textField_1.getText());
		double fin = x * y;
		String ans = Double.toString(fin);
		FirstClass.textField_2.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void div(){
		double x  = Double.parseDouble(FirstClass.textField.getText()); 
		double y = Double.parseDouble(FirstClass.textField_1.getText());
		double fin = x / y;
		String ans = Double.toString(fin);
		FirstClass.textField_2.setText(ans);
		if (y == 0){
			URL url = ActCalcs.class.getResource("/sounds/click.wav");
			AudioClip click = Applet.newAudioClip(url);
			click.play();
			JOptionPane.showMessageDialog(null, "CANNOT DIVIDE BY ZERO LLLLLOOOOOSSSSIIIIINNNNNGGGGG");
		}
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void power(){
		double x  = Double.parseDouble(FirstClass.textField.getText()); 
		double y = Double.parseDouble(FirstClass.textField_1.getText());
		double fin = Math.pow(x, y);
		String ans = Double.toString(fin);
		FirstClass.textField_2.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void sqroot(){
		double x  = Double.parseDouble(otherWindows.OneInput.textField.getText()); 
		double fin = Math.sqrt(x);
		String ans = Double.toString(fin);
		otherWindows.OneInput.textField_1.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void sin(){
		double x  = Double.parseDouble(otherWindows.OneInput.textField.getText()); 
		double fin = Math.sin(x);
		String ans = Double.toString(fin);
		otherWindows.OneInput.textField_1.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void cos(){
		double x  = Double.parseDouble(otherWindows.OneInput.textField.getText()); 
		double fin = Math.cos(x);
		String ans = Double.toString(fin);
		otherWindows.OneInput.textField_1.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void tan(){
		double x  = Double.parseDouble(otherWindows.OneInput.textField.getText()); 
		double fin = Math.tan(x);
		String ans = Double.toString(fin);
		otherWindows.OneInput.textField_1.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void quadratic(){
		double a = Double.parseDouble(otherWindows.QuadWindow.textField.getText());
		double b = Double.parseDouble(otherWindows.QuadWindow.textField_1.getText());
		double c = Double.parseDouble(otherWindows.QuadWindow.textField_2.getText());
		double firstB = -b;
		//the parts in the square root
		double secondB = Math.pow(b,2);
		double partAfterSecB = (4 * a * c);
		double sqRootPart = secondB - partAfterSecB;
		double finSquareRoot = Math.sqrt(sqRootPart);
		//^^^^^^^^^^^^^^^^^^
		double firstAns = (firstB + finSquareRoot) / (2*a);
		double secondAns = (firstB - finSquareRoot) / (2*a);
		String firstAnsFin = Double.toString(firstAns);
		String secondAnsFin = Double.toString(secondAns);
		otherWindows.QuadWindow.textField_3.setText(firstAnsFin);
		otherWindows.QuadWindow.textField_4.setText(secondAnsFin);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void distance(){
		double x1 = Double.parseDouble(otherWindows.DistanceFormula.textField.getText());
		double x2 = Double.parseDouble(otherWindows.DistanceFormula.textField_2.getText());
		double y1 = Double.parseDouble(otherWindows.DistanceFormula.textField_1.getText());
		double y2 = Double.parseDouble(otherWindows.DistanceFormula.textField_3.getText());
		double xPart1 = x2 - x1;
		double xPart2 = Math.pow(xPart1, 2);
		double yPart1 = y2 - y1;
		double yPart2 = Math.pow(yPart1, 2);
		double fin = Math.sqrt((xPart2 + yPart2));
		String ans = Double.toString(fin);
		otherWindows.DistanceFormula.textField_4.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();	
	}
	
	public static void pyFindA(){
		double b = Double.parseDouble(otherWindows.PyTheorum.textField_1.getText());
		double c = Double.parseDouble(otherWindows.PyTheorum.textField_2.getText());
		double douB = Math.pow(b, 2);
		double douC = Math.pow(c, 2);
		double almostFin = douC - douB;
		double fin = Math.sqrt(almostFin);
		String ans = Double.toString(fin);
		otherWindows.PyTheorum.textField.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void pyFindB(){
		double a = Double.parseDouble(otherWindows.PyTheorum.textField.getText());
		double c = Double.parseDouble(otherWindows.PyTheorum.textField_2.getText());
		double douA = Math.pow(a, 2);
		double douC = Math.pow(c, 2);
		double almostFin = douC - douA;
		double fin = Math.sqrt(almostFin);
		String ans = Double.toString(fin);
		otherWindows.PyTheorum.textField_1.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void pyFindC(){
		double a = Double.parseDouble(otherWindows.PyTheorum.textField.getText());
		double b = Double.parseDouble(otherWindows.PyTheorum.textField_1.getText());
		double douA = Math.pow(a,2);
		double douB = Math.pow(b,2);
		double almostFin = douA + douB;
		double fin = Math.sqrt(almostFin);
		String ans = Double.toString(fin);
		otherWindows.PyTheorum.textField_2.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void slope(){
		double x1 = Double.parseDouble(otherWindows.Slope.textField.getText()); 
		double x2 = Double.parseDouble(otherWindows.Slope.textField_1.getText());
		double y1 = Double.parseDouble(otherWindows.Slope.textField_2.getText());
		double y2 = Double.parseDouble(otherWindows.Slope.textField_3.getText());
		double yFin = y2 - y1;
		double xFin = x2 - x1;
		double fin = yFin / xFin; 
		String ans = Double.toString(fin);
		otherWindows.Slope.textField_4.setText(ans);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}

	public static void proportions(){
		double topLeft = Double.parseDouble(proportionStuff.Proportions.textField.getText());
		double bottomLeft = Double.parseDouble(proportionStuff.Proportions.textField_1.getText());
		double topRight = Double.parseDouble(proportionStuff.Proportions.textField_2.getText());
		double bottomRight = Double.parseDouble(proportionStuff.Proportions.textField_3.getText());
		double a = topLeft * bottomRight;
		double b = bottomLeft * topRight;
		if (a==b){
			proportionStuff.Proportions.textField_4.setText("Equal");
		}
		else if (a!=b){
			proportionStuff.Proportions.textField_4.setText("Not equal");
		}
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}

	public static void topLeft(){
		double bottomLeft = Double.parseDouble(proportionStuff.TopLeft.textField_1.getText());
		double topRight = Double.parseDouble(proportionStuff.TopLeft.textField_2.getText());
		double bottomRight = Double.parseDouble(proportionStuff.TopLeft.textField_3.getText());
		double a = bottomLeft * topRight;
		double b = a / bottomRight;
		String fin = Double.toString(b);
		proportionStuff.TopLeft.textField_4.setText(fin);
	}

	public static void bottomLeft(){
		double topLeft = Double.parseDouble(proportionStuff.BottomLeft.textField.getText());
		double topRight = Double.parseDouble(proportionStuff.BottomLeft.textField_1.getText());
		double bottomRight = Double.parseDouble(proportionStuff.BottomLeft.textField_3.getText());
		double a = topLeft * bottomRight;
		double b = a / topRight;
		String fin = Double.toString(b);
		proportionStuff.BottomLeft.textField_4.setText(fin);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void topRight(){
		double topLeft = Double.parseDouble(proportionStuff.TopRight.textField.getText());
		double bottomLeft = Double.parseDouble(proportionStuff.TopRight.textField_2.getText());
		double bottomRight = Double.parseDouble(proportionStuff.TopRight.textField_3.getText());
		double a = topLeft * bottomRight;
		double b = a / bottomLeft;
		String fin = Double.toString(b);
		proportionStuff.TopRight.textField_4.setText(fin);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
	
	public static void bottomRight(){
		double topLeft = Double.parseDouble(proportionStuff.BottomRight.textField.getText());
		double bottomLeft = Double.parseDouble(proportionStuff.BottomRight.textField_2.getText());
		double topRight = Double.parseDouble(proportionStuff.BottomRight.textField_1.getText());
		double a = bottomLeft * topRight;
		double b = a / topLeft;
		String fin = Double.toString(b);
		proportionStuff.BottomRight.textField_4.setText(fin);
		URL url = ActCalcs.class.getResource("/sounds/click.wav");
		AudioClip click = Applet.newAudioClip(url);
		click.play();
	}
}

