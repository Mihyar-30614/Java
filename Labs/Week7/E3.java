/*CSCI 1100 – Lab 7 – Exercise 3
   This program will caculate how your grocery invoice 
   and tax you for certain things and give you back the
   total and the tax and how much you should pay
<Mihyar Al-Masalma> <B00759975>  <Nov-1-2016> */
import java.util.Scanner; // import Scanner Class
public class E3 {
	public static void main(String[] args) {
		double total =0, taxed = 0;
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Greet the costumer
		System.out.println("Welcome to your ABC Grocery Store\n");
		// Ask how many item does the client have 
		System.out.print("Enter the number of items you have: ");
		// Store the value in a variable;
		int items = input.nextInt();
		// Ask for the tax rate 
		System.out.print("Enter the tax rate: ");
		// Store the value in a variable 
		double tax = input.nextDouble();
		// Enter a new line
		System.out.println();
		// Start a for loope from 0 to the number of items
		for (int i =0; i<items ; i++) {
			// tax per item will reset with ever iteration
			double itemTax = 0;
			// ask the user to enter the price of an item
			System.out.print("Enter the price of your item: ");
			// Store the value in a variable
			double price = input.nextDouble();
			// Ask the user if the item is taxable
			System.out.print("Is the item taxable (1 for yes, 2 for no): ");
			// the choice will reset with each iteration
			int taxable = input.nextInt();
			// if it is taxable
			if (taxable == 1) {
				// Calculate the item tax
				itemTax = price*tax;
			}
			// add the price to the total
			total += price;
			// add the tax to the total tax
			taxed += itemTax;
		}
		// print out the results
		System.out.println();
		System.out.println("Total before tax: $ "+total);
		System.out.println("Total tax: $ "+taxed);
		System.out.println("Total after tax: $"+(total+taxed));
	}
}