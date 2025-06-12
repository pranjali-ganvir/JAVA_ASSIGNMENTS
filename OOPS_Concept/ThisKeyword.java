package OOPS_Concept;
public class ThisKeyword {
    String name;
	double salary;
	int empno;
	
	public void methodsNew(String name, double salary, int empno) {
		System.out.println("name is :" +name);
		System.out.println("name is :" +salary);
		System.out.println("name is :" +empno);	
		
		//this keyword
		this.empno    = empno;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		ThisKeyword n = new ThisKeyword();
		n.methodsNew("geta", 80999, 78);
	     System.out.println(n.empno);
	     System.out.println(n.salary);
	     System.out.println(n.name);

		
	}
}

