package com.jsp.logicalClass;
import java.util.Scanner;
public class EvenAndOddShifting //shifting even and odd integer
{
	public int[] evenodd(int[] num)
	{
		int[] res=new int[num.length];
		int x=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				res[x]=num[i];
				x++;
			}
		}
		for(int j=0;j<=num.length-1;j++)
		{
			if(num[j]%2!=0)
			{
				res[x]=num[j];
				x++;
			}
		}
		for(int k=0;k<=res.length-1;k++)
		{
			System.out.print(res[k]+" ");
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
		EvenAndOddShifting e1=new EvenAndOddShifting();
		System.out.println(e1.evenodd(num));

	}

}
