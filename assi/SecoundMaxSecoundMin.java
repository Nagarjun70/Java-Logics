package com.jsp.assi;
import java.util.*;
public class SecoundMaxSecoundMin
{
	public static void secondmaxsecoundmin(int[] num)
	{
		int max=num[0];
		int secondmax=num[0];
		int min=num[0];
		int secondmin=num[0];
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]>max)
			{
				secondmax=max;
				max=num[i];
			}
			else if(num[i]>secondmax)
			{
				secondmax=num[i];
			}
			if(num[i]<min)
			{
				secondmin=min;
				min=num[i];
			}
			else if(num[i]<secondmin)
			{
				secondmin=num[i];
			}
		}
		System.out.println(max);
		System.out.println(secondmax);
		System.out.println(min);
		System.out.println(secondmin);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<=nums.length-1;i++)
		{
			nums[i]=sc.nextInt();
		}
		secondmaxsecoundmin(nums);
//		int[] arr= {46,47,87,98,74,92,90};
//		secondmaxsecoundmin(arr);
	}

}
