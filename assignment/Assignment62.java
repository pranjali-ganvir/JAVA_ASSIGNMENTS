package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment62
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Enter the size of an array");
		int[] a = new int[sc.nextInt()];
		for(int i=0;i<=a.length-1;i++) 
		{
			System.out.println("enter values of an array at index :" +i);
			a[i]= sc.nextInt();
		}
	}
	catch(InputMismatchException e1)	{
			System.out.println("Exception occured: Don't enter invalid input");
		}
	finally {
		System.out.println("This is going to execute every time");
	}
}
}
