import java.util.Scanner;

public class hollosquare {
    public static void main(String[] args) {
        System.out.println("enter the number to print:");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||j==1|| i==n||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
