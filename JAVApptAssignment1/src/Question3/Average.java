
/*Write a Java program to calculate the average of a list of numbers using a do-while loop.
*/
package Question3;

import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,32,12,12,34,5,6,3);
		int sum=0;
		int i=0;
		do {
			sum=(list.get(i)+sum);
			i++;
		}while(i<list.size());
		System.out.println(sum/2);

	}

}
