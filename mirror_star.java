import java.util.Scanner;

public class mirror_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=2;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for(int l=2;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<=2;k++){
                System.out.print("* ");
            }
            for(int k=i;k<=1;k++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
