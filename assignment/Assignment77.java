package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment77 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of your array");
		float[] num  = new float[sc.nextInt()];
		for(int i =0; i<num.length; i++) {
			System.out.println("Enter the value at index position:  " +i);
			          num[i]    =    sc.nextFloat();
}
		System.out.println(Arrays.toString(num));
}
}