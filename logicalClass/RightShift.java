package com.jsp.logicalClass;
import java.util.*;
public class RightShift //left side 0 0 0 3 6 7 
{
	public static int[] rightshift(int[]nums)
	{
		int[] res=new int[nums.length];
		int x=nums.length-1;
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]!=0)
			{
				res[x]=nums[i];
				x--;
			}
		}
		for(int j=0;j<=res.length-1;j++)
		{
			System.out.print(res[j]+" ");
		}
		return res;
	}

	public static void main(String[] args) 
	{
		int[] num= {3,6,8,0,7,5,0,0};
		rightshift(num);
	}

}
