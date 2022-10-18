package assignment_4;

import java.util.Scanner;

public class Nth_Triangle_Recursion
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m=0;
        NthTriangleRecursion(n,m);

    }
    public static int NthTriangleRecursion(int n, int m)
    {
        if(n==m)
        {
            System.out.println(m);
            return n;
        }
        m=m+n;
        return NthTriangleRecursion(n-1,m);
    }
}

