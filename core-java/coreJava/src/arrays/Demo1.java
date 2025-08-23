package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		int[] arr1= {1,2,3,4,5};

		int arr2[]= new int[5];	
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		arr2[3]=4;
		arr2[4]=5;
		//arr2[5]=6; ArrayIndexOutOfBoundsException: 


		int marks[]= new int[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("enter marks of students");

		for (int i = 0; i < marks.length; i++)
		{
			marks[i]=scan.nextInt();

		}

		System.out.println(" marks of students are");

		for (int i = 0; i < marks.length; i++)
		{
			System.out.println(marks[i]+" ");

		}







	}

}
