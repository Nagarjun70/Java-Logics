package com.jsp.strings;
import java.util.*;
public class anagramSingleStrWithoutSorting 
{
	public static boolean anagram(String str)
	{
		str=str.toLowerCase();
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					return false;
				}
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
