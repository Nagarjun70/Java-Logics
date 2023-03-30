package com.jsp.logicalClass;
import java.util.Scanner;
public class SpyNumber 
{
	public static boolean spynumber(int num)
	{
		int sum=0;
		int p=1;
		while(num>0)
		{
			int rem=num%10;
			sum=p*rem;
			num=num/10;
		}
		if(sum==p)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println( SpyNumber.spynumber(n));
		 sc.close();
	}

}