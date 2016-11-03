/*CSCI 1100 – Lab 7 – Exercise 4
   This program will take a string and give back the length
   of the string, the string with uppercase, lowercase,
   first, middle and last character of the word
<Mihyar Al-Masalma> <B00759975>  <Nov-1-2016> */
import java.util.Scanner; // import Scanner Class
public class E4 {
	public static void main(String[] args) {
		// Create an instance of the scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a word
		System.out.print("Please type a word: ");
		// Store the word in a variable 
		String word = input.nextLine();
		// Calculate the length of the word
		int length = word.length();
		// print out the length
		System.out.println("Length of word: "+length);
		// Print out the word in uppercase
		System.out.println("Upper Case: "+word.toUpperCase());
		// Print out the word in lowercase
		System.out.println("Lower Case: "+word.toLowerCase());
		// Print out hte first Character
		System.out.println("First Character: "+word.charAt(0));
		// Calculate the middle of the word
		int mid = length/2;
		// Print out the Char at the middle
		System.out.println("Middle Character:"+word.charAt(mid));
		// print out the chart at the end
		System.out.println("Last Character: "+word.charAt(length-1));
	}
}