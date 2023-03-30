package com.jsp.logics;
import java.util.*;
public class Charcountprime 
{
	public static void prime(char[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int count=0;
			int x=num[i]-48;
			for(int j=2;j<=x-1;j++)
			{
				if(x%j==0)
				{
					count++;
				}
			}
			if(x>=2 && count==0)
			{
				System.out.print(num[i]+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		char[] nums=new char[size];
		System.out.println("enter lelemts");
		for(int k=0;k<=nums.length-1;k++)
		{
			nums[k]=sc.next().charAt(0);
		}
		prime(nums);

	}

}
