package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysEquals {
public static void main(String[] args) {
	int[] b = new int[4];
	int[] b1 = new int[4];

	Scanner scan = new Scanner(System.in);
	for(int i=0,j=0; i<=3;i++,j++) {
		System.out.println("Enter values of an array "+i);
		b[i]=scan.nextInt();
		System.out.println("Enter values of an array "+j);
		b1[j]=scan.nextInt();

	}
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(b1));	

boolean ans = Arrays.equals(b,b1);
if(ans==true)
{
	System.out.println("both arrays are equal");
}
else {
	System.out.println("both arrays are not equal");

}
}
}