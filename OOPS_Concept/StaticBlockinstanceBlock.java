package OOPS_Concept;
public class StaticBlockinstanceBlock {
    
	//SIB
	static {
		System.out.println("To set database connection");
	}
	//IIB
	{
		System.out.println("To set  values of constructor");
	}
	//main method
	public static void main(String[] args) {
		System.out.println("This is main method");
		System.out.println("For instance block we will create class object to invoke it");
		new StaticBlockinstanceBlock();

	}
	//constructor
	public void StaticBlockinstanceBlock() {
		System.out.println("This is constructor");
		System.out.println("In this the SIB ,main method. IIB then constructor "
				+ "will be called .. this is order of execution of sib and iib. sib will be implicitly called whereas iib need to be called ");

	}
	
	
	
	
	
	
	
	
}
