public class Hollow_rhombus {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<6;j++){
                if(i>=2 && j>=2 && i<=4 && j<=4){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
