package com.jsp.strings;
import java.util.*;
public class StringToInteger 
{
	public static int convert(String str)
	{
		int res=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			res=(res*10)+str.charAt(i)-48;
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println(convert(str));
		

	}

}
