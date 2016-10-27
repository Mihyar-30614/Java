/*CSCI 1100 – Lab 6 – Excercise 2
   This program will take an integer then 
   gives back the the sequence of multiples untill it reaches
   num * num
<Mihyar Al-Masalma> <B00759975>  <25 Oct 2016> */
import java.util.Scanner; // import Scanner class
public class Q2 {
	public static void main(String[] args) {
		int counter = 1;
		String total = "";
		// Create an instance of the Scanner Class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a number
		System.out.print("Please type a number: ");
		// Store the value in a variabe
		int num = input.nextInt();
		// loop till reach counter = num 
		while (num >= counter) {
			// mutiply the counter by the num and add to the string
			total += (counter * num);
			// Add an empty space between each number
			total += " ";
			// Increase the counter by one
			counter++;
		}
		// Print out the final result
		System.out.println(total);
	}
}