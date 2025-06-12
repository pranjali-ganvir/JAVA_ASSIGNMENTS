package stringPackage;

public class StringImmutable {
    	public static void main(String[] args) {
    		//we cannot modify old string 
    		String name ="Hero";
    		name.concat("is not a hero");
    		System.out.println(name);
          //System.out.println(name.concat("is not a hero"));
    		
    		//we can modify old StringBuffer 
    		StringBuffer name1 = new StringBuffer("Hero");
    		name1.append(" is not a hero");
    		System.out.println(name1);
    		//System.out.println(name1.append(" is not a hero"));

    		StringBuffer name2 = new StringBuffer();
    		System.out.println(name2.capacity());

    		
    	
}
}
	
	

