package com.jsp.strings;
import java.util.*;
public class separateCapNSmall 
{
	public static void letters(String str)
	{
		String str1="";
		String str2="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				str1=str1+str.charAt(i);
			}
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				str2=str2+str.charAt(i);
			}
		}
		System.out.println("capital="+str1);
		System.out.println("small="+str2);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		letters(str);
		
	}

}
