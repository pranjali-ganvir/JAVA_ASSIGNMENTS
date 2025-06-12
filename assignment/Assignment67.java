package assignment;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment67 {
//WAP on Exception Handling using TryCatch When we may get 2 exceptions in a single scenario
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter size of an array");
	        int[] b = new int[sc.nextInt()];
	        for(int i=0; i<=b.length; i++)       
	        {
	        	             b[i]=    sc.nextInt();
	         }
	        System.out.println(Arrays.toString(b));
	        }	
		catch(NegativeArraySizeException  e)
		{
			System.out.println("The NegativeArraySizeException is been handled");
		}
		catch(InputMismatchException  e)
		{
			System.out.println("The InputMismatchException is been handled");
		}
	System.out.println("Exception is been handled");		
	}
	}
	
	
	

