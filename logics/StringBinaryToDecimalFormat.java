package com.jsp.logics;
import java.util.*;
public class StringBinaryToDecimalFormat 
{
	public static int test(String num)
	{
		int sum=0;
		int pow=0;
		for(int i=num.length()-1;i>=0;i--)
		{
			int rem=num.charAt(i)-48;
			sum=sum+(int)Math.pow(2, pow)*rem;
			pow++;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		String n=sc.next();
		
		System.out.println(test(n));

	}

}
//10011 ----> 19