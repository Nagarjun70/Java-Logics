package com.jsp.strings;
import java.util.*;
import java.util.Arrays;

public class AnagramSingalString 
{
	public static boolean anagram(String str)
	{
		str=str.toLowerCase();
		char[] c=str.toCharArray();
		Arrays.toString(c);
		for(int i=0;i<=c.length-1;i++)
		{
			if(i+1<=c.length-1 && c[i]==c[i+1])
			{
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println(anagram(str));

	}

}
