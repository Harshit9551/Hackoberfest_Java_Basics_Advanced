package assignment_4;

import java.util.Scanner;

public class Recursion_Keypad_Codes
{
    static String[] str={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        Keypaid(s,"");

    }
    public static void Keypaid(String s, String a)
    {
        if(s.length()==0)
        {
            System.out.print(a+" ");
            return;
        }
        char ch= s.charAt(0);
        String ps= str[ch-48];
        for (int i = 0; i < ps.length(); i++) {
            Keypaid(s.substring(1), a+ ps.charAt(i));

        }
    }
}
