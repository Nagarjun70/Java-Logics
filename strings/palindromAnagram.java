package com.jsp.strings;

public class palindromAnagram 
{
	public static int isPossible (String S)
    {
        // your code here
        int size=150;
       int[] count = new int[size];
        for (int i = 0; i<=S.length()-1; i++)
        {
            count[(int)(S.charAt(i))]++;
 
        }
        int odd = 0;
        for (int i = 0; i <size; i++)
        {
            if ((count[i] & 1) == 1)
            {
                odd++;
            }
            if (odd > 1)
            {
                return 0;
            }
        }
 
      
        return 1;
    }

	public static void main(String[] args) 
	{
		String s="geeksogeeks";
		
		System.out.println(isPossible(s));

	}

}
