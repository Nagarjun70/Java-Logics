package com.jsp.strings;
import java.util.*;
public class RemoveDuplicateChar 
{
	public static String duplicate(String str)
	{
		String s1="";
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(s1.indexOf(ch)==-1)
			{
				s1=s1+ch;

			}
		}
		return s1;
	}
	
		

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println(duplicate(str));
		


	}

}
