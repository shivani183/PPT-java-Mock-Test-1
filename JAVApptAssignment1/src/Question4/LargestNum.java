
/*Write a Java program to find the largest of three numbers using nested if-else statements.
*/
package Question4;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("***** Enter first number ****");
		int input1=scan.nextInt();
		System.out.println("***** Enter second number ****");
		int input2=scan.nextInt();
		System.out.println("***** Enter third number ****");
		int input3=scan.nextInt();
		
		int value = 0;
		
		if(input1>input2 )
			if(input1>input3)
				value=input1;
			else
				value=input3;
				
		else
			if(input2>input3)
				value=input2;
			else
				value=input3;
				
			
		System.out.println("the highest value among all three values are :: "+ value);
			
				
	}

}
