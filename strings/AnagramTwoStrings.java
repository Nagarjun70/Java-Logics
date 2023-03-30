package com.jsp.strings;
import java.util.*;
public class AnagramTwoStrings 
{
	public static boolean anagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		sort(ch1);
		sort(ch2);
		for(int i=0;i<ch1.length-1;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}
		return true;
	
		
	}
	public static char[] sort(char[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			for(int j=i+1;j<=n.length-1;j++)
			{
				if(n[i]>n[j])
				{
					char temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		return n;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1");
		String s1=sc.next();
		System.out.println("enter string 2");
		String s2=sc.next();
		System.out.println(anagram(s1,s2));

	}

}
