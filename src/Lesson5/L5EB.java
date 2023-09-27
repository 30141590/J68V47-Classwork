package Lesson5;
import java.util.*;
public class L5EB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Score = 0;
        int min = 1;
        int max = 10;
        int Random = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Guess a number between 1 and 10: ");
        for (int count = 1; count <= 5; count++) {
            int Guess = input.nextInt();
            if (Guess == Random) {
                System.out.println("Correct!");
                count = 5;
                Score = 1;
            } else {
                System.out.println("Incorrect, Try Again");
            }
        }
        if (Score==1){
            System.out.println("Well Done you guessed correct");
        } else {
            System.out.println("You ran out of lives better luck next time");
        }
    }
}
