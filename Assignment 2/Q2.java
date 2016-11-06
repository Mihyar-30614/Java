/* Assignment2 Question 2
This program will reverse a given word and see if it is Palindrome
<CSCI 1100><Mihyar Al-Masalma><B00759975>*/
import java.util.Scanner; // import Scanner class
public class Q2 {
	public static void main(String[] args) {
		String result="";
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter the word
		System.out.print("Enter a word: ");
		// Store the word in a variable
		String word = input.nextLine();
		// Convert the string to array of characters
		char[] array = word.toCharArray();
		// iterate over the array starting from the end
		for (int i = array.length-1; i>=0 ;i-- ) {
			// concat characters and assign it to result
			result += array[i];
		}
		// if the words are teh same then print this out
		if (word.equals(result)) {
			System.out.print(word + " is a Palindrome!");
		}else{
			// if not equal print this out
			System.out.print(word + " is NOT a Palindrome!");
		}
	}
}