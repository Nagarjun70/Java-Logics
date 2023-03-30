package com.jsp.logics;
import java.util.*;
public class ThreeDigitJumpingNumber 
{
	public static boolean jump(int num)
	{
		int a=0;
		int b=num%100;
		if(Math.abs(b%10-b/10)==1)
		{
			a++;
		}
		num=num/10;
		if(Math.abs(num%10-num/10)==1)
		{
			a++;
		}
		if(a==2)
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
		System.out.println(jump(n));
		

	}

}
