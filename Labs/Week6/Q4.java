/*CSCI 1100 – Lab 6  – Excercise 4
This program will ask the user to enter two numbers
if the 1st number is greater then it will print the 
numbers decreasing till it reaches the 2nd number,
if the 1st number is smaller then print the numbers
up till reach 2nd number, if numbers equal try again
<Mihyar Al-Masalma> <B00759975>  <25 Oct 2016> */
import java.util.Scanner; // import Scanner Class
public class Q4 {
	public static void main(String[] args) {
		String total = "";
		int num1 = 0, num2 = 0;
		// Create instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// If the numbers equal start again
		while (num1 == num2){
			// Ask the user to enter two integers
			System.out.print("Please type two numbers: ");
			// Store the value into integers
			num1 = input.nextInt();
			num2 = input.nextInt();
			// Evaluate the two number
			if (num1>num2) {
				// Enter a loop
				while (num1>=num2){
					// Add the result to total
					total+= num1;
					// Add a space between numbers
					total += " ";
					// Decrease the first number by one
					num1--;
				}
			}
			// If the first number is smaller than the 2nd 
			else if (num1<num2) {
				while (num1<=num2){
					// Add the result to total
					total += num1;
					// Add a space between numbers
					total += " ";
					// Increase the first number
					num1++;	
				}
			}
			// If the numbers are equal
			else{
				// Ask the user to try again
				System.out.println("Error the numbers must be different. Try Again.");
			}	
		}
		// Print out the result
		System.out.println(total);
	}
}