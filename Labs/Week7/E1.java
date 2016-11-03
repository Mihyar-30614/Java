/*CSCI 1100 – Lab 7 – Exercise 1
   This program will print the output of 5 while loops
<Mihyar Al-Masalma> <B00759975>  <Nov-1-2016> */
public class E1 {
	public static void main(String[] args) {
		// Initilize a few variables to be used later
		int i =3, j=9, k=1, m=0, l=18;
		// Start while loop till it reaches 30
		while (i<=30) {
			// add the number to the string and print when done
			System.out.print(i+" ");
			// add 3 each iteration
			i+=3;
		}
		// new line
		System.out.println();
		// Start while loop till it reaches 0
		while (j>=0) {
			// add the number to the string and print when done
			System.out.print(j+" ");
			// decrease by 1 each iteration
			j--;
		}
		// new line
		System.out.println();
		// Start while loop till it reaches 19
		while (k<=19) {
			// add the number to the string and print when done
			System.out.print(k+" ");
			// add 2 for each iteration
			k+=2;
		}
		// new line
		System.out.println();
		// Start while loop till it reaches 18
		while (m<=18) {
			// add the number to the string and print when done
			System.out.print(m+" ");
			// increase by 2 each iteration
			m+=2;
		}
		// new line
		System.out.println();
		// Start while loop till it reaches 0
		while (l>=0) {
			// add the number to the string and print when done
			System.out.print(l+" ");
			// decrease by 2
			l-=2;
		}
		System.out.println();
	}
}
