package assignment;
public class Assignment89 {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.capacity());
	
	StringBuffer sb1 = new StringBuffer(20);
	System.out.println(sb1.capacity());
	
	StringBuffer sb11 = new StringBuffer("PRANJALI  GEETA SEETA");
	System.out.println(sb11.capacity());
	
	//StringBuilder constructors
	StringBuilder  sf = new StringBuilder();
	System.out.println(sf.capacity());
	
	StringBuilder  sf1 = new StringBuilder(15);
	System.out.println(sf1.capacity());
	
	StringBuilder  sf11 = new StringBuilder("GANVIR GEETA SEETA");
	System.out.println(sf11.capacity());
}
}
