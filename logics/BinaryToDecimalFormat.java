package com.jsp.logics;
import java.util.*;
public class BinaryToDecimalFormat 
{
	public static int binary(int num)
	{
		int sum=0;
		int i=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+(int)Math.pow(2, i)*rem;
			i++;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int nums=sc.nextInt();
		
		System.out.println(binary(nums));
	}

}
