package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment65 {
	public static void main(String[] args) 
	{
int a=20, b=0;
try {
	int c =a/b;
			System.out.println("Invalid data");
		}
		catch(ArithmeticException e1)	{
				System.out.println("Exception occured: Don't divide no by 0");
			}
		finally {
			System.out.println("This is going to execute every time");
		}
	
	}
}
