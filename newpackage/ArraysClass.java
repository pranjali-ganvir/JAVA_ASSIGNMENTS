package newpackage;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	private String s = "Pranjali Ganvir 12344 ^^^^                               ";
    
	public static void main(String[] args) {
		ArraysClass n = new ArraysClass();
		n.setS("Geeta");
	System.out.println(n.getS());
	
	
	
	
	/*
	 * String d = "Ganvir 12344 ^^^^                                Pranjali";
	 * System.out.println(d.length()); boolean r = s.matches("(.*) "); if(r==true){
	 * System.out.println("print it"); }
	 * 
	 * 
	 * 
	 * //int countOfAlphabet=0; char[] a = s.toCharArray(); char[] b =
	 * s.toCharArray();
	 * 
	 * System.out.println(Arrays.toString(a));
	 * System.out.println(Arrays.toString(b)); System.out.println("before sorting");
	 * Arrays.sort(a); Arrays.sort(b);
	 * 
	 * System.out.println(Arrays.toString(a));
	 * System.out.println(Arrays.toString(b)); System.out.println("after sorting");
	 * 
	 * boolean equality = Arrays.equals(a, b); if(equality==true) {
	 * System.out.println("it is anagram"); }
	 */
	}
}
