package collectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SortCollections {
                      public static void main(String[] args) {
                    	  //list follows indexing
		List<String>		lew=		 new Vector<String>();
		lew.add("Heyu");
		lew.add("You");
		lew.add("Know");
		lew.add("That");
		lew.add("You");
		//lew.add(null);
		//nullpointerexception is coming when i am adding null values and sorting here

		
		System.out.println("Before sorting list");
		System.out.println(lew);
		
		Collections.sort(lew);
		System.out.println("After sorting list");
		System.out.println(lew);

		
		//for set
		Set<String>		lew2=		 new HashSet<String>();
		lew2.add("Heyu");
		lew2.add("You");
		lew2.add("Know");
		lew2.add("That");
		lew2.add("You");
		//lew.add(null);
		
		System.out.println("Random set data");
		//set follows hashcode storing of data
		System.out.println(lew2);
	
	
		//error coming here that set of string cannot be sorted 
//Collections.sort(o);		

		
		
		
		
		
		
		
					}
	
	
	
	
	
	
	
	
	
	
	
}
