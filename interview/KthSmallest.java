package com.jsp.interview;

public class KthSmallest 
{
	public static int kthSmallest(int[] arr,int k) 
    { 
        //Your code here
	    for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i]>arr[j])
                {
                     int temp=0;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        
        }
        return arr[k-1];
    } 

	public static void main(String[] args) 
	{
		int arr[] = {7,10,4,20,15};
		int k=4;
	System.out.println(kthSmallest(arr,k));

	}

}
// NOTE:-- ITS ONLY WORK FOR FEW TESTCASES BCZ OF TIME COMPLEXCITY
