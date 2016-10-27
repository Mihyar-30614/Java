/*CSCI 1100 – Lab 5 – Excercise 2
   This program will take two integers and test if it was divisible or not
<Mihyar Al-Masalma> <B00759975>  <18 Oct 2016> */
import java.util.Scanner;  // import Scanner Class
public class Q2{
	public static void main(String[] args) {
		// Create an instance of the Scanner Class
		Scanner input = new Scanner(System.in);
		// Ask the user to input two integers
		System.out.print("Please input 2 integers: ");
		// Store the first number
		int first = input.nextInt();
		// Store the second number
		int second = input.nextInt();
		// Test if the two numbers are divisable
		if (first%second == 0) {
			// if yes then print out that
			System.out.println(first+" is divisible by " +second);
		}else{
			// if not divisible then print out that
			System.out.println(first+ " is not divisible by "+second);
		}
	}
}