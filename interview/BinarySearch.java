package com.jsp.interview;
import java.util.*;
public class BinarySearch 
{
	public static int binary(int[] arr, int k)
	{
		int f=0;
		int l=arr.length-1;
		
		while(f<=l)
		{
			int m=f+(l-f)/2; // for finding the middel element
			
			if(arr[m]==k)
			{
				return m;
			}
			if(arr[m]<=k)
			{
				f=m+1;
			}else {
				return l=m-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("enter k");
		int k=sc.nextInt();
		System.out.println(binary(num,k));
	}

}
