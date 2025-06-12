package OOPS_Concept;
 class NewClass{
	private  String  userName = "Pranjali Ganvir";
	public  String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private  int salary = 50000;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
 
public class EncapsulationClass {
public static void main(String[] args) {
	NewClass encap = new NewClass();
	encap.setUserName("Geeta");
	encap.setSalary(29000);
	System.out.println(encap.getUserName());
	System.out.println(encap.getSalary());

}
}
