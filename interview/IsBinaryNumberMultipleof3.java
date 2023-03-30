package com.jsp.interview;

import java.util.Scanner;

public class IsBinaryNumberMultipleof3 
{
	public static int number(String num)
	{
		int sum=0;
		int pow=0;
		for(int i=num.length()-1;i>=0;i--)
		{
			int a=num.charAt(i);
			a=a-48;
			sum=sum+a*(int)Math.pow(2, pow);
					pow++;
				
		}
		if(sum%3==0)
		{
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		String n=sc.next();
		System.out.println(number(n));

	}

}
