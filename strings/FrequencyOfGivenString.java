package com.jsp.strings;
import java.util.*;
public class FrequencyOfGivenString //Array 
{
	public static void frequency(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					num[j]=-1;
				}
			}
			if(num[i]!=-1)
			{
				System.out.println(num[i]+"------>"+count);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("enter elements");
		for(int k=0;k<=nums.length-1;k++)
		{
			nums[k]=sc.nextInt();
		}
		frequency(nums);

		

	}

}
