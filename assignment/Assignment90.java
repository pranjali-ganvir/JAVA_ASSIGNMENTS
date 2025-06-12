package assignment;

import java.util.Collection;
import java.util.LinkedList;
public class Assignment90 {
public static void main(String[] args) {
	Collection c2 = new LinkedList();
	c2.add(100);
	c2.add("HEY");
	c2.add(10.9000);
	c2.add('t');
      c2.remove("HEY");
	System.out.println(c2);
	    boolean b1 = c2.contains(100);
	    System.out.println(" It contains 100: "+b1);

Collection c3 = new LinkedList();
c3.add(10670);
c3.add("HEYYUUU");
c3.add(9.80);
c3.add('Y');
c3.addAll(c2);

System.out.println(c3);
c3.removeAll(c2);
System.out.println("After removing: " +c3);
}
}
