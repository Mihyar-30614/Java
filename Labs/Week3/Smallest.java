/* CSCI 1100-Lab1-Exercise 4
This program will take two number find the smallest then multiply it by 5
then square both numbers and print it then find the largest 
 <Mihyar Al-Masalma> <B00759975> <10/4/2016>*/
 import java.util.Scanner; // import Scanner class 
 public class Smallest{
 	public static void main(String[] args) {
 		// create an instance of the scanner class with System.in as argument
        Scanner input = new Scanner(System.in);
        //ask the user to enter the first number
        System.out.println("Type the first number: ");
        // assign the value to a variable 
        double first = input.nextDouble();
        // ask the user to enter the second number
        System.out.println("Type the second number: ");
        // assuin the value to a variable 
        double second = input.nextDouble();
        // find the smallest betweena those two 
        double smallest = Math.min(first,second);
        // calculate the biggest number 
        double biggest = Math.max(first,second);
        // print out the smallest of those two 
        System.out.println("The smallest number is: "+smallest);
        // multiply the smallest by 5
        double times5 = smallest * 5;
        // print out the result 
        System.out.println(smallest+" times 5 is "+times5);
        // squre the both numbers 
        double sqrTimes5 = Math.pow(times5,2);
        double sqrbiggest = Math.pow(biggest,2);
        // print out the new values
        System.out.println("The squre of "+ times5 + " is " + sqrTimes5);
        System.out.println("The squre of "+ biggest + " is " + sqrbiggest);
        // find the new bigger value 
        double newBig = Math.max(sqrbiggest,sqrTimes5);
        // find the new smallest value 
        double newSmall = Math.min(sqrTimes5,sqrbiggest);
        // print out the result 
        System.out.println(newBig+" is larger than "+newSmall);
 	}
 }