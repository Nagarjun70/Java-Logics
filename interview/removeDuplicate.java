package com.jsp.interview;
import java.util.*;
import java.util.Arrays;

public class removeDuplicate // non duplicate elements without using sorting
{
	public static void duplicate(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int count=0;
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]!=-1&& num[i]==num[j])
				{
					count++;
					num[j]=-1;
				}
			}
			if(num[i]!=-1&&count==0)
			{
				System.out.print(num[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
		duplicate(num);

	}

}
