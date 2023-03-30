package com.jsp.logics;
import java.util.*;
public class AddTwoStrings 
{
	public static String test(String num,String num1)
	{
		int sum=0;
		int sum1=0;
		int num2=0;
		String s3=new String();
		for(int i=0;i<=num.length()-1;i++)
		{
			sum=sum*10+(num.charAt(i)-48);
		}
		
		for(int i=0;i<=num1.length()-1;i++)
		{	
			sum1=sum1*10+(num1.charAt(i)-48);
		}
      num2=sum+sum1;
      s3=""+num2;
      return s3;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String1");
		String n1=sc.next();
		System.out.println("enter String2");
		String n2=sc.next();
		System.out.println("Sum of string Value="+test(n1,n2));

	}

}
