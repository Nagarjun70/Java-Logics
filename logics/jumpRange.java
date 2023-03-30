package com.jsp.logics;

public class jumpRange 
{
	public static int jump(int N)
	{
		if(N<=10)
		{
			return N;
		}
		else {
			int res=0;
			for(int i=1;i<=N;i++)
			{
				int n1=i;
				int count=0;
				while(n1>0)
				{
					n1=n1/10;
					count++;
				}
				int a=i;
				int count2=0;
				for(int j=1;j<=count-1;j++)
				{
					int rem1=a%10;
					int a1=a;
					a1=a1/10;
					int rem2=a1%10;
					if(Math.abs(rem1-rem2)==1)
					{
						count2++;
					}
					a=a/10;
				}
				if(count2==count-1)
				{
					res=i;
				}
				count2=0;
			}
			return res;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println(jump(1000));
		
	}

}
