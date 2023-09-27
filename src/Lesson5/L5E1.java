package Lesson5;
import java.util.*;

public class L5E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What numbers times table would you like to see: ");
        int Number = input.nextInt();
        for( int count=0; count<=12; count++ ){
            System.out.println(Number+" x "+count+" = "+Number*count);

        }
    }
}
