package Practise;

public class OverloadingMainMethod {

	//main method can be static or non static , can overload also
	public  void  main(int a, int b) {
	int d = a+b;
	System.out.println(d);
		}
	public  static void main() {
		System.out.println("This is me");
	}
	
	public static void main(String[] args) {
		main();
		OverloadingMainMethod k = new OverloadingMainMethod();
		k.main(12, 30);
	}
	
}
