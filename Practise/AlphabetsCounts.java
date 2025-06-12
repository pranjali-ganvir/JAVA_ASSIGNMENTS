package Practise;

import java.util.Arrays;

public class AlphabetsCounts {
   static int countOfAlphabet=0;
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
	     }
		System.out.println("Total count of alphabet present in a string "+countOfAlphabet);
}
}
