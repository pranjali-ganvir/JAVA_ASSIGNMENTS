package collectionFramework;

import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class HashTableDictonaryPropertiesProperty {
public static void main(String[] args) {
	//indexing //dynamic
	Hashtable<String,String> h = new Hashtable<String,String>();
	h.put("hee", "is");
	h.put("very", "clever");
	h.put("and", "honest");
	h.put("as", "well");
	h.put("ttys", "well");
     System.out.println("check indexing and dynamic" +h);
               Set<Entry<String,String>>     jj =  h.entrySet();
               Iterator<Entry<String,String>>    ll = jj.iterator();
               while(ll.hasNext()) {
            	   System.out.println(ll.next());
               }
     //we cannot create object of dictionary class
     //heterogenous --ok
     //null  - value ok
     //duplicate 
     //sort 
 	Hashtable h1 = new Hashtable();
     h1.put(1,1);
     h1.put("heeiooo",200);
     h1.put(3.4f, 45.6788);
     //h1.put(8,null);
		/*
		 * h1.put(45, null); h1.put(4, 5.9f); h1.put(3, null); h1.put(7, 5.9f);
		 */
    // h1.put(2, null);
     h1.put(0, 5.9f);
    
     
     System.out.println(h1);
     
     //Collections.sort(h1);
     Properties         h2= new Properties();
     h2.put("hee", "is");
 	h2.put("very", "clever");
 	h2.put("and", "honest");
 	h2.put("as", "well");
 	h2.put("ttys", "well");
 	h2.put("as", "well");
    //Collections.sort(h2);
//h2.put(8,null);

      System.out.println("check indexing and dynamic" +h2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
