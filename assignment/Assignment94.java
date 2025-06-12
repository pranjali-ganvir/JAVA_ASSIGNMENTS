package assignment;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Assignment94 {
public static void main(String[] args) {
	
	List  a = new LinkedList();
	a.add(123);
	a.add("hello riya");
	a.add(1.23);
	a.add(true);
	a.add('K');
	a.add(1);
System.out.println(a);
	//iterator
	Iterator a2 = a.iterator();
	while(a2.hasNext()) {
		System.out.println(a2.next());
	}
	System.out.println("After iteration result is :");
	System.out.println(a);
}
}
