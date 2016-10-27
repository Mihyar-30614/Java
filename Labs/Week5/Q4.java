/*CSCI 1100 – Lab 5 – Excercise 4
   This program will ask the user for the price of the car and where
   he is going to ship it and calculate how much will it cost
   and if the user is a student he'll get a discount
<Mihyar Al-Masalma> <B00759975>  <18 Oct 2016> */
import java.util.Scanner;  // import Scanner Class
public class Q4{
	public static void main(String[] args) {
		double taxed=0, shipping=0, total=0;
		// Create an instance of the Scanner Class 
		Scanner input = new Scanner(System.in);
		// Ask the user to enter the price of his car
		System.out.print("Cost of Car: ");
		// Store the value in a variable 
		double car = input.nextDouble();
		// Ask the user about the Shipping distanation 
		System.out.print("Shipping destination - 1 for Nova Scotia, 2 for Ontario and 3 other Canadian Destinations: ");
		// Store the value in a variable 
		double dist = input.nextDouble();
		// consume the whole line
		input.nextLine();
		// Ask if the user is a student 
		System.out.print("Are you a student? Type true or false: ");
		// Store the value in a variable 
		String student = input.nextLine();
		// Test where the car is being shipped to
		if (dist == 1) {
			// if it was Nova Scotia the shipping cost is 2000
			shipping = car + 2000;
		}else if (dist == 2) {
			// if it was Ontario the shipping cost is 1000
			shipping = car + 1000;
		}else if (dist == 3) {
			// if it was somewhere else the shipping cost is 1500
			shipping = car + 1500;
		}
		// test if the user is student 
		if (student.equals("false") == true) {
			// if not a student add taxes
			taxed = shipping *0.125;
			total = taxed + car;
		}else if (student.equals("true") == true){
			// if a student there is no taxes
			total = shipping;
		}
		// print out the final result 
		System.out.println("Total cost: $"+ total);
	}
}