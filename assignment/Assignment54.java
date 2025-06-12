package assignment;
public class Assignment54 implements AdditionInterface {
	public void addNo() {
		// TODO Auto-generated method stub
		System.out.println("This method is overriden");
	}
	void newNo() {
		System.out.println("This method is static and overriden");
	}
	static public void childMethod() {
		int a, b;
		 a=10;  b=20;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		childMethod();
		Assignment54 bew = new Assignment54();
		bew.addNo();
		bew.myNo();
		bew.newNo();
}}
