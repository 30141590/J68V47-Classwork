package Lesson4;
import java.util.*;

public class L4EA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 10;
        int Random = (int)(Math.random()*(max-min+1)+min);
        System.out.print("Guess a number between 1 and 10: ");
        int Guess = input.nextInt();
        if (Guess == Random){
            System.out.print("Correct!");
        } else {
            System.out.print("Wrong!");
        }

    }
}
