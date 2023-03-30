package com.jsp.interview;
import java.util.*;

public class SubArrayGivenSumUsingArrayList // GFG problem
{
	 static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	        // Your code here
	        ArrayList<Integer> a1=new ArrayList<Integer>();
	        int sum=0; 
	        int f=0;
	        int l=0;
	       
	        for(int i=0;i<n;i++)
	        {
	            sum=sum+arr[i];
	            l=i;

	            while(sum>s)
	            {
	                sum=sum-arr[f];
	                f++;
	            }
	            if(s==sum && sum!=0)
	            {
	                a1.add(f+1);
	                a1.add(l+1);
	                return a1;
	            }
	        }
	       a1.add(-1);
	       return a1;
	    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter size");
    	int n=sc.nextInt();
    	int[] arr=new int[n];
    	System.out.println("enter the elements");
    	for(int i=0;i<=arr.length-1;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
        System.out.println("enter sum");
        int sum=sc.nextInt();
		System.out.println(subarraySum(arr,n,sum));

	}

}
