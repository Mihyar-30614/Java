/* CSCI 1100-Lab1-Exercise 3
This program is to compute the average of three given numbers
 <Mihyar Al-Masalma> <B00759975> <9/27/2016>*/
public class average {
	public static void main(String[] args) {
		// define three variables and intialize it
		double x=3, y=6, z=2;
		// define a variable that will hold the result and assign the equation to it
		double average = (x+y+z)/3;
		System.out.println(" x= "+x+"\n y= "+y+"\n z= "+z+"\n average= "+average);
		// assign new values for the variables
		x=1; y=2; z=3;
		// recalculate the average for the new values
		average = (x+y+z)/3;
		// print out the new values
		System.out.println(" x= "+x+"\n y= "+y+"\n z= "+z+"\n average= "+average);
	}
}