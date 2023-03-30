package com.jsp.assi;
import java.util.*;
public class LeftShift // left rotation 
{
	public  int[] shift(int[] num)
	{
	
		int first=num[0];
		for(int i=0;i<=num.length-1;i++)
		{
			if(i+1<=num.length-1)
			{
				
			num[i]=num[i+1];
			}
		}
		num[num.length-1]=first;
		for(int j=0;j<=num.length-1;j++)
		{
			System.out.print(num[j]+" ");
		}
		return num;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int ln=sc.nextInt();
		int[] num=new int[ln];
		System.out.println("enter the elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
		LeftShift l1=new LeftShift();
		System.out.println(l1.shift(num));
		sc.close();
	}

}
	
