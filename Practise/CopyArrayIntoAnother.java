package Practise;
import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayIntoAnother {
	
public static void main(String[] args) {
	//There are 3 ways to copy one array into another
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter size of an array");

	
	float [] f = new float[scan.nextInt()];
	float [] f1 = new float[f.length];

	//first way
	for(int i=0;i<=f.length-1;i++) {
		System.out.println("Enter value of an array at index position " +i);
		f[i]=scan.nextFloat();
	
	    	f1[i]=f[i];
	}
	
	//second way
	for(int i=0,j=0;i<=f.length-1;i++,j++) {
		System.out.println("Enter value of an array at index position " +i);
		f[i]=scan.nextFloat();
	
	    	f1[j]=f[i];
	}
	System.out.println(Arrays.toString(f));
	System.out.println(Arrays.toString(f1));
	
	//third way using two different for loop
	byte b[] = new byte[4];
	for(int i=0; i<=b.length-1; i++) 
	{
		b[i]=scan.nextByte();
	}
	System.out.println(Arrays.toString(b));
	
	byte c[] = new byte[b.length];
	for(int j=0;j<=c.length-1;j++) {
		  c[j] = b[j];
	}
	System.out.println(Arrays.toString(c));
	
	
	
}}