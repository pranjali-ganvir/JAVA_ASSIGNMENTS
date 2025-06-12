package assignment;
class F extends Assignment60{
	void d(){
System.out.println("this is class F");
}
class B extends Assignment60{
	void w(){
System.out.println("this is class B");
}
}
class C extends Assignment60{
	void sd(){
System.out.println("this is class c");
}
}
public class Assignment60D extends C {
	//within package we can access or extends public, default, abstract classes but cannot inherit final class
}
}