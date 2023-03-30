package com.jsp.logicalClass;
import java.util.Scanner;
public class ArmStrongForNthNumber 
{
	public static String armstrongfornthnumber(int num)
	{
		int t1=num;
		int count=0;
		while(t1>0)
		{
			count++;
			t1=t1/10;
		}
		int t2=num;
		int sum=0;
		while(t2>0)
		{
			int rem=t2%10;
			sum=sum+(int)Math.pow(rem, count);
			t2=t2/10;
		}
		if(num==sum)
		{
			return "yes";
		}
		else {
			return "No";
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(ArmStrongForNthNumber.armstrongfornthnumber(n));
	}

}
