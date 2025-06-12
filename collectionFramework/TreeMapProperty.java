package collectionFramework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> h = new TreeMap<String,String>();
		h.put("hee", "is");
		h.put("very", "clever");
		h.put("and", "honest");
		h.put("as", "well");
		h.put("as", "well");

	//	h.put(null, null);
		h.put("hiiu", null);
		h.put("ttys", "well");
	     System.out.println("check indexing and dynamic" +h);
	               Set<Entry<String,String>>     jj =  h.entrySet();
	               Iterator<Entry<String,String>>    ll = jj.iterator();
	               while(ll.hasNext()) {
	            	   System.out.println(ll.next());
	               }
	}

}
