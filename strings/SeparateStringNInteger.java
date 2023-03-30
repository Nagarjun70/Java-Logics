package com.jsp.strings;
import java.util.*;
public class SeparateStringNInteger 
{
	public static int separate(String str)
	{
		String str1="";
		int res=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 && str.charAt(i)<=122))
			{
				str1=str1+str.charAt(i);
			}
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				res=res*10+(str.charAt(i)-48); 
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println(separate(str));
		
	}

}
