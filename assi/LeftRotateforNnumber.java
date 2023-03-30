package com.jsp.assi;
import java.util.*;
public class LeftRotateforNnumber
{
	public static int[] leftshiftfornnumber(int[] num,int n)
	{
		for(int i=1;i<=n;i++)
		{
			int first=num[0];
			for(int j=0;j<=num.length-1;j++)
			{
				if(j+1<=num.length-1)
				{
					
				num[j]=num[j+1];
				}
			}
			num[num.length-1]=first;
		}
			for(int j=0;j<=num.length-1;j++)
			{
				System.out.print(num[j]+" ");
			}
//		System.out.println(Arrays.toString(num));
			return num;
		}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.print("enter the elements");
		for(int k=0;k<=nums.length-1;k++)
		{
			nums[k]=sc.nextInt();
		}
		System.out.println("enter the number of rotaion");
		int n=sc.nextInt();
		leftshiftfornnumber(nums,n);
		sc.close();
		

	}

}
