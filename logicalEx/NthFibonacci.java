package logicalEx;
public class NthFibonacci // nth fibonnacci number
{
	public static int fibo(int num)
	{
		int n1=0;
		int n2=1;
		int n3=0;
		if(num==1)
		{
			return 0;
		}
		if(num==2)
		{
			return 1;
		}
		for(int i=2;i<=num;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n3;
	}

	public static void main(String[] args)
	{
		System.out.println(fibo(10));
	}

}
