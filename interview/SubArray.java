package com.jsp.interview;

public class SubArray 
{
	public static void number(int [] num,int N)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int sum=0;
			for(int j=i+1;j<=num.length-1;j++)
			{
				sum=sum+num[j];
				if(N==num[i]+sum)
				{
					System.out.println(i+" "+j);
					break;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,7,5};
		int N=15;
		number(arr,N);

	}

}
