package com.jsp.assi;
import java.util.*;
public class CombiningNumberRightSide 
{
	public static int combiningnumberrightside(int n1,int n2)
	{
		int count=0;
		int temp=n2;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int res=(int)Math.pow(10, count);
		return n1*res+n2;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1");
		int n1=sc.nextInt();
		System.out.println("enter n2");
		int n2=sc.nextInt();
		
	System.out.println(combiningnumberrightside(n1,n2));
	}

}
