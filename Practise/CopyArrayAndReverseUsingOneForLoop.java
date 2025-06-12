package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayAndReverseUsingOneForLoop {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter size of an array");

	float [] f = new float[scan.nextInt()];
	float [] f1 = new float[f.length];

	for(int i=0,j=f.length-1;i<=f.length-1;i++,j--) {
		System.out.println("Enter value of an array at index position " +i);
		f[i]=scan.nextFloat();
	
	    	f1[j]=f[i];
	}
	
	System.out.println(Arrays.toString(f));
	System.out.println(Arrays.toString(f1));

}
}