package stringPackage;

public class StringBuferFunctions {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Pranjali");
        //append
		System.out.println(name.append(" Ganvir"));
		//insert
		name.insert(8, " is a girl");
		System.out.println(name);
		//replace
		name.replace(9, 18, "surname is");
		System.out.println(name);
        //delete
		name.delete(20, 26);
		System.out.println(name);
        //substring
		System.out.println(name.substring(8));
        //substring with start and end index
		System.out.println(name.substring(8, 15));
        //length
		System.out.println(name.length());
		//reverse
		System.out.println(name.reverse());
        //charAt
		System.out.println(name.charAt(5));
		//capacity
				StringBuffer name1= new StringBuffer();
				System.out.println(name1.capacity());
				StringBuffer name2= new StringBuffer(40);
				System.out.println(name2.capacity());
				StringBuffer name3= new StringBuffer("Geeta");
				System.out.println(name3.capacity());
		//doubt here	name.ensureCapacity(20);
				StringBuffer name4= new StringBuffer();
				name4.ensureCapacity(30);
				System.out.println(name4.capacity());
	}	
}
