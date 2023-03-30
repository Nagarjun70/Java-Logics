package com.jsp.logics;
import java.util.*;
public class TwoDigitJumpingNumber 
{
	public static boolean jumping(int num)
	{
			if(Math.abs(num%10-num/10)==1)
			{
				return true;
			}else {
				return false;
			}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(jumping(n));

	}

}
