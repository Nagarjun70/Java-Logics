package com.jsp.interview;

public class subArrayGivenSum 
{
	public static void sub(int [] num,int N)
	{
		int count=0;
		for(int i=0;i<=num.length-1;i++)
		{
			int sum=0;
			for(int j=i+1;j<=num.length-1;j++)
			{
				sum=sum+num[j];
				if(N==num[i]+sum)
				{
					System.out.println(i+1+" "+(j+1));
					count++;
				}
			}
			if(count!=0)
			{
				break;
			}
		} 
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int N=15;
		sub(arr,N);
		

	}

}
