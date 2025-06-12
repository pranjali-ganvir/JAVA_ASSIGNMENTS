package collectionFramework;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

public class PriorityQueueProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue l= new  PriorityQueue();
		//l.add(null);
	//	l.add(null);
		
		l.add("pok");
	//	l.add(23);
		l.add("pok");
		//l.add(null);
		l.add("pok");
		l.add("ikk");
		//l.put(null, 09);
	     System.out.println("check indexing and dynamic" +l);
	     
	   ArrayDeque k= new  ArrayDeque();
		//	l.add(null);
		  k.add("ikk");
		  k.add("ikk");
		  k.add("ikk");
		//	  l.add(null); 
			  k.add("pok"); // k.add(23); k.add("pok"); //l.add(null);
			  k.add("pok"); 
			  k.add("ikk");
		//	 Colections.sort(k);
		    System.out.println("check indexing and dynamic" +k);
		     
	}

}
