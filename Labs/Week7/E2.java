/*CSCI 1100 – Lab 7 – Exercise 2
   This program will print the output of 5 for loops
<Mihyar Al-Masalma> <B00759975>  <Nov-1-2016> */
public class E2 {
	public static void main(String[] args) {
		// Start a for loop from 3 to 30 and increase by 3
		for (int i = 3;i<=30 ;i+=3 ) {
			// add the number to the string and print when done
			System.out.print(i+" ");
		}
		// new line
		System.out.println();
		// Start a for loop from 9 to 0 and decrease by 1
		for (int j = 9;j>=0 ;j-- ) {
			// add the number to the string and print when done
			System.out.print(j+" ");
		}
		//new line
		System.out.println();
		// Start a for loop for 1 to 19 and increase by 2
		for (int k = 1;k<=19 ;k+=2) {
			// add the number to the string and print when done
			System.out.print(k+" ");
		}
		// new line
		System.out.println();
		// Start a for loop from 0 to 18 and increase by 2
		for (int l = 0;l<=18 ;l+=2 ) {
			// add the number to the string and print when done
			System.out.print(l+" ");
		}
		// new line
		System.out.println();
		// Start a for loop from 18 to 0 and decrease by 2
		for (int m = 18;m>=0 ;m-=2 ) {
			// add the number to the string and print when done
			System.out.print(m+" ");
		}
		// new line
		System.out.println();
	}
}