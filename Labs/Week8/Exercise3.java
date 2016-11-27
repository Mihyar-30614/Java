/*CSCI 1100 – Lab 8 – Exercise 2
This program will ask user to enter tempreture then will 
return the average temperture
<Mihyar Al-Masalma> <B00759975>  <22/NOV/2016> */
import java.util.Scanner;// import Scanner class
public class Exercise3 {
	public static void main(String[] args) {
		double total = 0;
		Scanner kb = new Scanner(System.in);
		// ask the user to enter the number of temeratures and store it
		System.out.print("Please type the number of temperatures to enter: ");
		int num = kb.nextInt();
		// iterate to save the input in array
		for (int i =0; i<num ; i++) {
			double [] temps = new double[num];
			System.out.print("Enter temperature: ");
			temps[i] = kb.nextInt();
			total += temps[i];// get the sum of the temperature
		}
		// print out the average
		System.out.println("Average temperature is: "+(total/num));
	}
}