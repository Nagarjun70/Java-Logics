package com.jsp.logicalClass;

import java.util.Scanner;

public class lastprime
{
	public static void Lastprime(int num)
	{
		int res=0;
		for(int i=2;i<=num;i++)
		{
			int count=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				res=i;
			} 
		}
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		lastprime.Lastprime(n);

	}

}
