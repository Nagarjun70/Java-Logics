package com.jsp.interview;

public class Sorting012 
{
	 public static void sort012( int a[])
	    {
	        // code here 
	        int low=0;
	        int mid=0;
	        int high=a.length-1;
	        while(mid<=high)
	        {
	            if(a[mid]==0)
	            {
	                int temp=a[mid];
	                a[mid]=a[low];
	                a[low]=temp;
	                mid++;
	                low++;
	            }
	            else if(a[mid]==1)
	            {
	                mid++;
	            }
	            else{
	                int temp=a[mid];
	                a[mid]=a[high];
	                a[high]=temp;
	                high--;
	            }
	           
	        }
//	        System.out.println(mid+low+high);
	        
	      
	    }

	public static void main(String[] args) 
	{
		int[] a= {1,2,1,0,2,0,2,1};
		
		sort012(a);
		

	}

}
