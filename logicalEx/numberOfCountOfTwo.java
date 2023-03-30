package logicalEx;
import java.util.Scanner;
public class numberOfCountOfTwo 
{
	public static int count(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(i%10==2 && i/10==2)
			{
				count=count+2;
			}
			else if(i%10==2 || i/10==2)
			{
				count++;
			}
			else
			{
				count=count;
			}
		}
		return count;
	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(numberOfCountOfTwo.count(n)); 
	 

	}

}
