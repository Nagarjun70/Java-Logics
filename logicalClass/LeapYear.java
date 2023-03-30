package com.jsp.logicalClass;

import java.util.Scanner;

public class LeapYear 
{
	public static String leapyear(int year)
	{
		if( year%400==0)
		{
			return "Leap Year";
		}
		else if(year%100!=0 && year%4==0)
		{
			return "leap Year";
		}
		else {
			return "Not leap year";
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(LeapYear.leapyear(n)); 
	}
}
