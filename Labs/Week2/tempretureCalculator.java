/* CSCI 1100-Lab1-Exercise 4
 This program will convert tempreture from Fahrenheit to Celsius
 <Mihyar Al-Masalma> <B00759975> <9/27/2016>*/
public class tempretureCalculator {
	public static void main(String[] args) {
		// define two double variables and intialize Fahrenheit
		double Fahrenheit=56, Celsius;
		// compute and assign the result to Celsius 
		Celsius = (Fahrenheit-32)/1.8;
		// print out the result
		System.out.println(Fahrenheit+" F = "+Celsius+" C.");
		// reassign new value to Fahrenheit 
		Fahrenheit = 22;
		// recalculate the value of Celsius
		Celsius = (Fahrenheit-32)/1.8;
		// print out the new result 
		System.out.println(Fahrenheit+" F = "+Celsius+" C.");
		// reassign a new value to Fahrenheit
		Fahrenheit = 87;
		// recalculate the value of Celsius
		Celsius = (Fahrenheit-32)/1.8;
		// print out the new result
		System.out.println(Fahrenheit+" F = "+Celsius+" C.");
	}
}