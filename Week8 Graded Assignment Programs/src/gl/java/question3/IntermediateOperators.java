package gl.java.question3;

import java.util.Arrays;
import java.util.Scanner;

public class IntermediateOperators {
	
	public static void main(String[] args) {
		//int[] array = {1, 2, 3, 4, 5};
		
		int[] array =new int[5];
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			array[i]=scanner.nextInt();
		}
		scanner.close();
		
		int sum = Arrays.stream(array)
				.filter(num -> num % 2 != 0)
				.map(num -> num * num)
				.sum();

		System.out.println("ODD NUMBERS: " + Arrays.toString(Arrays.stream(array).filter(num -> num % 2 != 0).toArray()));
		System.out.println("SQUARES: " + Arrays.toString(Arrays.stream(array).filter(num -> num % 2 != 0).map(num -> num * num).toArray()));
		System.out.println("SUM: " + sum);
	}
	
}
