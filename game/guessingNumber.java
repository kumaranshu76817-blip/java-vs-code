package game;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int guessofNumber = 0;
    
    public void setGuessnum(int guessofNumber){
        this.guessofNumber = guessofNumber;
    }
    public int getGuessnum(){
        return guessofNumber;
    }

    Game(){
        Random rn = new Random();
        this.number = rn.nextInt(100);
    }

    public void takeUserInput(){
        System.out.println("enter the guessing number:");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrect(){
        guessofNumber ++;
        if(inputNumber == number){
            System.out.println("yes you guessing right number");
            System.out.println("number was: " + number);
            System.out.println("Attmepts " + guessofNumber);
            return true;
        }
        else if (inputNumber < number){
            System.out.println("number is very low...");
        }
        else {
            System.out.println("number is very high...");
        }
        return false;
    }

}
public class guessingNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrect();
        }

    }
}
