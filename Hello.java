import java.util.Random;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        // 0 for rock
        // 1 for paper
        // 2 for seccsior
        System.out.println("(0) for rock:\n(1) for paper:\n(2) for seccsior:");
        int userInput = sc.nextInt();

        Random random =  new Random();
        int computerchoic = random.nextInt(3);

        if(userInput == computerchoic){
            System.out.println("draw");

        }
        else if(userInput == 0 && computerchoic == 2 || userInput == 1 && computerchoic == 0 || userInput == 2 && computerchoic == 1){
            System.out.println("you win");
        }
        else{
            System.out.println("computer win");
        }
        if (computerchoic == 0){
            System.out.println("computer choic :rock");
        }
        else if(computerchoic == 1){
            System.out.println("computer choice : paper");
        }
        else{
            System.out.println("computer choice : seccisor");
        }

    }
}