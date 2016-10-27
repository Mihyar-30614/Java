/* CSCI 1100-Lab1-Exercise 5
 This program is to convert Canadian dollars to US dollars and Euros
 <Mihyar Al-Masalma> <B00759975> <9/27/2016>*/
public class moneyExchange{
	public static void main(String[] args) {
		// define three variables and intializa the candaian dollar
		double cdn = 17, us, euro;
		// calculate the amount in US dollars
		us = cdn * 0.75;
		// calculate the amount in Euros
		euro = cdn * 0.67;
		// print out the results after calculating the values
		System.out.println(cdn+" Canadian dollars = "+us+" US dollars = "+ euro+" Euros");
		// changing the value of Canadian dollars
		cdn = 170;
		// calculate the amount in US dollars
		us = cdn * 0.75;
		// calculate the amount in Euros
		euro = cdn * 0.67;
		// print out the results after calculating the values
		System.out.println(cdn+" Canadian dollars = "+us+" US dollars = "+ euro+" Euros");
		// reassign a new value to the variable 
		cdn = 320;
		// calculate the amount in US dollars
		us = cdn * 0.75;
		// calculate the amount in Euros
		euro = cdn * 0.67;
		// print out the results after calculating the values
		System.out.println(cdn+" Canadian dollars = "+us+" US dollars = "+ euro+" Euros");
	}
}