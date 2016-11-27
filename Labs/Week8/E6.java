/*CSCI 1100 – Lab 8 – Exercise 6
This program will print the odd number between 1 and the user entered number
<Mihyar Al-Masalma> <B00759975>  <22/NOV/2016> */
import java.util.Scanner; // import Scanner class
public class E6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a number and store it
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		// Call the method for the number entered by the user
		oddNumberRange(num); 
	}
	// Method to generate odd number
	public static void oddNumberRange(int num){
		String total = "";
		// iterate between 1 and the user entered number
		for (int i = 1; i<= num; i++) {
			// if the number is not even
			if (i%2 != 0) {
				// add it to the total
				total += i+" ";
			}
		}
		System.out.print(total);
	}
}