package assignment;
class NewOne{
	public void method1() {
		System.out.println("This is parent method");
	}
}

//method overriding - runtime polymorphism
public class Assignment117 extends NewOne {
public void method1() {
	super.method1();
	System.out.println("This is child method");
	}

public static void main(String[] args) {
	Assignment117 d = new Assignment117();
	d.method1();
	
}
}
