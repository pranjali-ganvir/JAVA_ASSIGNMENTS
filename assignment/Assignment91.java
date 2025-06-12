package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment91 {
public static void main(String[] args) {
	 //while loop
	  
	Scanner sc = new Scanner(System.in);
	System.out.println("Provide size of string  ");

	int a[] = new int[sc.nextInt()];
	int i=0;
	while(i<=a.length-1) {
		System.out.println("Enter values of array at index position :" +i);
		a[i] = sc.nextInt();
		
		i++;
	}
	System.out.println(Arrays.toString(a));
	
	
	
	
	
	
	
	
}
}
