package assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment83 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1= sc.next();
		String name2= sc.next();
      System.out.println("Enter string one :" +name1);
      System.out.println("Enter string two :" +name2);
     if(name1.length() != name2.length()) {
    	 System.out.println("not a anagaram ");
     }
     else {
     char[] new1=  name1.toCharArray();
     char[] new2=  name2.toCharArray();
     //before sorting array
	 System.out.println(Arrays.toString(new1));
	 System.out.println(Arrays.toString(new2));
      
     //convert Array in sorting order
      Arrays.sort(new1);
      Arrays.sort(new2);
	//convert into array
      System.out.println(Arrays.toString(new1));
 	 System.out.println(Arrays.toString(new2));
     boolean result2 = Arrays.equals(new1, new2);
     if(result2==true) {
	 System.out.println("Given String are anagaram ");
     }
     else {
    	 System.out.println("Given String are not anagaram ");
     }		
	}
}
}
