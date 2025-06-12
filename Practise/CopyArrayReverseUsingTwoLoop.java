package Practise;

import java.util.Arrays;
import java.util.Scanner;
public class CopyArrayReverseUsingTwoLoop {
public static void main(String[] args) 
{
	System.out.println("Enter size of array");
	Scanner sc = new Scanner(System.in);
	//create array
	byte b[] = new byte[4];
	for(int i=0; i<=b.length-1; i++) 
	{
		b[i]=sc.nextByte();
	}
	System.out.println(Arrays.toString(b));
	
	byte c[] = new byte[b.length];
	for(int j=b.length-1;j>=0;j--) {
		  c[j] = b[j];
	}
	System.out.println(Arrays.toString(c));

	
	
	
	
	
	
	
	
	
	
	
}
}
