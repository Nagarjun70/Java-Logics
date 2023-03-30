package logicalEx;
import java.util.Scanner;
public class tribonacci 
{
	public static void tribonacciseries(int num)
	{
		int n1=0;
		int n2=1;
		int n3=1;
		int n4=0;
		
		System.out.print(n1+" "+n2+" "+n3);
		for(int i=3;i<=num;i++)
		{
			n4=n1+n2+n3;
			System.out.print(" "+n4);
			n1=n2;
			n2=n3;
			n3=n4;
		}
	}

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		tribonacci.tribonacciseries(n);
	}

}

