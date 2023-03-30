package logicalEx;
import java.util.Scanner;

public class series2 //1 3 6 10 15 21
{
	public static void series2(int num)
	{
		int x=1;
		int d=2;
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
		series2.series2(n);

	}

}

