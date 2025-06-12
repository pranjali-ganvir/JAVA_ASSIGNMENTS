package assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Assignment92 {
public static void main(String[] args) {
	
	                   Collection<Double> c     = new ArrayList<Double>();
	                     c.add(1.23);
	                     c.add(2.23);
	                     c.add(4.43);
	                     c.add(5.3);
	                     c.add(19.23);

                         System.out.println(c);
	                        
                 Iterator<Double>     i1        = c.iterator();
	                while(i1.hasNext()) {
	                	System.out.println(i1.next());
	                }
                    System.out.println(c);
	
}
}
