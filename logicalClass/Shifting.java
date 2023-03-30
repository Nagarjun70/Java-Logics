package com.jsp.logicalClass;
import java.util.Arrays;
import java.util.Scanner;
public class Shifting // for right side
{
	public  int[] shift(int[] num)
	{
		int[] res=new int[num.length];
		int x=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]!=0)
			{
				res[x]=num[i];
				x++;
			}
		}
		for(int j=0;j<=res.length-1;j++)
		{
			System.out.print(res[j]+" ");
		}
//		System.out.println(Arrays.toString(res));
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the size");
		int size=sc.nextInt();
		int[] nums=new int[size];
		System.out.println("enter the elemnts");
		for(int i=0;i<=nums.length-1;i++)
		{
			nums[i]=sc.nextInt();
		}
		Shifting s1=new Shifting();
		System.out.println(s1.shift(nums));
		
                                                            // O/P IS ---->  9 8 7 0 0 0
	}

}
