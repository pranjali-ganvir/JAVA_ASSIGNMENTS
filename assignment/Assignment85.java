package assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Assignment85 {
public static void main(String[] args) {
	
	                    String name = "PRANJALI GANVIR ";
	                    
	                    //Replace
	                    //replaceall
	                    //substring
	                    //matches    //repeat
	                  String newName=  name.replace('P', 'K');
	                  System.out.println(newName);
	                  System.out.println(name.replace("JALI", "PALI"));
	                  System.out.println(name.replaceAll("[G-P]", "2"));
	                  
	                  System.out.println(name.substring(6));
	                  System.out.println(name.substring(5, 11));
	                  
	                  //matches
	                  System.out.println(name.matches("PRANJALI GANVIR"));
	                  
	                  //REPEAT
	                  System.out.println(name.repeat( 3 ));
}
}
