/* CSCI 1100-Lab4-Exercise 5
 This program will generate random number between 1 and 15
 and will ask the user to guess it 
 <Mihyar Al-Masalma> <B00759975> <10/11/2016>*/
import java.util.Scanner; // import Scanner class 
import java.util.Random; // import random class
public class Guess {
	public static void main(String[] args) {
		// Create an instance of the Random class
		Random random = new Random();
		// generate a random number from this range and assign it to a variable
		int rand = random.nextInt(15)+1;
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to try and guess the number
		System.out.print("I have a number between 1 and 15. Please enter your guess: ");
		// Store the value the user entered
		int guess = input.nextInt();
		// Evaluate the value the user entered
		if (guess != rand) {
			// if the guess doesn't equal the randome number print this
			System.out.println("Wrong - better luck next time");
		}else{
			// else print good guess
			System.out.println("Good guess.");
		}
	}
}