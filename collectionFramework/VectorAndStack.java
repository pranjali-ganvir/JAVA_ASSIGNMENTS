package collectionFramework;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class VectorAndStack {
public static void main(String[] args) {
	                      
Vector<String> a = new Vector<String>();
//a.firstElement();
a.addElement("Heyya");	
a.addElement("Hey33ya");	
a.addElement("Herrewyya");	
a.addElement("Hrreyya");	
a.addElement("Hettyyya");	
System.out.println(a);
System.out.println(a.firstElement());
System.out.println(a.lastElement());
a.removeElement("Heyya");
a.removeElementAt(3);
System.out.println(a);
//System.out.println(a.removeFirst());
System.out.println(a);
System.out.println(a.capacity());

  ArrayList<String> a1 = new ArrayList<String>();

  Stack<String> a12 = new Stack<String>();
  a12.addElement("Heyya");	
  a12.addElement("Hey33ya");	
  a12.addElement("Herrewyya");	
  a12.addElement("Hrreyya");	
  a12.addElement("Hettyyya");	
  System.out.println(a12);
  a12.pop();
  a12.peek();
  a12.push("Kokkk");
  System.out.println(a12);
  System.out.println(a12.capacity());
   
  //enumeration cursor in stack
        Enumeration we      = a12.elements();
        while(we.hasMoreElements()) {
        	System.out.println(we.nextElement());
        }
}
}
