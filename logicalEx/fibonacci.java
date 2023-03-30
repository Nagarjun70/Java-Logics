package logicalEx;
import java.util.Scanner;
public class fibonacci // print n fibnacci number
{
	public static void fibonacciseries(int num)
	{
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.print(n1+" "+n2);
		for(int i=3;i<=num;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		fibonacci.fibonacciseries(n);
	}

}
