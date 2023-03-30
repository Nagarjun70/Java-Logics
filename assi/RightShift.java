package com.jsp.assi;
import java.util.*;
public class RightShift // right rotate
{
	public int[] rightshift(int[] num)
	{
		int last=num[num.length-1];
		for(int i=num.length-1;i>=0;i--)
		{
			if(i-1>=0)
			{
			num[i]=num[i-1];
			}
		}
		num[0]=last;
		for(int j=0;j<=num.length-1;j++)
		{
			System.out.print(num[j]+" ");
		}
		return num;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("enter the elemnts");
		for(int k=0;k<=nums.length-1;k++)
		{
			nums[k]=sc.nextInt();
			
		}
		RightShift r1=new RightShift();
		System.out.println(r1.rightshift(nums));
	}

}
