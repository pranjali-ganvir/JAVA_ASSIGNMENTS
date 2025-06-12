package assignment;

public interface AdditionInterface {
	public static  int addition = 0;
	public static final String name = "";
 void addNo();

static void newNo() {
	System.out.println("This is a static method");
}

default void myNo() {
	System.out.println("This is a default method");

}

}
