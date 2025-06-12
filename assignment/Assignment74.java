package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment74 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your string");
 String name= sc.next(); 
  char[] c= name.toCharArray();
  System.out.println(Arrays.toString(c));
}
}
