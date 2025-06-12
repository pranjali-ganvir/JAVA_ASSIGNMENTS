package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment98 {
public static void main(String[] args) {
	List<Integer>  list = new ArrayList<Integer>();
    list.add(123);
    list.add(12563);
    list.add(123);
    list.add(1253);
    list.add(1243);
	     
	System.out.println(list);
	System.out.println("List after sorting ");
	Collections.sort(list);
	System.out.println(list);

}
}
