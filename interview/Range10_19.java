package com.jsp.interview;
import java.util.*;
public class Range10_19 
{
	public static int range(int L,int R,int X)
	{
		int count=0;
		for(int i=L;i<=R;i++)
		{
			int t=i;
			while(t>0)
			{
				int rem=t%10;
				if(rem==X)
				{
					count++;
				}
				t=t/10;
			}
		}
		return count;
	
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the L");
		int L=sc.nextInt();
		System.out.println("enter the R");
		int R=sc.nextInt();
		System.out.println("enter the X");
		int X=sc.nextInt();
		System.out.println(range(L,R,X));

	}

}
