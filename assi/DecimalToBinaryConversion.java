package com.jsp.assi;
import java.util.*;
public class DecimalToBinaryConversion 
{
	public static int decimaltobinary(int num)
	{
		int t=1;
		int sum=0;
		while(num>0)
		{
			int rem=num%2;
			sum=sum+rem*t;
			t=t*10;
			num=num/2;
		}
		return sum;
	} 

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println(decimaltobinary(num));
		

	}

}
