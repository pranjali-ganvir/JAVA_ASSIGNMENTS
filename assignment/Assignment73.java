package assignment;
public class Assignment73 {
public static void main(String[] args) {
	//create an array
	//String a[] = new String[4]; second way to create an array
	String[] a = new String[4];
	//initialize values in array
	a[0]="Hero";
	a[1]="is";
	a[2]="not";
	a[3]="actor";
		//print values of array
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);

	//second way of array creation
	int[] b = {10,20,30,50};
    for(int i=0; i<b.length; i++)	{
	System.out.println("The values of array are : " +b[i]);
}

}
}
