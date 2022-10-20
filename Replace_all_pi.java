package assignment_4;

import java.util.Scanner;

public class Replace_all_pi
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while (n-->0)
        {
            String str = sc.next();
            String str1="";
            str1=str1+str.charAt(0);
            replace(str.substring(1),str1);
        }
    }
    public static void replace(String str, String str1)
    {
        if(str.length()==0)
        {
            System.out.println(str1);
            return;
        }
        if(str1.charAt(str1.length()-1)==str.charAt(0))
        {
            replace(str.substring(1),str1.substring(0,str1.length())+"3.14");
        }
        else{
            replace(str.substring(1),str1 +str.charAt(0));
        }
    }
}
