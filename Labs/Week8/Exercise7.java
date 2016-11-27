/*CSCI 1100 – Lab 8 – Exercise 7
This program will calculate the area of a rectange using another method
<Mihyar Al-Masalma> <B00759975>  <22/NOV/2016> */
import java.util.Scanner; // import Scanner class
public class Exercise7 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// Ask user to enter length and save it
		System.out.print("Please type the length: ");
		double length = keyboard.nextDouble();
		// Ask user to enter width and save it
		System.out.print("Please type the width: ");
		double width = keyboard.nextDouble();
		// call method with values entered by user
		printRecatngleArea(length, width);
	}
	// method to calculate the area of rectangle
	public static void printRecatngleArea(double length, double width){
		System.out.print("Area: "+(length*width));
	}
}