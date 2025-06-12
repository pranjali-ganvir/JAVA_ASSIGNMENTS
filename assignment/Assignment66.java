package assignment;
public class Assignment66
{
	int a=10;
	static int b=0;
public   void  method1()  throws ArithmeticException{
		int c = a/b;
		throw new ArithmeticException();
}
public static void main(String[] args) {
	Assignment66 as = new Assignment66();
	as.method1();
}
}