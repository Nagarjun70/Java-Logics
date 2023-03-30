package com.jsp.assi;
import java.util.*;
import java.util.Arrays;

public class numberToBinaryFormat 
{
	public static String number(int num)
	{
		String res="";
		while(num>0)
		{
			int rem=num%2;
			res=rem+res;
			num=num/2;
		}
		return res;
	}
	public static String[] abc(int[] n)
	{
		String[] str=new String[n.length];
		for(int i=0;i<=n.length-1;i++)
		{
			String s=number(n[i]);
			str[i]=s;
		}
		System.out.println(Arrays.toString(str));
		return str;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("enter the elements");
		for(int k=0;k<=nums.length-1;k++)
		{
			nums[k]=sc.nextInt();
		}
//		int[] num= {5,4,1,13};
		abc(nums);
	}

}
////enter the size
//5
//enter the elements
//
//1
//2
//3
//4
//5
//[1, 10, 11, 100, 101]
