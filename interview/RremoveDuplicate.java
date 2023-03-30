package com.jsp.interview;
import java.util.*;
public class RremoveDuplicate// remove duplicate elements and one copy 
{
	public static void duplicate(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]!=-1 && num[i]==num[j])
				{
					num[j]=-1;
				}
			}
			if(num[i]!=-1)
			{
				System.out.println(num[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter elements");
		for(int k=0;k<=num.length-1;k++)
		{
			num[k]=sc.nextInt();
		}
		duplicate(num);
		
	}
}