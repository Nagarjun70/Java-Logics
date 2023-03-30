package com.jsp.interview;

import java.util.ArrayList;

public class FindduplicateInArraylist //doubt 
{
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            arr[arr[i]%n]=arr[arr[i]%n]+n;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]/n>=2)
            {
                al.add(i);
            }
        }
        if(al.size()==0)
        {
            al.add(-1);
            return al;
        }
        return al;
    }

	public static void main(String[] args) 
	{
		int[] arr= {0,3,1,2};
		int n=4;
		System.out.println(duplicates(arr,n));
	}

}
