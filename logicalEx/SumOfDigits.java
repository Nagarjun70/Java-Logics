package logicalEx;
import java.util.Scanner;
class sum{
public static int sum(int num)
{
	int sum=0;
	while(num>0)
	{
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	return sum;
 }
}
public class SumOfDigits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(sum.sum(n));
	}
}
