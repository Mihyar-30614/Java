/* This program will take three numbers as argument seperated 
by spaces then return the largest, the smallest and then 
return it arranged by the largest
*/
import java.util.Scanner; // import Scanner class
public class Q6 {
	public static void main(String[] args) {
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask eht user to enter the numbers
		System.out.print("Enter three numbers: ");
		// Store the numbers in vairables
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		// consume the rest of the line
		input.nextLine();
		// Calculate the sum of the numbers
		double sum = num1 + num2 + num3;
		// Print out the sum of the numbers
		System.out.println("The sum of "+num1+", "+num2+" and "+num3+" is "+sum);
		// Assume the first number is the largest
		double largest = num1;
		if (num2>largest) {
			// if 2nd number is bigger assign the 2nd number to the largest
			largest = num2;
		}else if(num3 > largest){
			// if the 3rd number is bigger assign it to largest
			largest = num3;
		}
		// Print out the largest number
		System.out.println("The largest number is "+ largest);
		// Assume the first number is the smallest
		double smallest = num1;
		if (num2<smallest) {
			// if 2nd number is smaller then assign it to the smallest
			smallest = num2;
		}else if (num3<smallest) {
			// if 3rd number is smaller then assign it to the smallest
			smallest = num3;
		}
		// print out the smallest number
		System.out.println("The smallest number is "+ smallest);
		// define a new variable
		double rest;
		if (num1 != largest && num1 != smallest) {
			// if the 1st number is neither largest nor smallest it is the rest
			rest = num1;
		}else if (num2 != largest && num2 != smallest) {
			// else if the 2nd number is neither largest nor smallest it is the rest
			rest = num2;
		}else{
			// else the rest is 3rd number
			rest = num3;
		}
		// print out the numbers arranged
		System.out.println("The numbers from largest to smallest are: " +largest+", "+rest+", and "+smallest);
	}
}