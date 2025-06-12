package Practise;

import java.util.Scanner;

public class AverageOfArray {
	public static void main(String[] args) {
		/*
		 * //First way of finding array by hardcoding values byte b[] = new byte[5];
		 * b[0]=1; b[1]=2; b[2]=3; b[3]=4; b[4]=5;
		 * 
		 * int no= b[0]+b[1]+b[2]+b[3]+b[4]; System.out.println(no); int avg = no/5;
		 * System.out.println(avg); }
		 */
      //second way of using sir practise by using scanner class
	  //take two variables
	int sum=0;
	double average;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of an array :");
	int arr[] = new int[sc.nextInt()];
	for(int i=0; i<=arr.length-1;i++) {
		System.out.println("Enter value of an array at index position :" +i);
		        arr[i]=sc.nextInt();
		        sum=sum+arr[i];
		        //adding all values to sum variable
	}
	System.out.println("The sum of array is :" +sum);
	//Type casting example if we want to convert a bigger data type into smaller type
	//average = (int) (sum/arr.length);
	average = sum/arr.length;
	System.out.println("The avaerage of array is :" +average);
    }
	}


