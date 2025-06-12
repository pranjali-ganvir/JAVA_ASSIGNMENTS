package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysEqualsSirWay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array ");

		int[] b = new int[scan.nextInt()];
		int[] b1 = new int[b.length];

		for(int i=0; i<=b.length-1;i++) {
			System.out.println("Enter values of an array "+i);
			b[i]=scan.nextInt();
			System.out.println("Enter values of an array "+i);
			b1[i]=scan.nextInt();

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

