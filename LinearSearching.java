package com.Searching;

import java.util.Scanner;

public class LinearSearching {

	static int LinearSearch(int arr[], int x)
	{
		int n=arr.length;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==x)
				return i;
			
		}
		return -1;
	}
	

	
	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X:-");
		x=sc.nextInt();
		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		int result =LinearSearch(arr,x);
		if(result==-1)
			System.out.print( 
	                "Element is not present in array"); 
	        else
	            System.out.print("Element is present at index "
	                             + result); 
	}

}
