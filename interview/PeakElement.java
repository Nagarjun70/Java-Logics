package com.jsp.interview;
import java.util.*;
public class PeakElement 
{
	public static int peak(int[] a ,int n)
	{
		if(n==1)
		{
			return 0;
		}
		if(a[0]>=a[1])
		{
			return 0;
		}
		if(a[n-1]>=a[n-2])
		{
			return n-1;
		}
		for(int i=1;i<n-1;i++)
		{
			if(a[i]>=a[i-1] && a[i]>=a[i+1])
			{
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter elemets");
		for(int k=0;k<=num.length-1;k++)
		{
			num[k]=sc.nextInt();
		}
		System.out.println(peak(num,size));
	}

}
