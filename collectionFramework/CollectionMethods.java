package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionMethods {
public static void main(String[] args) throws InterruptedException {
	       Collection<Character> c  =        new ArrayList<Character>();
	       c.add('P');
	       c.add('E');
	       c.add('J');
	       c.add('K');
	     //  c.clear();
	         System.out.println(c);
	
	         //object class method
	         Object a = new CollectionMethods();
	         System.out.println(  a.equals(a));
	         System.out.println(a.hashCode());
	         System.out.println(a.toString());
	         System.out.println(a.getClass());
      
	         List<Character> c1 = new LinkedList<Character>();
		          c1.add('O');
		          c1.add('a');
		          c1.add('l');
		          c1.add('k');
		          c1.addAll(c);
		      	System.out.println(c1);

	            System.out.println(c.isEmpty());
	          System.out.println(c.size());
	         
	 System.out.println(c.contains(c1));
	System.out.println(c1.containsAll(c));
	
	System.out.println(c.remove('J'));
    System.out.println(c);

	System.out.println(c1.removeAll(c));
  	System.out.println(c1);

	
	
	
	
	
}
}
