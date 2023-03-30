package com.jsp.logics;
import java.util.*;
public class ArrayBinaryToDecimalFormat 
{
	public static int binary(int[] num)
	{
		int sum=0;
		int pow=0;
		for(int i=num.length-1;i>=0;i--)
		{
			sum=sum+(int)Math.pow(2, pow)*num[i];
			pow++;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] n1=new int[size];
		System.out.println("enter the elemnts");
		for(int j=0;j<=n1.length-1;j++)
		{
			n1[j]=sc.nextInt();
		}
//		int[] ar= {1,0,0,1,1};
		System.out.println(binary(n1));

	}

}
