package stringPackage;
public class StringBuilderFunctions {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Pranjali");
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
				StringBuilder name1= new StringBuilder();
				System.out.println(name1.capacity());
				StringBuilder name2= new StringBuilder(40);
				System.out.println(name2.capacity());
				StringBuilder name3= new StringBuilder("Geeta");
				System.out.println(name3.capacity());
		//doubt here	name.ensureCapacity(20);
				StringBuilder name4= new StringBuilder();
				name4.ensureCapacity(30);
				System.out.println(name4.capacity());
	}	
}


