package Lesson8;
import java.util.*;

public class L8E2 {
    public static int[] scores() {
        int[] results = new int[10];
        for (int count = 0; count < 10; count++){
            int Num = (int) (Math.random() * (100 - 2 + 1) + 2);
            results[count] = Num;
        }
        return results;
    }
    public static double average(int[] scores) {
        int sum = 0;
        for (int count = 0; count < scores.length; count++){
            sum = scores[count] + sum;
        }
        double average = sum/scores.length;
        return average;
    }
    public static void print(int[] results, double avg){
        for (int count = 0; count < results.length; count++){
            System.out.println(results[count]);
        }
        Arrays.sort(results);
        System.out.format("The lowest score is: %d %n", results[0]);
        System.out.format("The highest score is: %d %n", results[results.length - 1]);
        System.out.format("The average score is: %.0f", avg);
    }
    public static void main(String[] args) {
        int[] results = scores();
        double avg = average(results);
        print(results, avg);

    }
}
