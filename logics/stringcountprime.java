package com.jsp.logics;
import java.util.*;
public class stringcountprime 
{
	public static void prime(String[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int sum=0;
			String s1=num[i];
			for(int j=0;j<=s1.length()-1;j++)
			{
				int a=s1.charAt(j);
				a=a-48;
				sum=sum*10+a;
			}
			prime1(sum);
		}
		
	}
	public static int prime1(int sum)
	{
		int count=0;
		for(int i=2;i<=sum-1;i++)
		{
			if(sum%i==0)
			{
				count++;
			}
		}
		if(count==0 && sum!=0)
		{
			System.out.println(sum);
			return sum;
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		String[] nums=new String[size];
		System.out.println("enter elemnts");
		for(int k=0;k<=nums.length-1;k++)
		{
			nums[k]=sc.next();
		}
//		String[] num= {"11","12","13","14","15","17"};
		prime(nums);

	}

}
