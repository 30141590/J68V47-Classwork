package Lesson5;
import java.util.*;
public class L5E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 2;
        int max = 100;
        int Score = 0;
        System.out.println("Times Table Quiz: ");
        for( int count=10; count>=1; count--){
            int None = (int)(Math.random()*(max-min+1)+min);
            int Ntwo = (int)(Math.random()*(max-min+1)+min);
            int Answer = (None*Ntwo);
            System.out.println("What is "+None+"x"+Ntwo+"?");
            int Response = input.nextInt();
            if (Response==Answer){
                Score ++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }


        }
        System.out.println("Your final score was: "+Score+"/10");
    }
}
