package assignment;
public class Assignment118 {
//method overloading - compile time polymorphism
	private  void method1() {
		System.out.println("This is method 1");
	}
	static void method2(String address, int age) {
		System.out.println("This is method 2");
	}
	private  static String method3(String name) {
		System.out.println("This is method 3");
		return name;
	}
	 protected void method4(int i, int j) {
		 int d = i+j;
		System.out.println("This is method 4");
	}
	 public static void method5(boolean  b) {
		System.out.println("This is method 5");
	}
	  void method6(double d) {
		System.out.println("This is method 6");
	}
		public static void main(String[] args) {
			Assignment118  a = new Assignment118();
			a.method4(32, 40);
			a.method1();
			a.method6(10.00);
			a.method2("Nagpur", 20);
			System.out.println(a.method3("sita"));
         	a.method5(false);
			
}
}
