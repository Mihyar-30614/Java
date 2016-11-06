/* Assignment2 Question 3
This program will give the common letters between two words
without repetition
<CSCI 1100><Mihyar Al-Masalma><B00759975>*/
import java.util.Scanner; // import Scanner class
public class Q3{
	public static void main(String[] args) {
		String result = "";
		// Create an instance of Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter two words
		System.out.print("Enter two words: ");
		// Store the words in two different variables
		String firstWord = input.next();
		String secondWord = input.nextLine();
		// Assume the first word to be longer
		int length = firstWord.length();
		// Convert it to array
		char[] array = firstWord.toCharArray();
		// Assign secondWord to other
		String other = secondWord;
		// if our Assumption is wrong 
		if (secondWord.length()>length) {
			// lenght is now the second word length
			length = secondWord.length();
			// Covert second word to array
			array = secondWord.toCharArray();
			// Assign first word to other
			other = firstWord;
		}
		// iterate starting from 0 to the longer word
		for (int i = 0; i< length; i++) {
			// if the letter is in the other word
			if (other.indexOf(array[i])>-1) {
				// if it is not repeated
				if (result.indexOf(array[i]) == -1) {
					// Add it to the result 
					result += array[i];
				}
			}
		}
		// if there is no commin letters 
		if (result.equals("")) {
			// Print out no common letters
			System.out.print("No Common Letters!");
		}else{
			// if there are common letter print it out
			System.out.print("Common Letters are :"+result);
		}
	}
}