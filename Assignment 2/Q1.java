/* Assignment2 Question 1
This program will give back the factors of a number
<CSCI 1100><Mihyar Al-Masalma><B00759975>*/
import java.util.Scanner; // import Scanner class
public class Q1 {
	public static void main(String[] args) {
		int counter = 1;
		String result = "";
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to key-in a number
		System.out.print("Enter a number: ");
		// Store the number in a variable
		int number = input.nextInt();
		// Check the number starting from 1 to the number
		while (number>=counter) {
			// Check if the number is dividable 
			if (number%counter == 0) {
				// Add the number to the result
				result += counter;
				// add a space between numbers
				result += " ";
			}
			// Increase the counter
			counter++;
		}
		// Print out the result 
		System.out.print("Factors: "+result);
	}
}