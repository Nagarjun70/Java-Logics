package com.jsp.strings;
import java.util.*;
public class StringUniqueCharacters 
{
	public static void unique(String str)
	{
		for(int i=0;i<=str.length()-1;i++)
		{
			int count=0;
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(str.charAt(i)+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		unique(str);
		

	}

}
