package Lesson4;
import java.util.*;
public class L4EB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many marks did you get: ");
        float Marks = input.nextFloat();
        System.out.print("What is the total marks available: ");
        float Total = input.nextFloat();
        double Percentage = (Marks/Total*100);
        if (Percentage >= 70){
            System.out.print("Result: A");
        }
        if (Percentage >= 60 && Percentage < 70){
            System.out.print("Result: B");
        }
        if (Percentage >= 50 && Percentage < 60) {
            System.out.print("Result: C");
        }
        if (Percentage >= 40 && Percentage < 50) {
            System.out.print("Result: D");
        }
        if (Percentage < 40) {
            System.out.print("Result: N/A");
        }
    }
}
