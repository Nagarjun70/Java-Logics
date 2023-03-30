package com.jsp.logicalClass;

import java.util.*;

public class ArrayChar // char array as a input
{
	public static char[] test(char[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.println(num[i]+" ");
		}
		return num;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		char[] num=new char[size];
		System.out.println("enter the elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.next().charAt(0);
		}
		System.out.println(num);
	}



}

