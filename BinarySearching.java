package com.Searching;

import java.util.Scanner;

public class BinarySearching {

	static int BinarySearch(int arr[], int start,int end, int x)
	{
		if(end>=start)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]==x)
					return mid;
			
			if(arr[mid]>x)
				return BinarySearch(arr,start,mid-1,x);
			
			if(arr[mid]<x)
				return BinarySearch(arr,mid+1,end,x);
			}
		return -1;
	}
	
	public static void main(String[] args) {
		//Array Declartation.
		int arr[]= {2,5,8,12,16,23,38,56,72,91};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X:-");
		int x=sc.nextInt();
		int Len=arr.length;
		System.out.println("Length of Array:-"+Len);
		int start=0;
		int end=Len-1;
		int result=BinarySearch(arr,start,end,x);
		if(result==-1)
			System.out.println("Element not present.");
		else
			System.out.println("Element is present  at index"+result);
	}

}
