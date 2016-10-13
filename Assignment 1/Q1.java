/*
This program will show a pyramid of 4 lines alternating between two 
values the user enter 
*/
import java.util.Scanner; // import Scanner class
public class Q1{
	public static void main(String[] args) {
		// Create an instance from the Scanner class
		Scanner input = new Scanner(System.in);

		// Ask user to enter a number
		System.out.print("Input a number between 0-4: ");
		// Store the value the user entered in a variable
		int first = input.nextInt();

		// Ask user to enter the second value
		System.out.print("Input a number between 5-9: ");
		// Store the value the user entered in a variable 
		int second = input.nextInt();

		// Print out the pyramid 
		System.out.println("   "+first+"   ");
		System.out.println("  "+second+" "+second+"  ");
		System.out.println(" "+first+" "+first+" "+first+" ");
		System.out.println(second+" "+second+" "+second+" "+second);
	}
}