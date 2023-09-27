package Lesson5;
import java.util.*;
public class L5EA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("factorial calculator");
        System.out.print("What number would you like to know the factorial of: ");
        int Number = input.nextInt();
        int Factorial = 1;
        for (int count=1; count <= Number; count++){
            Factorial = (Factorial*count);
        }
        System.out.println("The Factorial of "+Number+" is "+Factorial);
    }
}
