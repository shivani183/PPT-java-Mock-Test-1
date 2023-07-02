
/*Write a Java program to check whether a given number is positive, negative, or zero 
using an if-else statement.*/
package Question1;
import java.util.*;

public class CheckProgram {

	public static void main(String[] args) {
		System.out.println("***** Enter any number ****");
		Scanner scan =new Scanner(System.in);
		int input=scan.nextInt();
		
		if(input==0)
			System.out.println(input+ " Given number is zero.");
		else if(input<0)
			System.out.println(input+ " Given number is negative in nature.");
		else
			System.out.println(input+ " Given number is positive in nature.");

	}

}
