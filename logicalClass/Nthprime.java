package com.jsp.logicalClass;
import java.util.Scanner;
public class Nthprime 
{
	public static void nthprime(int num)
	{
		int c=0;
		int res=0;
		for(int i=2;i<=1000;i++)
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
				c++;
			}
			if(c==num)
			{
				break;
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		Nthprime.nthprime(n);

	}

}
