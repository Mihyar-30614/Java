/*CSCI 1100 – Lab 8 – Exercise 5
This program will print the odd number between 1 and 50
<Mihyar Al-Masalma> <B00759975>  <22/NOV/2016> */
public class E5 {
	public static void main(String[] args) {
		oddNumbers();// calling method
	}
	// Method to generate odd numbers
	public static void oddNumbers(){
		// iterate for numbers
		for (int i =1; i<=50; i++) {
			// if not even print it
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
	}
}