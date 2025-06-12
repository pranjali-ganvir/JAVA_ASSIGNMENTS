package Practise;

public class MatchesPresentOfCharactersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//given string consists of exact 4 characters
	    String name = "Pranjali";
	    String name1 = "Pran";
	   boolean value=  name1.matches("....");
	   System.out.println(value);
	   
//check if string ends with i
	   boolean value1=  name.matches("(.*)i");
	   System.out.println(value1);
	  
//check if string starts with p
	   boolean value2=  name.matches("P(.*)");
	   System.out.println(value2);
	   
//string has some words in  it for ex-jal
	   //boolean value3=  name.matches("....jal(.*)");
	   boolean value3=  name.matches("(.*)jal(.*)");
	   System.out.println(value3);
	   
	   
	}

}
