package stringPackage;

public class StringBuferConstructor {
	public static void main(String[] args) {

		String name ="Hero";
	    //StringBufer Constructors
		//empty stringbuffer with initial capacity 16
		StringBuffer name2 = new StringBuffer();
		System.out.println(name2.capacity());
		
		//empty stringbuffer with specified capacity 40
		StringBuffer name3 = new StringBuffer(40);
		System.out.println(name3.capacity());
		
		//empty stringbuffer with string
		//here by default initial capacity is added to current string geeta hence output is 21
		StringBuffer name4 = new StringBuffer("Geeta");
		System.out.println(name4.capacity());
         
				
	}
}
