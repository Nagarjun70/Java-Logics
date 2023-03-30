package com.jsp.interview;
import java.util.*;
public class missingNumber 
{
	public static int number(int[] num,int n)
	{
		int sum1=0;
		for(int i=0;i<=num.length-1;i++)
		{
			sum1=sum1+num[i];
		}
		int sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum2=sum2+i;
		}
		return sum2-sum1;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("enter elements");
		for(int i=1;i<=nums.length-1;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("enter natural number");
		int n=sc.nextInt();
		System.out.println(number(nums,n));
	}

}
