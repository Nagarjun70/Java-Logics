package com.jsp.logics;
import java.util.*;
public class FibonacciStoreInString 
{
	
		public static void test(int num,int key)
		{
			int a=0;
			int b=1;
			int c=0;
			String s1="1";
			for(int i=2; i<=num;i++)
			{
				c=a+b;
				s1=s1+c;
				a=b;
				b=c;
			}
			System.out.println(c);
			System.out.println(s1.charAt(key-1));
		}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int nums=sc.nextInt();
		System.out.println("enter the key");
		int key1=sc.nextInt();
		
		test(nums,key1);
		

	}
}


