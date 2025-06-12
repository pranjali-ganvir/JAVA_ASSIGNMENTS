package Practise;

import java.util.Arrays;

public class NumericCount {
   static int totalDigitCount;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String array = "Geeta1234 0977 **&&tyoj";
       char[] c=     array.toCharArray();
       System.out.println(Arrays.toString(c));
        
       for (int i=0; i<=c.length-1;i++)
       {
    	  boolean digit= Character.isDigit(c[i]);
       
       if(digit==true) 
       {
    	   totalDigitCount++;
       }
       }
       System.out.println("Total count of digits: " +totalDigitCount);
	}
}

