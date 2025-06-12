package assignment;

public class Assignment70 {
	public static void main(String[] args) {
		//equals
		String name ="Pranjali";
		String name1="Pranjali";
		boolean equalityStatus= name.equals(name1);
		System.out.println(equalityStatus);
		
		//equalsIgnoreCase
		String name2 ="IamAnIndian";
		String name3="iamAnindian";
		boolean ignoreCase= name2.equalsIgnoreCase(name3);
		System.out.println(ignoreCase);
		
	}
}
