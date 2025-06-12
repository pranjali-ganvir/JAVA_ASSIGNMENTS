package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Set<Integer>	s= new HashSet<Integer>();
       s.add(1222);
       s.add(34);
       s.add(1222);
       s.add(34); 
       s.add(1222);
       s.add(34);
       System.out.println(s);
       
  List<Integer> lew = new ArrayList<Integer>();
  //addFirst //add(object) //add(int i, object)// add(int i, collection) //add(collection) //addLast(object)
  //lew.addFirst(1223);
  lew.add(1, 4000);
  lew.add(34);
  lew.add(344);
  lew.add(314);
  lew.add(324);
 // lew.addLast(354);
  lew.addAll(s);
  System.out.println(lew);
	}

}
