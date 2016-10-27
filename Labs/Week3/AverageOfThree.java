/* CSCI 1100-Lab1-Exercise 1
 This program will read the input of the user and calulate the average then print it
 <Mihyar Al-Masalma> <B00759975> <10/4/2016>*/
 import java.util.Scanner; // import Scanner class 
public class AverageOfThree{
    public static void main(String[] args) {
        // create an instance of the scanner class with System.in as argument
        Scanner input = new Scanner(System.in);
        // ask the user to enter the first number
        System.out.println("Please type a value: ");
        // assign the value to a variable called first
        double first = input.nextDouble();
        // ask the user to enter the second number
        System.out.println("Please type a value: ");
        // assign the value to the second variable
        double second = input.nextDouble();
        // ask the user to enter the third number
        System.out.println("Please type a value: ");
        // assign the number to the third variable
        double third = input.nextDouble();
        //define a variable average and assign the average to it 
        double average = (first+second+third)/3;
        //print out the result 
        System.out.println("Average = "+average);
    }
}
