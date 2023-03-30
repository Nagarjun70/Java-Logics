package com.jsp.logics;
import java.util.*;
public class BubbleSort 
{
	public static int[] sort(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=0;j<=num.length-2;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		for(int k=0;k<=num.length-1;k++)
		{
			System.out.println(num[k]+" ");
		}
		return num;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("enter elements");
		for(int l=0;l<=nums.length-1;l++)
		{
			nums[l]=sc.nextInt();
		}
		sort(nums);
	}

}
