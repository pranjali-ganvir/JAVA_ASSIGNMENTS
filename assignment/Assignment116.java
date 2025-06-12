package assignment;
import java.util.ArrayList;

public class Assignment116 {
//WAP on Class Typecasting to achive Upcasting(in implicit and explicit way) and Downcasting
		public static void main(String[] args) {
			
			//implicit way of upcasting
			Object o = new ArrayList();
			//to acces parent class property only
			o.equals(o);

			//explicit way of upcasting
			//to acces parent class property only
			Object o1 =(Object)new ArrayList();
			o1.equals(o);
            
			//Downcasting explicit way only
			//to acces parent and child class property both
			        ArrayList  a1     = (ArrayList)  o1;                              
	          		a1.add("Tina");

		}
}
