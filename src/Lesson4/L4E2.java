package Lesson4;
import java.util.*;
public class L4E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Total = 0;
        System.out.print("Q1 What is the capital of spain? ");
        String Qone = input.nextLine();
        if (Qone.toLowerCase().equals("madrid")) {

            Total = (Total+1);
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }
        System.out.print("Q2 What is the capital of UK? ");
        String Qtwo = input.nextLine();
        if (Qtwo.toLowerCase().equals("london")) {
            Total = (Total+1);
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }
        System.out.print("Q3 What is the capital of Italy? ");
        String Qthree = input.nextLine();
        if (Qthree.toLowerCase().equals("rome")) {
            Total = (Total+1);
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect");
        }
        if (Total == 3) {
            System.out.println("Well Done! 3/3");
        }
        if (Total == 2) {
            System.out.println("Nice Try 2/3");
        }
        if (Total < 2) {
            System.out.println("Better Luck Next Time :( " + Total + "/3");
        }
    }
}
