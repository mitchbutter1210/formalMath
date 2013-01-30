package calcStuff;

import javax.swing.JOptionPane;

public class actCalcs {

	
	public static void add(){
		double x  = Double.parseDouble(firstClass.textField.getText()); 
		double y = Double.parseDouble(firstClass.textField_1.getText());
		double fin = x + y;
		String ans = Double.toString(fin);
		firstClass.textField_2.setText(ans);
	}
	
	public static void sub(){
		double x  = Double.parseDouble(firstClass.textField.getText()); 
		double y = Double.parseDouble(firstClass.textField_1.getText());
		double fin = x - y;
		String ans = Double.toString(fin);
		firstClass.textField_2.setText(ans);
	}
	
	public static void mult(){
		double x  = Double.parseDouble(firstClass.textField.getText()); 
		double y = Double.parseDouble(firstClass.textField_1.getText());
		double fin = x * y;
		String ans = Double.toString(fin);
		firstClass.textField_2.setText(ans);
	}
	
	public static void div(){
		double x  = Double.parseDouble(firstClass.textField.getText()); 
		double y = Double.parseDouble(firstClass.textField_1.getText());
		double fin = x / y;
		String ans = Double.toString(fin);
		firstClass.textField_2.setText(ans);
		if (y == 0){
			JOptionPane.showMessageDialog(null, "CANNOT DIVIDE BY ZERO LLLLLOOOOOSSSSIIIIINNNNNGGGGG");
		}
	}
	
	public static void power(){
		double x  = Double.parseDouble(firstClass.textField.getText()); 
		double y = Double.parseDouble(firstClass.textField_1.getText());
		double fin = Math.pow(x, y);
		String ans = Double.toString(fin);
		firstClass.textField_2.setText(ans);
	}
	
	public static void sqroot(){
		double x  = Double.parseDouble(oneInput.textField.getText()); 
		double fin = Math.sqrt(x);
		String ans = Double.toString(fin);
		oneInput.textField_1.setText(ans);
	}
	
	public static void sin(){
		double x  = Double.parseDouble(oneInput.textField.getText()); 
		double fin = Math.sin(x);
		String ans = Double.toString(fin);
		oneInput.textField_1.setText(ans);
	}
	
	public static void cos(){
		double x  = Double.parseDouble(oneInput.textField.getText()); 
		double fin = Math.cos(x);
		String ans = Double.toString(fin);
		oneInput.textField_1.setText(ans);
	}
	
	public static void tan(){
		double x  = Double.parseDouble(oneInput.textField.getText()); 
		double fin = Math.tan(x);
		String ans = Double.toString(fin);
		oneInput.textField_1.setText(ans);
	}
	
	public static void quadratic(){
		double a = Double.parseDouble(quadWindow.textField.getText());
		double b = Double.parseDouble(quadWindow.textField_1.getText());
		double c = Double.parseDouble(quadWindow.textField_2.getText());
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
		quadWindow.textField_3.setText(firstAnsFin);
		quadWindow.textField_4.setText(secondAnsFin);
	}
	
	public static void distance(){
		double x1 = Double.parseDouble(distanceFormula.textField.getText());
		double x2 = Double.parseDouble(distanceFormula.textField_1.getText());
		double y1 = Double.parseDouble(distanceFormula.textField_2.getText());
		double y2 = Double.parseDouble(distanceFormula.textField_3.getText());
		double xPart1 = x2 - x1;
		double xPart2 = Math.pow(xPart1, 2);
		double yPart1 = y2 - y1;
		double yPart2 = Math.pow(yPart1, 2);
		double fin = Math.sqrt((xPart2 + yPart2));
		String ans = Double.toString(fin);
		distanceFormula.textField_4.setText(ans);
		
	}
	

}
