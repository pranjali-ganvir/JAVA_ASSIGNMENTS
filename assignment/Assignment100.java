package assignment;
import java.util.HashMap;
import java.util.Map;
public class Assignment100 {
public static void main(String[] args) {
	Map<Integer,Float> map1 = new HashMap<Integer,Float>();
	map1.put(null, null);
	map1.put(10, 9.8f);
	map1.put(20, 5.8f);
	map1.put(30, 9.5f);
	map1.put(40, 6.2f);
  System.out.println(map1);

	Map<Integer,Float> map2 = new HashMap<Integer,Float>();
	map2.put(2, 5.4f);
	map2.put(4, 2.34f);
	map2.put(3, 1.78f);
  map2.putAll(map1);
  System.out.println(map2);
	map2.putIfAbsent(60, 8.4f);
	  System.out.println(map2);
System.out.println(map2.containsKey(40));
System.out.println(map2.containsValue(9.8f));
System.out.println(map2.isEmpty());
System.out.println(map2.get(10));
System.out.println(map2.remove(30, 9.5f));
System.out.println(map2.remove(40));
System.out.println(map2.replace(null, 3.4f));
System.out.println(map2.replace(null, 3.4f, 5.6f));
System.out.println(map2);	
System.out.println(map2.size());
}
}
