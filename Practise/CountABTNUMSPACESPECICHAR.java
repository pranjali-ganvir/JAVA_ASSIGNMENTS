package Practise;

import java.util.Arrays;

public class CountABTNUMSPACESPECICHAR {
	static int countOfAlphabet=0;
	static int totalDigitCount=0;
    static int totalSpaceCount=0;

public static void main(String[] args) {
	
		String name ="Pr Ganvir 8997778jkanjali **&765666";
	   //converting string into char array type
		char[] a= name.toCharArray();
		   //converting into array
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<=name.length()-1;i++) {
			boolean result=Character.isAlphabetic(a[i]);
             
			if(result==true)
			{
				countOfAlphabet++;
			}
	      boolean digit= Character.isDigit(a[i]);
			if(digit==true)
			{
				totalDigitCount++;
			}
	       boolean space= Character.isWhitespace(a[i]);
			if(space==true)
			{
				totalSpaceCount++;
			}
	     }
		System.out.println("Total count of alphabet present in a string "+countOfAlphabet);
	    System.out.println("Total count of digits: " +totalDigitCount);
	    System.out.println("Total count of space in string: " +totalSpaceCount);
        
	    int totalSpecialCharacter= a.length-(totalSpaceCount+totalDigitCount+countOfAlphabet);
	    System.out.println("Total special character present in string: " +totalSpecialCharacter);
}

}
