package com.jsp.logicalClass;

import java.util.Scanner;

public class StringArray // String array as a input
{
	public static String[] print1(String[] str)
	{
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.print(str[i]+" ");
		}
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String[] str=new String[size];
		System.out.println("enter the elements");
		for(int i=0;i<=str.length-1;i++)
		{
			str[i]=sc.next();
		}
		print1(str);
		
	}
}
