package com.jsp.assi;
import java.util.*;
public class CombiningNumberLeftSide 
{
	public static int combiningnumberleftside(int n1,int n2)
	{
		int count=0;
		int temp=n1;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int res=(int)Math.pow(10, count);
		return n2*res+n1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1");
		int n1=sc.nextInt();
		System.out.println("enter n2");
		int n2=sc.nextInt();
		
		System.out.println(combiningnumberleftside(n1,n2));
	}

}
