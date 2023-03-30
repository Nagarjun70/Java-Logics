package com.jsp.assi;
import java.util.*;
import java.util.Arrays;

public class decimaltoBinaryStroreInAraay //decimal number to binary and store it in reverse order
{
	public static int[] decimaltobinary(int num)
	{
		int[] res=new int[20];
		int i=0;
		while(num>0)
		{
			int rem=num%2;
			res[i]=rem;
			i++;
			num=num/2;
		}
//		System.out.println(Arrays.toString(res));
		for(int k=0;k<=i-1;k++)
		{
			
			System.out.print(res[k]+" ");
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int nums=sc.nextInt();
		System.out.println(decimaltobinary(nums));
	}

}
