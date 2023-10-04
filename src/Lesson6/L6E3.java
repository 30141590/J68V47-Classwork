package Lesson6;
import java.util.*;
public class L6E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 2;
        int max = 10;
        int Score = 0;
        int Lives = 3;
        int count = 10;
        System.out.println("Times Table Quiz: ");
            while(count >= 1 && Lives != 0){
                int None = (int)(Math.random()*(max-min+1)+min);
                int Ntwo = (int)(Math.random()*(max-min+1)+min);
                int Answer = (None*Ntwo);
                System.out.println("What is "+None+"x"+Ntwo+"?");
                int Response = input.nextInt();
                if (Response==Answer){
                    Score ++;
                    System.out.println("\nCorrect!\n");
                } else {
                    Lives--;
                    System.out.println("\nIncorrect");
                    System.out.println("You have " + Lives + "/3 lives remaining\n");
                }
                count--;

            }
        if (Lives == 0){
            System.out.println("You ran out of lives.");
        }
        System.out.println("Your final score was: "+Score+"/10");
        if (Lives == 3){
            System.out.println("Well Done!");
        }
    }
}
