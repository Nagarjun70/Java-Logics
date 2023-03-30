package com.jsp.assi;
import java.util.*;
public class RightRotateForNnumber
{
	public static int[] rotatefornnumber(int[] num,int n)
	{
		for(int i=1;i<=n;i++)
		{
			int last=num[num.length-1];
			for(int j=num.length-1;j>=0;j--)
			{
				if(j-1>=0)
				{
					num[j]=num[j-1];
				}
			}
			num[0]=last;
		}
		for(int k=0;k<=num.length-1;k++)
		{
			System.out.print(num[k]+" ");
		}
		return num;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("enter the elemntss");
		for(int n=0;n<=nums.length-1;n++)
		{
			nums[n]=sc.nextInt();
		}
		System.out.println("enter the no of rotations");
		int f=sc.nextInt();
		rotatefornnumber(nums,f);

	}

}
