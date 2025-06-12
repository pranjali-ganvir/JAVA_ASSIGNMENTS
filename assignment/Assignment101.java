package assignment;

import java.util.Enumeration;
import java.util.Stack;
public class Assignment101 {
	public static void main(String[] args) {
		  Stack<String> a12 = new Stack<String>();
		  a12.addElement("Heyya");	
		  a12.addElement("Hey33ya");	
		  a12.addElement("Herrewyya");	
		  a12.addElement("Hrreyya");	
		  a12.addElement("Hettyyya");	
		  System.out.println(a12);
		  a12.pop();
		  a12.peek();
		  a12.push("Kokkk");
		  System.out.println(a12);
		  System.out.println(a12.capacity());
		   
		  //enumeration cursor in stack
		        Enumeration we      = a12.elements();
		        while(we.hasMoreElements()) {
		        	System.out.println(we.nextElement());
		        }
		}
	

}
