package com.jsp.logicalClass;

public class bubbleSortIndex 
{
	public static int sort(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=0;j<=num.length-2;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		int count=0;
		int res=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				count++;
				res=num[i];
			}
			if(count==2)
			{
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		
		int[] num= {1,2,3,4,5,6,7};
		System.out.println(sort(num));
	}

}
