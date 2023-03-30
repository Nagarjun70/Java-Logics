package com.jsp.logicalClass;
import java.util.Scanner;
public class Bill 
{
	public static int bill(int units)
	{
//		if(units<=100)
//		{
//			return 1;
//		}
//		else if(units>=100 && units<=200)
//		{
//			return 0+(units-100)*5;
//		}
//		else {
//			return 0+500+(units-200)*10;
//		}
		int count=0;
		for(int i=1;i<=units;i++)
		{
			if(i<=100)
			{
				count=count+0;
			}
			else if(i>=100 && i<=200)
			{
				count=count+5;
			}
			else {
				count=count+10;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(Bill.bill(n));


	}

}
