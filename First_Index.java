package assignment_4;

import java.util.Scanner;

public class First_Index
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(firstindex(arr,0,target));
    }
    public static int firstindex(int arr[], int a, int target)
    {
        if (a==arr.length)
        {
            return -1;
        }
        if(arr[a]==target)
        {
            return a;
        }
        return firstindex(arr,a+1,target);

    }
}
