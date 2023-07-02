
/*Write a Java program to print the Fibonacci series up to a given number using a for loop.
*/
package Question2;

import java.util.Scanner;

public class fibonacci {
	public static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("** Enter a number to see fibonacci series till that number **");
		int input=scan.nextInt();
		/*
		 * int count=2; int a=0; int b=1; System.out.print(a+" "+b); for(int
		 * i=3;i<500;i++) { int c=a+b; System.out.print(" "+c); a=b; b=c; count++;
		 * if(count==input) break; }
		 */
		for(int i=0;i<input;i++) {
			System.out.println(fib(i)+ " ");
		}
		

	}

}
