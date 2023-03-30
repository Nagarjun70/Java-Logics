package com.jsp.logics;
import java.util.*;
public class countprime 
{
	public static void prime(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=num[i]-1;j++)
			{
				if(num[i]%j==0)
				{
					count++;
				}
			}
			if(num[i]>=2 && count==0)
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
		int[] nums=new int[size];
		System.out.println("enter elements");
		for(int k=0;k<=nums.length-1;k++)
		{
			nums[k]=sc.nextInt();
		}
		prime(nums);

	}

}
