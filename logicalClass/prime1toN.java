package com.jsp.logicalClass;
import java.util.Scanner;
public class prime1toN 
{
	public static void prime1ton(int num)
	{
		for(int i=2;i<num;i++)
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
			}
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		prime1toN.prime1ton(n);

	}

}
