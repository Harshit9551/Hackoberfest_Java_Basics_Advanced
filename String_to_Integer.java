package assignment_4;

import java.util.Scanner;

public class String_to_Integer
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int m=0;
        int n=0;
        StringtoInteger(s,m);

    }
    public static void StringtoInteger(String s, int m)
    {
        if(s.length()==0)
        {
            System.out.println(m);
            return ;
        }
        char ch= s.charAt(0);
        int d=(int)ch-48;
        StringtoInteger(s.substring(1),m+(d*((int)Math.pow(10,s.length()-1))));

    }
}
