package logicalEx;

import java.util.Scanner;

public class series4 //1 14 28 43 59 76  
{
	public static void series4(int num)
	{
		int x=1;
		int d=13;
		for(int i=1;i<=num;i++)
		{
			System.out.print(x+" ");
			x=x+d;
			d++;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		series4.series4(n);

	}

}
