/* Assignment1 Question 2
This program will print out a pyramid of dollar signs if the number is even 
and pyramid of astriks if the number is odd
<CSCI 1100><Mihyar Al-Masalma><B00759975>*/
import java.util.Scanner; // importing Scanner class
public class Q2 {
	public static void main(String[] args) {
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);

		// Ask the user to eneter a value between 1 and 10
		System.out.print("Input a number between 1-10: ");
		// Store the inserted value in a variable 
		int num = input.nextInt();

		// Check if the number is Odd
		if (num%2!=0) {
			// if it is snowing then print pyramid of Astriks
			System.out.println("* * * *");
			System.out.println(" * * * ");
			System.out.println("  * *  ");
			System.out.println("   *   ");
		}else{
			// if it is not odd then print pyramid of dollar signs
			System.out.println("$ $ $ $");
			System.out.println(" $ $ $ ");
			System.out.println("  $ $  ");
			System.out.println("   $   ");
		}
	}
}