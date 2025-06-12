package assignment;
import java.util.ArrayList;
import java.util.List;

//list methods add, addAll, remove, removeAll, isEmpty, clear, size, contains, containsAll
public class Assignment93 {
public static void main(String[] args) {
	List<String>		lew=		 new ArrayList<String>();
	lew.add("Heyu");
	lew.add("You");
	lew.add("Know");
	lew.add("That");
	lew.add("You");                            
	System.out.println(lew);
	System.out.println(lew.contains("You"));
	System.out.println(lew.size());
	System.out.println(lew.isEmpty());
	System.out.println(lew.remove("That"));

	//add second list
	List<String>	lew2 =		 new ArrayList<String>();
	lew.add("Heyu");
	lew.add("You");
	lew.add("Know");
	lew.add("That");
	lew.add("You"); 
	lew2.addAll(lew);
	System.out.println(lew2);
	System.out.println(lew2.containsAll(lew));

      System.out.println(lew2.removeAll(lew));
         lew2.clear();
	
}
}