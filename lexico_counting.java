package assignment_4;

import java.util.Scanner;

public class lexico_counting
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        lexicontig(0,n);

    }
    public static void lexicontig(int curr, int n)
    {
        if(curr>n)
        {
            return;
        }
        System.out.print(curr+" ");
        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            lexicontig(curr*10+i,n);

        }

    }
}
