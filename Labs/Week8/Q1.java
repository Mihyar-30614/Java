/*CSCI 1100 – Lab 8 – Exercise 1
This program will take two input numbers and return the smallest
<Mihyar Al-Masalma> <B00759975>  <22/NOV/2016> */

import javax.swing.JOptionPane; // import class
public class Q1 {
	public static void main(String[] args) {
		double num1 = 0, num2 = 0;
		// Ask user to enter two number and convert it to doubles
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number: "));
		// show dialog box with the smallest number
		JOptionPane.showMessageDialog(null,"The smallest number is "+ Math.min(num1,num2));
	}
}
