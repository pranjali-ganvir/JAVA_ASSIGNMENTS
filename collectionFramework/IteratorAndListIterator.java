package collectionFramework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorAndListIterator {
public static void main(String[] args) {
	List<String>		lew=		 new Vector<String>();
	lew.add("Heyu");
	lew.add("You");
	lew.add("Know");
	lew.add("That");
	lew.add("You");
	                            
	System.out.println(lew);
	   Iterator<String>   lew3  =  lew.iterator();
	      while(lew3.hasNext()) {
	    	  System.out.println(lew3.next());
	      }
	  	System.out.println(lew);

	  	ListIterator<String> l = lew.listIterator();
	  	 while(l.hasNext()) {
	    	  System.out.println(l.next());
	      }
	  	 System.out.println("by using list iterator forward direction");
	  	System.out.println(lew);

	  	while(l.hasPrevious()) {
	     	  System.out.println(l.previous());
	      }
	  	 System.out.println("by using list iterator backward direction");
	  	System.out.println(lew);	  	

Collection<Object> c = new ArrayList<Object>();
c.add("Hryyy");
c.add("ryyy");
c.add("pyy");
c.add("oiik");
c.add("yuu");
System.out.println(c);



    Object a             =  (Object) new IteratorAndListIterator();

}
}


