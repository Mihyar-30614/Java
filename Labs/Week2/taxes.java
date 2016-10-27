/* CSCI 1100-Lab1-Exercise 6
This program is to compute the sales tax and the total amound payable in both
Canadian dollar and US dollars
<Mihyar Al-Masalma> <B00759975> <9/27/2016>*/
public class taxes {
	public static void main(String[] args) {
		// define the variables and intialize the cost with 21.50
		double cost = 21.50, tax, total, us;
		// calculate the tax
		tax = cost * 0.12;
		// calculate the total amount of money you should pay
		total = cost + tax;
		// calculate how much you should pay in us dollars
		us = total * 0.75;
		// print out the result
		System.out.println(" Cost = "+cost+"\n Tax = "+tax+"\n Amount payable = "+total+" $CA or "+us+" $US");
		// reassign a new value to cost
		cost = 50;
		// calculate the tax
		tax = cost * 0.12;
		// calculate the total amount of money you should pay
		total = cost + tax;
		// calculate how much you should pay in us dollars
		us = total * 0.75;
		// print out the result
		System.out.println(" Cost = "+cost+"\n Tax = "+tax+"\n Amount payable = "+total+" $CA or "+us+" $US");
		// reassign a new value to cost
		cost = 100;
		// calculate the tax
		tax = cost * 0.12;
		// calculate the total amount of money you should pay
		total = cost + tax;
		// calculate how much you should pay in us dollars
		us = total * 0.75;
		// print out the result
		System.out.println(" Cost = "+cost+"\n Tax = "+tax+"\n Amount payable = "+total+" $CA or "+us+" $US");
	}
}