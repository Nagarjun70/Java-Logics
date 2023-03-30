package com.jsp.strings;

public class lastwordlength 
{
	public static int findLength(String s) 
    { 
        // code here
        int len = 0;
        String x = s.trim();
        for (int i = 0; i < x.length(); i++) 
        {
            if (x.charAt(i) == ' ')
            {
                len = 0;
            }else{
                
                len++;
            }
        }
 
        return len;
    }
    public static void main(String[] args) 
    {
        String str="hey hi arjun ";
        System.out.println(findLength(str));

        
    }

}
