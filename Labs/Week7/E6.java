/*CSCI 1100 – Lab 7 – Exercise 6
   This program will take a word and capitalize the first,
   last and middle letter of the word.
<Mihyar Al-Masalma> <B00759975>  <Nov-1-2016> */
import java.util.Scanner; // import Scanner Class
public class E6 {
	public static void main(String[] args) {
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a word
		System.out.print("Please enter a word: ");
		// Store this word in a variable 
		String word = input.nextLine();
		// Calculate teh middle and the length of the word
		int mid = 0, length = word.length();
		// Check if the length of the word is even or odd		
		if (word.length()%2 == 0) {
			// if even get the middle
			mid = length/2;
		}else{
			// if odd get the middle 
			mid = (length/2) + 1;
		}
		// take the first letter capitalize it then add the rest of the word and reassign it to word
		word = word.substring(0,1).toUpperCase() + word.substring(1);
		// take the first half and add capitalized middle letter then add rest then assign it to word
		word = word.substring(0,mid-1) + word.substring(mid-1,mid).toUpperCase() + word.substring(mid, length);
		// take the whole word except the last letter then add capitalized last letter then assign to word
		word = word.substring(0,length-1) + word.substring(length-1,length).toUpperCase();
		// print out the result 
		System.out.print("The new word is: "+word);
	}
}