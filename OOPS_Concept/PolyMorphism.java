package OOPS_Concept;
 class oneThis {
	 String name;
final int no = 10;
	 
public void classNew() {
		int a,b,c;
		a=3;b=70;c=5;
		//int d=a+b+c;
		int d = b/a;
		System.out.println(d);
	}
}
public class PolyMorphism  extends oneThis{
	public void methodsNew() {
System.out.println(super.name);	
super.classNew();
	}
	
	public static void main(String[] args) {
		PolyMorphism o = new PolyMorphism();
	   o.methodsNew();
	}
}
