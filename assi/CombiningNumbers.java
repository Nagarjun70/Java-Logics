package com.jsp.assi;
import java.util.*;
public class CombiningNumbers 
{
	public static int combiningnumber(int n1,int n2)
	{
		int res=n1*100+n2;
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n1");
		int n1=sc.nextInt();
		System.out.println("enter the n2");
		int n2=sc.nextInt();
		System.out.println(combiningnumber(n1,n2));

	}

}
