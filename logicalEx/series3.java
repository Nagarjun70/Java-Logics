package logicalEx;

import java.util.Scanner;

public class series3 // 1 4 9 16 25
{
	public static void series3(int num)
	{
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(i*i+" ");
			
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		series3.series3(n);

	}

}
