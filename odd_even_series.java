package assignment_4;

import java.util.Scanner;

public class odd_even_series
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        OddEvenSeries(n);
    }
    public static void OddEvenSeries(int n)
    {
        if(n==0)
        {
            return ;
        }
        if(n%2==0)
        {
            OddEvenSeries(n-1);
            System.out.println(n);
        }
        else {
            System.out.println(n);
            OddEvenSeries(n-1);
        }
    }
}
