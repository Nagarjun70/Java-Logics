package com.jsp.assi;
import java.util.*;
public class decimalToBinaryUsingString 
{
	public static String decimaltobinaryusingstring(int num)
	{
		String res=" ";
		while(num>0)
		{
			int rem=num%2;
			res=rem+res;//---->11001
			num=num/2;
			
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int nums=sc.nextInt();
		System.out.println(decimaltobinaryusingstring(nums));

	}

}
