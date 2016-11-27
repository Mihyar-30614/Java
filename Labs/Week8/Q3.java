/*CSCI 1100 – Lab 8 – Exercise 3
This program will ask user to enter temperatures of first
week of Jan 2015 and Jan 2016 and compare it
<Mihyar Al-Masalma> <B00759975>  <22/NOV/2016> */
import java.util.Scanner; // import Scanner class
public class Q3 {
	public static void main(String[] args) {
		// Create instance of Scanner Class and define arrays
		Scanner input =  new Scanner(System.in);
		double [] jan16 = new double[7];
		double [] jan15 = new double[7];
		// iterate to caputre the user input and store it
		for (int i=0; i<7; i++) {
			System.out.print("Enter temperature of Jan. "+(i+1)+" 2015: ");
			jan15[i] = input.nextDouble();
		}
		// new line
		System.out.println();
		// iterate to capture the user input and store it
		for (int i=0; i<7; i++) {
			System.out.print("Enter temperature of Jan. "+(i+1)+" 2016: ");
			jan16[i] = input.nextDouble();
		}
		// print out the results
		for (int i=0; i<7; i++) {
			System.out.println("Day "+(i+1)+" 2015: "+jan15[i]+" Day "+(i+1)+" 2016: "+jan16[i]+" Difference: "+Math.abs(jan16[i]-jan15[i]));
		}
	}
}