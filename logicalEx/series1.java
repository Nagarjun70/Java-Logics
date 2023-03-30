package logicalEx;

import java.util.Scanner;

public class series1 // 1 4 7 10 13
{
	public static void series1(int num)
	{
		int x=1;
		for(int i=1;i<=num;i++)
		{
			System.out.print(x+" ");
			x=x+3;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		series1.series1(n);

	}

}
