package com.jsp.logicalClass;
import java.util.*;
public class shiftzero //leftShift
{
	public static int[] Shiftzero(int[] nums)
	{
		int[] res=new int[nums.length];
		int x=0;
		for(int i=0;i<=nums.length-1;i++) {
			if(nums[i]==0)                     // if(nums[i]==0)                 // if(nums[i]!=0
			{
				res[x]=nums[i];
				x++;
			}
		}
		for(int k=0;k<=nums.length-1;k++)
		{
			if(nums[k]!=0)                     // if(nums[k]!=0) ---> o/p is 0 0 0 0 1 7 3      // if(nums[k]==0)---> o/p is  1 7 3 0 0 0 0
			{
				res[x]=nums[k];
				x++;
			}
		}
		for(int j=0;j<=res.length-1;j++)
		{
			System.out.print(res[j]+" "); // it gives this type of o/p --> 0 0 0 0 1 6 8 9 8
		}
//		System.out.println(Arrays.toString(res)); // it gives this type of o/p---> [0, 0, 0, 1, 9, 30, 4, 3, 80, 6]
		return res;
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
		shiftzero s1=new shiftzero();
		System.out.println(s1.Shiftzero(num));
	}

}
