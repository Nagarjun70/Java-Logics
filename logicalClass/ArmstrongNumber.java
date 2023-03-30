package com.jsp.logicalClass;
import java.util.Scanner;
public class ArmstrongNumber 
{
	public static void pow(int num)
	{
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		ArmstrongNumber .pow(n);
		sc.close();

	}

}
