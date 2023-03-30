package logicalEx;
import java.util.Scanner;

public class threeMultiple 
{
	public static  void mutlipleof3(int num)
	{
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			if (rem%3==0)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		threeMultiple.mutlipleof3(n);

	}

}
