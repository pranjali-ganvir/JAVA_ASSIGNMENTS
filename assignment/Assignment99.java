package assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Assignment99 {
public static void main(String[] args) {
	//WAP to store account number, account holder name inside Map  by passing the values at runtime for both account number, account holder
Map<	Long , String >  mp= new HashMap<Long, String >();
Scanner s = new Scanner(System.in);
System.out.println("Enter size of an array");
 int    length =  s.nextInt();
 
for(int i=0;i<length;i++) 
{ 
	       System.out.println("Enter account number");
	         Long accNo   = s.nextLong();    
		       System.out.println("Enter account holder name");
	         String accHolderName   = s.next();   
              mp.put(accNo, accHolderName);
}
System.out.println(mp);
}
}
