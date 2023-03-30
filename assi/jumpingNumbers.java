package com.jsp.assi;

public class jumpingNumbers 
{
	public static boolean jump(int num)
	{
		if(Math.abs(num%10-num/10)==1)
		{
			return true;
		}else {
			return false;
		}
	}
	

	public static void main(String[] args)
	{
		System.out.println(jump(10));
	}

}
