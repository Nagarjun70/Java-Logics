package com.jsp.strings;

public class countword 
{
	public static int count(String str)
    {
        char[] ch=new char[str.length()];
        int count=1;
        for(int i=0;i<=str.length()-1;i++)
        {
            ch[i]=str.charAt(i);
            if((ch[i]==' ' )&& (ch[i+1]!=' '))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        String str="welcome to java";
        System.out.println(count(str));
        
    }

}
