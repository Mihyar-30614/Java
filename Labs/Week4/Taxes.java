/* CSCI 1100-Lab4-Exercise 4
 This program will read the salary the user enter then evaluate it 
 and calculate the taxes and the net salary and give it back to the
 user
 <Mihyar Al-Masalma> <B00759975> <10/11/2016>*/
import java.util.Scanner; // import Scanner class 
public class Taxes {
	public static void main(String[] args) {
		// create an instance of the scanner class with System.in as argument
		Scanner input = new Scanner(System.in);
		// Ask the user to enter the salary
		System.out.print("Please enter the salary: ");
		// Store the salary in a variable 
		int salary = input.nextInt();
		// Evaluate if the salary is less than 2000
		if (salary < 20000) {
			// if yes then calculate the tax
			double tax = salary * 0.12;
			// calculate the net salary 
			double net = salary - tax;
			// print out the tax
			System.out.println("Tax payable: $"+tax);
			// print out the net income
			System.out.println("Net income: "+net);
		}else{
			// if not then calculate the tax for the first 20K
			double tax1 = 20000 * 0.15;
			// calculate the tax for the rest of the salary 
			double tax2 = (salary - 20000) * 0.2;
			// add both taxes and store it in a variable 
			double totalTax = tax1 + tax2;
			// calculate the net income 
			double netSalary = salary - totalTax;
			// print out the total tax
			System.out.println("The tax payable is $"+ totalTax);
			// print out the net income
			System.out.println("The net income is $"+ netSalary);
		}
	}
}