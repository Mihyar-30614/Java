/*CSCI 1100 – Lab 5 – Excercise 6
   This program will translate the numbers between 0 and 5
<Mihyar Al-Masalma> <B00759975>  <18 Oct 2016> */
import java.util.Scanner;  // import Scanner Class
public class Q6 {
	public static void main(String[] args) {
		// Create an instance of the Scanner Class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a number 
		System.out.print("Please type a number: ");
		// Store the user input
		int number = input.nextInt();
		// check what the user entered
		if (number == 1) {
			// evaluate if 1 print one
		 	System.out.println(number+" translated is One");
		 } else if (number == 2) {
		 	// evaluate if 2 print two 
		 	System.out.println(number+" translated is Two");
		 }else if (number == 3) {
		 	// evalutate if 3 print three
		 	System.out.println(number+" translated is Three");
		 }else if (number == 4) {
		 	// evaluate if 4 print four 
		 	System.out.println(number+" translated is Four");
		 }else if (number == 5) {
		 	// evaluate if 5 print five 
		 	System.out.println(number+" translated is Five");
		 }else{
		 	// if something else print out of range
		 	System.out.println(number+" is out of range.");
		 }
	}
}