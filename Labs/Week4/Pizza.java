/* CSCI 1100-Lab4-Exercise 3
 This program will read the number of pizza the user want to order
 then evalute it and give the user back the price
 <Mihyar Al-Masalma> <B00759975> <10/11/2016>*/
import java.util.Scanner; // import Scanner class 
public class Pizza {
	public static void main(String[] args) {
		// create an instance of the scanner class with System.in as argument
		Scanner input = new Scanner(System.in);
		// Ask the user to enter the number of pizzas 
		System.out.print("Enter the number of pizzas: ");
		// Store the value the user entered in a variable
		int num = input.nextInt();
		// Evaluate the number if it is less than three
		if (num<3) {
			// if yes then the price for each is 12.99
			double price = num * 12.99;
			// Print out the price
			System.out.println("Your total cost: $ "+price);
		}else {
			// if not then the price for each is 9.99
			double price2 = num * 9.99;
			// print out the price
			System.out.println("Your total cost: $ "+price2);
		}
	}
}