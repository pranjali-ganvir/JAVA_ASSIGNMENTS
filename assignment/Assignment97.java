package assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment97 {
public static void main(String[] args) {
	Set<Float> set = new TreeSet<Float>();
	set.add(1.23F);
	set.add(2.56F);
	set.add(3.33F);
	set.add(6.7F);
	set.add(1.4F);
	System.out.println("Before using Iterator method");
   System.out.println(set);
	
	Iterator<Float> i1 = set.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
	System.out.println("After using Iterator method");
	System.out.println(set);
	
}
}
