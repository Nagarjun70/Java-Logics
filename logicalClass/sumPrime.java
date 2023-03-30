package com.jsp.logicalClass;
import java.util.Scanner;
public class sumPrime 
{
	public static void sumprime(int num)
	{
		int sum=0;
		int i=1;
		int t=num;
		while(num!=0)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+i;
				num--;
			}
			i++;
		}
		System.out.println("sum of first " + t + " prime number is "+sum);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		sumPrime.sumprime(n);

	}

}
