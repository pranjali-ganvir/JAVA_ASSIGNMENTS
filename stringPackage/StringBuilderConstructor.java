package stringPackage;

public class StringBuilderConstructor {
	public static void main(String[] args) {

		String name ="Hero";
	    //StringBufer Constructors
		//empty StringBuilder with initial capacity 16
		StringBuilder name2 = new StringBuilder();
		System.out.println(name2.capacity());
		
		//empty StringBuilder with specified capacity 40
		StringBuilder name3 = new StringBuilder(40);
		System.out.println(name3.capacity());
		
		//empty StringBuilder with string
		//here by default initial capacity is added to current string geeta hence output is 21
		StringBuilder name4 = new StringBuilder("Geeta");
		System.out.println(name4.capacity());
         
				
	}
}


