package com.jsp.logicalClass;

import java.util.Scanner;

public class NprimeNumber 
{
	public static void nprimenumber(int num)
	{
		int c=0;
		for(int i=2;i<=100;i++) 
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
				System.out.print(i+" ");
				c++;
			}
			if(c==num)
			{
				break;
			}
		}
		System.out.println();
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		NprimeNumber.nprimenumber(n);

	}

}
