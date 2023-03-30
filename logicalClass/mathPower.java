package com.jsp.logicalClass;
import java.util.Scanner;
public class mathPower // alternate logic for math.power
{
	public static int mathpower(int value, int power)
	{
		int res=1;
		for(int i=1;i<=power;i++)
		{
			res=res*value;
		}
		return res;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int value=sc.nextInt();
		System.out.println("enter p");
		int p=sc.nextInt();
		System.out.println(mathPower.mathpower(value, p));

	}

}
