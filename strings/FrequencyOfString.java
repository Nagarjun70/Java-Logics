package com.jsp.strings;
import java.util.*;
public class FrequencyOfString 
{
	public static void frequency(String str, char ch)
	{
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.print(count+" ");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println("enter char");
		char ch=sc.next().charAt(0);
		frequency(str,ch);

	}

}
