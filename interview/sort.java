package com.jsp.interview;
import java.util.*;
public class sort 
{

	    public static int[] sorting(int[] num)
	    {
	        for(int i=0;i<=num.length-1;i++)
	        {
	            for(int j=i+1;j<=num.length-1;j++)
	            {
	                if(num[i]>num[j])
	                {
	                    int temp=0;
	                    temp=num[i];
	                    num[i]=num[j];
	                    num[j]=temp;
	                }
	            }
	        }
	        for(int k=0;k<=num.length-1;k++)
	        {
	        	System.out.print(num[k]+" ");
	        }
	        return num;
	    }
	    public static void main(String[] args) 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter size");
	    	int size=sc.nextInt();
	    	int[] nums=new int[size];
	    	System.out.println("enter the elements");
	    	for(int i=0;i<=nums.length-1;i++)
	    	{
	    		nums[i]=sc.nextInt();
	    	}
	        
	        sorting(nums);
	        
	    }
	}


