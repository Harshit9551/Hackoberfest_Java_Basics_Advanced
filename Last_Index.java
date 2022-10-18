package assignment_4;

import java.util.Scanner;

public class Last_Index
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(lastindex(arr,n-1,target));
    }
    public static int lastindex(int arr[], int a, int target)
    {
        if (a==0)
        {
            return -1;
        }
        if(arr[a]==target)
        {
            return a;
        }
        return lastindex(arr,a-1,target);

    }
}
