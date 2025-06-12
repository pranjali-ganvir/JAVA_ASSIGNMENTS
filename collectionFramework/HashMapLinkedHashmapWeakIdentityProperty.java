package collectionFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class HashMapLinkedHashmapWeakIdentityProperty {
	public static void main(String[] args) {
		 HashMap<String,Integer> ol= new  HashMap<String,Integer>();
		ol.put(null, null);
		ol.put("pok", 23);
		ol.put("ikk", null);
		//ol.put(null, 09);

			
		     System.out.println("check indexing and dynamic" +ol);
		  //             Set<Entry<String,String>>     jj =  ol.entrySet();
		      //         Iterator<Entry<String,String>>    ll = ol.iterator();
			/*
			 * while(ll.hasNext()) { System.out.println(ll.next()); }
			 */
		
	 LinkedHashMap<String,Integer> l= new  LinkedHashMap<String,Integer>();
		l.put(null, null);
		l.put("pok", 23);
		l.put("ikk", null);
		//l.put(null, 09);
	     System.out.println("check indexing and dynamic" +ol);
	     
	     WeakHashMap<String,Integer> ly= new  WeakHashMap<String,Integer>();
			ly.put(null, null);
			ly.put("pok", 23);
			ly.put("ikk", null);
		//	ly.put(null, 09);
		     System.out.println("check indexing and dynamic" +ly);
				/*
				 * PriorityHashMap<String,Integer> lp= new PriorityHashMap<String,Integer>();
				 * lp.put(null, null); lp.put("pok", 23); lp.put("ikk", null); // ly.put(null,
				 * 09); System.out.println("check indexing and dynamic" +ly);
				 */
	}
}
