package assignment;

public class Assignment72 {
	public static void main(String[] args) {
		//
			String reverse="";
		String name ="MOM";
		for(int i=name.length()-1; i>=0;i--) {
			             
                          reverse =reverse+name.charAt(i);
		}
        System.out.println(reverse);
        
       if(name=="MOM") {
    	   System.out.println("It is a palindrome");
       }
       else {
    	   System.out.println("It is not a palindrome");
       }
}
	}
