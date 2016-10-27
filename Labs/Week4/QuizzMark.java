/* CSCI 1100-Lab4-Exercise 1
 This program will read the quizz mark of a user and 
 evaluate if the user should go to see a learning center or not
 <Mihyar Al-Masalma> <B00759975> <10/11/2016>*/
import java.util.Scanner; // import Scanner class 
public class QuizzMark {
	public static void main(String[] args) {
		// create an instance of the scanner class with System.in as argument
		Scanner input = new Scanner(System.in);
		// Asking the user to enter a mark 
		System.out.print("Please type a mark for your quizz: ");
		// Store the value the user entered in a variable
		double mark = input.nextDouble();
		// Calculate the percentage of the mark
		double percentage = (mark*100)/15;
		// Print the percentage to the user
		System.out.println("Your score is "+percentage+" %");
		// Evaluate if the percentage less than 70%
		if (percentage < 70) {
			// if less than, advise the user to visit the learning center
			System.out.println("Please consider visiting the Learning Center.");
		}else{
			// if more than 70% print you are doing well.
			System.out.println("You are doing well.");
		}
	}
}
