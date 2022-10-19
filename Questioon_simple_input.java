import java.util.Scanner;

public class Questioon_simple_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int sum = 0;
        while(sc.hasNextInt()) {
           int n = sc.nextInt();
            sum = sum + n;
            if (sum >= 0) {
                System.out.println(n);
            } else {
                break;
            }
        }
    }
}
