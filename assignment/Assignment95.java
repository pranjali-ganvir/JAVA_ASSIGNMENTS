package assignment;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment95 {
public static void main(String[] args) {
	List<String>		lew=		 new Vector<String>();
	lew.add("Heyu");
	lew.add("You");
	lew.add("Know");
	lew.add("That");
	lew.add("You");                            
	System.out.println(lew);
	  	ListIterator<String> l = lew.listIterator();
	  	 while(l.hasNext()) {
	    	  System.out.println(l.next());
	      }
	  	 System.out.println("By using list iterator forward direction");
	  	System.out.println(lew);

	  	while(l.hasPrevious()) {
	     	  System.out.println(l.previous());
	      }
	  	 System.out.println("By using list iterator backward direction");
	  	System.out.println(lew); 	}
}
