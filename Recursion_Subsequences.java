package assignment_4;

import java.util.Scanner;

public class Recursion_Subsequences {
    static int c=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String ss="";
        RecursionSubsequences(s,ss);
        System.out.println("\n"+c);
    }
    public static void RecursionSubsequences(String s, String ss)
    {
        if(s.length()==0)
        {
            c++;
            System.out.print(ss+" ");
            return;
        }
        char ch= s.charAt(0);
        RecursionSubsequences(s.substring(1),ss);
        RecursionSubsequences(s.substring(1), ss+c);

    }
}
