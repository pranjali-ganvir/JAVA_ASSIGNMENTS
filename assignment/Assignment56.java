package assignment;
public class Assignment56 {
	public void ChildMeth() {
		System.out.println("This is child method");
	}
	public static void main(String[] args) {	
		Assignment56 cew = new Assignment56();
		cew.ChildMeth();
		Assignment55 cew2 = new Assignment55();
		cew2.C();
		cew2.D("Geetya", "Sharma");
		cew2.B();

		//we can access specifier such as public, protected, default. 
		//we cannot access private method in same package
	}
}
