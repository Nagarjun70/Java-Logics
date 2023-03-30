package com.jsp.assi;
import java.util.*;
public class FrequencyOfGivenArray 
{
	public static int frequencyofgivenarray(int[] num,int s)
	{
		int count=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]==s)
			{
				count++;
			}
		}
		return count;
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
		System.out.println("search key");
		int s=sc.nextInt();
		System.out.println(frequencyofgivenarray(nums,s));

	}

}
