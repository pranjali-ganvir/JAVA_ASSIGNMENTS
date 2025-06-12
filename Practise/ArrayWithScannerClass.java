package Practise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithScannerClass {
	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println("Accept input from user");
		
		Scanner n = new Scanner(System.in); 
		a[0]= n.nextInt();
		a[1] = n.nextInt();
		a[2] = n.nextInt();
		a[3] = n.nextInt();
		a[4] = n.nextInt();

         n.close();					
	}
}
