package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass {
	public static void main(String[] args) {
		      Map<String, String> m  = new HashMap<String, String>();
		                          m.put("shreya", "98644445");
		                          m.put("preya", "986954445");
		                          m.put("reya", "9544445");
		                          m.put("eyyya", "984445");
		                          m.put("geyya", "9869445");
       System.out.println(m);
		                          
      Map<String, String> m2  = new HashMap<String, String>();
       m2.put("sherrrreya", "98644445");
       m2.put("prerrreeeya", "986954445");
       m2.put("rerrreya", "9544445");
       m2.put("eyyya", "900775");
       m2.putAll(m);
       //key should be unique and value can be duplicate
System.out.println(m2);
System.out.println(m2.isEmpty());   
System.out.println(m2.size());
System.out.println(m2.putIfAbsent("rajukk", "988655"));
System.out.println(m2);
System.out.println(m2.remove("eyyya"));
System.out.println(m2);
System.out.println(m2.remove("rajukk", "988655"));
System.out.println(m2);
System.out.println(m2.containsKey("rajukk"));
System.out.println(m2.containsValue("988655"));
System.out.println(m2.get("sherrrreya"));
System.out.println(m2);
System.out.println(m2.replace("sherrrreya", "9866"));
System.out.println(m2);
System.out.println(m2.replace("rerrreya", "9544445", "10"));
System.out.println(m2);

//for each loop

				
 for( String s : m2.keySet()) 
 { System.out.println(s); 
 }
				 
for(String s2 : m2.values()) {
	System.out.println(s2);
}
 for(Entry<String,String> j    :  m2.entrySet()){
		System.out.println(j);
 
 }


	}
	

}
