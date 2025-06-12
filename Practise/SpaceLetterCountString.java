package Practise;

import java.util.Arrays;

public class SpaceLetterCountString {
	  static int totalSpaceCount=0;
	   
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       String array = " Geeta1234 0977 **&&tyoj ";
	       char[] c=     array.toCharArray();
	       System.out.println(Arrays.toString(c));
	        
	       for (int i=0; i<=c.length-1;i++)
	       {
	    	  boolean space= Character.isWhitespace(c[i]);
	       
	       if(space==true) 
	       {
	    	   totalSpaceCount++;
	       }
	       }
	       System.out.println("Total count of space in string: " +totalSpaceCount);
		}
	}

