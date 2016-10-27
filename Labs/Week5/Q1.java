/*CSCI 1100 – Lab 5 – Excersice 1
   This program will print three lines of three stars 
<Mihyar Al-Masalma> <B00759975>  <18 Oct 2016> */
import java.util.Scanner; // import Scanner Class
public class Q2{
	public static void main(String[] args) {
		// Create an instance of the Scanner Class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter the first number
		System.out.print("Please input the first double ");
		// Store the value in a variable
		double num1 = input.nextDouble();
		// Ask the user to enter the second number
		System.out.print("Please input the second double ");
		// Store the value in a variable 
		double num2 = input.nextDouble();
		// Ask the user to enter the third number
		System.out.print("Please input the third double ");
		// Store the value in a variable 
		double num3 = input.nextDouble();
		// Calculate the sum of the last two numbers
		double sum = num2 + num3;
		// Print out the result of the addition
		System.out.print("The sum of "+num2+" and "+num3+" is "+sum);
		
		if (sum>num1) {
			// If the sum is bigger than the first number
			System.out.println(" which is more than "+num1);
		}else{
			// If the sum is not bigger than the first number
			System.out.println(" which is less than "+num1);
		}
	}
}