package assignment;

public class Assignment88 {
public static void main(String[] args) {
//		WAP on String Builder  using Append, insert, delete, substring, reverse, Capacity, replace

		StringBuilder n = new StringBuilder("I am an Hero");
	System.out.println(n.append(false));
	System.out.println(n.insert(0, 1.3));
	System.out.println(n.reverse());
	System.out.println(n.capacity());
	System.out.println(n.replace(6, 9, "hey how are you?"));
	System.out.println(n.delete(0, 12));
	System.out.println(n.substring(13));
/*
	//delete deletes one index prior to last indexing
		System.out.println(n.delete(5, 8));
	System.out.println(n.substring(5));
	System.out.println(n.substring(12, 24));
		
	System.out.println(n.reverse());
		System.out.println(n.capacity());
	System.out.println(n.replace(0, 12, "hey"));}
*/	
}

}
