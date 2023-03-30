package logicalEx;
import java.util.Scanner;
public class SumOfNFibonacci
{
	public  static int sumNfibonacci(int num)
	{
		int sum=0;
		int  n1=1;
		int n2=1;
		int n3=0;
		
		if(num==1)
		{
			return 0;
			
		}
		else if(num==2)
		{
			return 1;
		}
		else
		{
			sum=n1+n2;
			for(int i=1;i<=num-2;i++)
			{
				n3=n1+n2;
				sum=sum+n3;
				n1=n2;
				n2=n3;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	System.out.println(SumOfNFibonacci.sumNfibonacci(n));


	}

}
