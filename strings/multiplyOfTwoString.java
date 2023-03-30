package com.jsp.strings;
import java.util.*;
public class multiplyOfTwoString // Only for postive integer
{
	public static String multiply(String s1,String s2)
	{
		int res1=0;
		int res2=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			res1=res1*10+(s1.charAt(i)-48);
			
		}
		for(int j=0;j<=s2.length()-1;j++)
		{
			res2=res2*10+(s2.charAt(j)-48);
			
		}
		return res1*res2+"";

	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1");
		String s1=sc.next();
		System.out.println("enter string2");
		String s2=sc.next();
		System.out.println(multiply(s1,s2));
		

	}

}
