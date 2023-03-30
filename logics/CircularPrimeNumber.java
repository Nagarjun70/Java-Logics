package com.jsp.logics;
import java.util.*;
public class CircularPrimeNumber 
{
		public static void test(int num)
		{     
			int temp=num;
			int count1=0;
			int count2=0;
			int top=1;
			while(temp>0)
			{ 
			  count1++;
			 temp=temp/10;
			}
			for(int i=1;i<=count1-1;i++)
			{
				top=top*10;
			}
				temp=num;
	  
			
			for(int i=1 ;i<=count1;i++)
			{
				
				int count=0;
				for(int j=2 ;j<=temp-1;j++)
				{
			
					if(temp%j==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					count2++;
					
				}
				int rem=temp%10;
				rem=rem*top;
				int c=temp/10;
				temp=rem+c;
				
			}
			if(count1==count2)
			{
				System.out.println(temp+"  circularprime");
			}
			else {
				System.out.println(temp+"  not a circular prime");
			}
			}
		

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		test(n);

	}

}
