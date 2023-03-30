package com.jsp.logicalClass;
import java.util.*;
public class ArrayNumber // Array asa input
{
	public static int[] test(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.print(num[i]+" ");
		}
		return num;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
		test(num);

	}

}
