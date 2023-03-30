package logicalEx;
import java.util.Scanner;
public class EvenOddEqualChecking
{
	public static boolean check(int num)
	{
		int even=0;
		int odd=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;
		}
		if(even==odd)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(EvenOddEqualChecking.check(n));
	}

}
