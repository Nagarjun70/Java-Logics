package com.jsp.logicalClass;
import java.util.Scanner;
public class primeNumber // to chck prime or not
{
	public static boolean prime(int num)
	{
		int count=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(primeNumber.prime(n));
		
	}

}
