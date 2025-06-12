package assignment;

import java.util.Arrays;
import java.util.Scanner;
public class Assignment79 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter size of an array   ");;

	String[] name = new  String[scan.nextInt()];
	String[] name2 = new  String[name.length];

	for(int i=0,j=0; i<=name.length-1;i++,j++) {
		System.out.println("Enter values of an array at index  "+i);
		name[i]=scan.next();
		 name2[j] =  name[i];
	}
	System.out.println(Arrays.toString(name));
	System.out.println(Arrays.toString(name));
}
}
