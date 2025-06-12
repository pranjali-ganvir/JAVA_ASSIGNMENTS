package OOPS_Concept;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
public static void main(String[] args) {
	try {
		/*
		 * int a = 1/0; System.out.println(a);
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of an array");
        int[] b = new int[sc.nextInt()];
        for(int i=0; i<=b.length; i++)       
        {
        	             b[i]=    sc.nextInt();
         }
        System.out.println(Arrays.toString(b));
	}
	catch(ArithmeticException e)
	{
		System.out.println("The ArithmeticException is been handled");
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
	/*
	 * finally { System.out.println("Finally this  is executed"); }
	 */
		
}
}