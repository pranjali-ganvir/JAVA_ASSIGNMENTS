package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment96 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
	    set1.add(null);
	    set1.add("Hello");
	    set1.add("Mina");
	    set1.add("You");
	    set1.add("Know");
	    System.out.println(set1);
	    System.out.println(set1.size());
	    System.out.println(set1.isEmpty());
	    System.out.println(set1.contains("Hello"));
	    System.out.println(set1.remove("Know"));
	   // System.out.println(set1.clear());

	    Set<String> set = new HashSet<String>();
	    set.add("hey");
	    set.add("Shital");
	    set.add("Your");
	    set.add("class is going to start");
	    System.out.println(set);
	    set.addAll(set1);
	    System.out.println(set);

	    System.out.println(set.containsAll(set1));
	//    System.out.println(set.removeAll(set1));
	                             
	                     Iterator<String>   ij= set.iterator();
	                     while(ij.hasNext()) {
	                    	 System.out.println(ij.next());
	                     }

}
}