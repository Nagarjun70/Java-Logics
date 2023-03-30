package com.jsp.logics;
import java.util.*;
public class CharEvenSum 
{
		public static void test(char[] num)
		{
			int sum=0;
			int[]num1=new int[num.length];
			for(int i=0;i<=num1.length-1;i++)
			{
				num1[i]=num[i]-48;
				if(num1[i]%2==0)
				{
		        sum=sum+num1[i];
				}
	        }
			System.out.print("sum :=  "+sum);
			
		}
		

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of char aray");
		int size=sc.nextInt();
		char[] numb=new char[size];
		System.out.println("enter char value");
		for(char i=0;i<=numb.length-1;i++)
		{
			numb[i]=sc.next().charAt(0);
		}
		test(numb);
	}

	}

