package newpackage;

public class KeywordClasses {
public static void main(String[] args) {
	
	/*
	 * for(int i=0; i<=10; i++) { if(i==5) { continue; } System.out.println(i);
	 * 
	 * }
	 */
	
	String name ="pranjali";
	String n = "";
	for(int i=name.length()-1; i>=0; i--) {
		      char a=    name.charAt(i);
		      n=n+a;
	
	}
	System.out.println(n);

	
}
}
