package com.jsp.interview;
import java.util.*;
public class NegativeElementsToEnd 
{
	
    public static void number(int[] num)
    {
    	int k=0;
    	int res[]=new int[num.length];
    	for(int i=0;i<=num.length-1;i++)
    	{
    		if(num[i]>0)
    		{
    			res[k]=num[i];
    			k++;
    		}
    	}
    	for(int i=0;i<=num.length-1;i++)
    	{
    		if(num[i]<0)
    		{
    			res[k]=num[i];
    			k++;
    		}
    	}
    	for(int i=0;i<=num.length-1;i++)
    	{
    		num[i]=res[i];
    	}
    	for(int l=0;l<=num.length-1;l++)
    	{
    		System.out.println(res[l]);
    	}
    	
    	
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter size");
    	int size=sc.nextInt();
    	int[] num=new int[size];
    	System.out.println("enter the elements");
    	for(int i=0;i<=num.length-1;i++)
    	{
    		num[i]=sc.nextInt();
    	}
    	number(num);
    	
		
	}
}
