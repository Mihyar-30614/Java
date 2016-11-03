/*CSCI 1100 – Lab 7 – Exercise 5
   This program will take two words and regardless of the case will return if 
   these words are teh same or not
<Mihyar Al-Masalma> <B00759975>  <Nov-1-2016> */
import java.util.Scanner; // import Scanner Class
public class E5 {
	public static void main(String[] args) {
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to key-in the first word
		System.out.print("Please type a word: ");
		// Store the word in a variable 
		String first_word = input.nextLine();
		// Ask the user to key-in the 2nd word 
		System.out.print("Please type a word: ");
		// Store the 2nd word in a variable 
		String second_word = input.nextLine();
		// Check to see if both words are the same after convert both to lowercase
		if (first_word.toLowerCase().equals(second_word.toLowerCase())) {
			// If the same then print the following output
			System.out.println("The words are: "+first_word+" and "+second_word+". These words are the same.");
		}else {
			// if not the same then print the following output
			System.out.print("The words are: "+first_word+" and "+second_word+". These words are ");
			System.out.print("not the same. "+first_word+" has "+first_word.length()+" letters and ");
			System.out.print(second_word+" has "+second_word.length()+" letters.");
		}
	}
}