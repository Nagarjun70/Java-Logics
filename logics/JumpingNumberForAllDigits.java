package com.jsp.logics;
import java.util.*;
public class JumpingNumberForAllDigits 
{
	public static void jumping(int num)
	{
		if(num<9)
		{
			System.out.println("jumping number");
		}
		else {
			int c1=0;
			int a=num;
			while(a!=0)
			{
				c1++;
				a=a/10;
			}
			int c=0; 
			while(num>9)
			{
				int b=num%100;
				if(Math.abs(b%10-b/10)==1)
				{
					c++;
				}
				num=num/10;
			}
			if(c==(c1-1))
			{
				System.out.println("jumping number");
			}else {
				System.out.println("not jumping number");
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		jumping(n);
	}

}
