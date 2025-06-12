package assignment;
public class Assignment55 {
	static void B() {
		System.out.println("This is default method");
	}
	public void C() {
		System.out.println("This is public method");
	}
	protected String D(String b, String f) {
		System.out.println("This is protected  method");
	String q =	b+" " +f;
	System.out.println(q);
	return q;
	}
static private int  new1(int a) {
	System.out.println("This is private  method");
	System.out.println(a);
		return a;
	}
public static void main(String[] args) {
	  B();
	  new1(100);
	  Assignment55  dfer = new Assignment55();
	  dfer.C();
	  dfer.D("geeta", "kapoor");
}}