package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MethodsOfMap {
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
     System.out.println(m2);

     for(String h     :m2.keySet()) {
    	 System.out.println("keys set " +h);
     }
     for(String j : m2.values()) {
    	 System.out.println("values set "  +j);
     }
     
     for( Entry<String, String>     b : m2.entrySet()) {
    	 System.out.println("entry set "  +b);

     }
     
     String s[] = new String[4];
     s[0]= null;
     s[1]=null;
     s[2] = "ikkj";
     s[3] ="kiilll";
     System.out.println(s[0]);
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
