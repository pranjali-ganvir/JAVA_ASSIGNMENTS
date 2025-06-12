package assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment81 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of an array");
	    int[] no = new int[sc.nextInt()];
	    
	    for(int i=0; i<=no.length-1; i++) {
	    	System.out.println("Enter value  of an array at index:  " +i);
	    	            no[i]=     sc.nextInt();
	    }
System.out.println(Arrays.toString(no));
Arrays.sort(no);
System.out.println(Arrays.toString(no));
	    }

}
