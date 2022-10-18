package assignment_4;

import java.util.Scanner;

public class All_Indices_Problem
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        AllIndicesProblem(arr,0,target);
    }
    public static int AllIndicesProblem(int arr[], int a, int target)
    {
        if (a==arr.length)
        {
            return 0;
        }
        if(arr[a]==target)
        {
            System.out.println(a+" ");;
        }
        return  AllIndicesProblem(arr,a+1,target);

    }
}
