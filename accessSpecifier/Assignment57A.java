package accessSpecifier;

import assignment.Assignment57;
public class Assignment57A extends Assignment57{
public static void main(String[] args) {
	Assignment57A n = new Assignment57A();
	//public and protected method can be accessed of other class of other package
	n.A();
	n.ABC();
}
}
