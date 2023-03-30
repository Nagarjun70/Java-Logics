package com.jsp.interview;
import java.util.*;
public class MaxMin 
{
	static void getMinMax(long a[], long n)  
    {
        //Write your code here
        long max=a[0];
        long min=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
       System.out.println(max);
       System.out.println(min);
    }

	public static void main(String[] args) 
	{
		long A[] = {3, 2, 1, 56, 10000, 167};
		long n=A.length-1;
		getMinMax(A,n);

	}

}
