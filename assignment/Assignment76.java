package assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment76 {
	static double avg;
	static int count=0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of your array");
	int[] num = new int[sc.nextInt()];
	for(int i =0; i<num.length; i++) {
		System.out.println("Enter the value at index position:  " +i);
		          num[i]    =    sc.nextInt();
		          count = count+num[i];
	}
	System.out.println(count);
	 avg = count/num.length;
	System.out.println(avg);
}
}
