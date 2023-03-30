package com.jsp.strings;
import java.util.*;
public class PrintDuplicateCharacter 
{
	public static void duplicate(String str)
	{
		char[] s1=str.toCharArray();
		for(int i=0;i<=str.length()-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(s1[i]==s1[j]&& s1[i]!='0')
				{
					count++;
					s1[j]='0';
				}
			}
			if(s1[i]!='0' && count>1)
			{
				System.out.print(s1[i]+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		duplicate(str);
		

	}

}
