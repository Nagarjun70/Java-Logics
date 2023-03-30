package com.jsp.interview;

import java.util.Arrays;

public class AtmMoney 
{
	public static int atm(int[] num)
	{
		int count=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]>=0)
			{
				int rem=num[i]%10;
				count++;
				num[i]=num[i]/10;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		int[] n= {10,500,1000,2000,50,100};
		System.out.println(atm(n));

	}

}
