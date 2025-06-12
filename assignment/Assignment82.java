package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment82 {
	public static void main(String[] args) {
	try {
		    int[] no = {10,200,500,800,500};
		    	System.out.println(no[6]);
		    }
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught : "  +e);
		}
	finally {
		System.out.println("I will always execute weather an Exception occur or not");
	}
		}
}
