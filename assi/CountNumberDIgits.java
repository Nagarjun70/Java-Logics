package com.jsp.assi;
import java.util.*;
public class CountNumberDIgits 
{
	public static int countnumberdigits(int n1,int n2)
	{
		int count=0;
		int temp=n2;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n1");
		int n1=sc.nextInt();
		System.out.println("enter the n2");
		int n2=sc.nextInt();
		System.out.println(countnumberdigits(n1,n2));//----->op is 2 becz of 45 asa two digitss

	}

}
