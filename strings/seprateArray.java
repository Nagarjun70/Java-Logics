package com.jsp.strings;

import java.util.Arrays;

public class seprateArray 
{
	public static void separate(int[] num)
	{
		int[] res1= new int[(num.length)/2];
		int[] res2=new int[(num.length)/2];
		int x=0;
		int y=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(i%2==0)
			{
				res1[x]=num[i];
				x++;
			}
			else {
				res2[y]=num[i];
				y++;
			}
		}
		System.out.println(Arrays.toString(res2));
	
		System.out.println(Arrays.toString(res1));
	
	}

	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		separate(num);

	}

}
