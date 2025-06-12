package assignment;
public class Assignment61 {
//WAP on SIB AND IIB
	static {
		System.out.println("This is a static block");
	}
	{
		System.out.println("This is a instance block");

	}
	public static void main(String[] args) {
		System.out.println("This is a main method");
       new Assignment61();
	}
	public Assignment61() {
		System.out.println("This is a constructor");

	}

}
