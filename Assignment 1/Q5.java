/* This program will take a 4 numbers input seperated by space
then calculate how many pairs there is 
*/
import java.util.Scanner; // import Scanner class
public class Q5 {
	public static void main(String[] args) {
		// define a variable to store the number of pairs
		int pairs = 0;
		// Create an instance of the Scanner object
		Scanner input = new Scanner(System.in);
		// Ask the user to enter the numbers
		System.out.print("Enter four numbers all between 0 and 9: ");
		// Store the numbers in 4 different variables
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		// consume the rest of the line
		input.nextLine();
		// Ckeck if the first two numbers is a pair
		if (num1 == num2) {
			// check if the other two numbers is a pair
			if(num3 == num4){
				// if yes then we have 2 pairs 
				pairs = 2;
			}else{
				// if no then we have one pair
				pairs = 1;
			}
			// Check if the first and third number is a pair
		}else if(num1 == num3){
			// check if the other two numbers is a pair
			if (num2 == num4) {
				// if yes then we have 2 pairs
				pairs = 2;
			}else{
				// if no then we have on pair
				pairs = 1;
			}
			// Check if the first and fourth number is a pair
		}else if (num1 == num4) {
			// Check if the other two is a pair
			if (num2 == num3) {
				// if yes then we have two pairs 
				pairs = 2;
			}else{
				// if no then we have one pair
				pairs = 1;
			}
			// Check if the 2nd and 3rd numbers are pair
		}else if (num2 == num3) {
			// if yes then we have one pair
			pairs = 1;
			// Check if 2nd and 4th number is a pair
		}else if (num2 == num4) {
			// if yes then we have a pair
			pairs = 1;
		}else if (num3 == num4) {
			// if yes then we have one pair
				pairs = 1;
		}
		// Print out the result 
		System.out.println("There are "+pairs+" pair");
	}
}