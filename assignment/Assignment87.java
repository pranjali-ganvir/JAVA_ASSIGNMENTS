package assignment;

public class Assignment87 {
public static void main(String[] args) {
//	WAP on String Buffer using Append, insert, delete, substring, reverse, Capacity, replace

	StringBuffer n = new StringBuffer("I am an Hero");
System.out.println(n.append(" and not a Loser"));	
System.out.println(n.insert(7, "  Actor ,"));

//delete deletes one index prior to last indexing
	System.out.println(n.delete(5, 8));
System.out.println(n.substring(5));
System.out.println(n.substring(12, 24));
	
System.out.println(n.reverse());
	System.out.println(n.capacity());
System.out.println(n.replace(0, 12, "hey"));}
}
