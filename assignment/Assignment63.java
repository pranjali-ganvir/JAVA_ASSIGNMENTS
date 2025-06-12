package assignment;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
//WAP on Exception handling using nested try catch keywords
//if outer blocks throw exception then inner will never execute
public class Assignment63
{
	public static void main(String[] args) {
	try {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of an array");
        int[] b = new int[sc.nextInt()];
        for(int i=0; i<=b.length-1; i++)       
        {
        	             b[i]=    sc.nextInt();
         }
        System.out.println(b[5]);
        System.out.println(Arrays.toString(b));
        try {	
  		  int a = 1/0; System.out.println(a);
        }
	catch(NegativeArraySizeException  e)
	{
		System.out.println("The NegativeArraySizeException is been handled");
	}
	catch(InputMismatchException  e)
	{
		System.out.println("The InputMismatchException is been handled");
	}
	catch(ArrayIndexOutOfBoundsException  e)
	{
		System.out.println("The ArrayIndexOutOfBoundsException is been handled");
	}
	catch(NullPointerException  e)
	{
		System.out.println("The NullPointerException is been handled");
	}
	}
	catch(ArithmeticException e)
	{
		System.out.println("The ArithmeticException is been handled");
	}
}
}
		