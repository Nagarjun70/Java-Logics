package com.jsp.interview;
import java.util.*;
public class KadanesAlgorithm 
{
public static long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long currentsum=0;
       long maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            currentsum=currentsum+arr[i];
          maxsum=Math.max(maxsum,currentsum);
          if(currentsum<0)
          {
              currentsum=0;
          }
        }
        return maxsum;
        
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("enter eleemnts");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("maxsum= "+maxSubarraySum(arr,size));

	}

}
