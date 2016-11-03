/*CSCI 1100 – Lab 7 – Exercise 7
   This program will take a word reverse it
<Mihyar Al-Masalma> <B00759975>  <Nov-1-2016> */
import java.util.Scanner; // import Scanner Class
public class E7 {
	public static void main(String[] args) {
		String result=" ";
		// Create an instance of Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a word
		System.out.print("Please type a word: ");
		// Store the word in a variable 
		String word = input.nextLine();
		// Convert the string to array of characters
		char[] array = word.toCharArray();
		// iterate over the array starting from the end
		for (int i = array.length-1; i>=0 ;i-- ) {
			// concat characters and assign it to result
			result += array[i];
		}
		// print out the final result 
		System.out.print(word+" backward is "+result);
	}
}