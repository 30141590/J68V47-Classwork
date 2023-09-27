package Lesson5;
import java.util.*;
public class L5EC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pattern Repeater");
        System.out.print("What pattern would you like repeated: ");
        String Pattern = input.nextLine();
        System.out.print("How many times should it be repeated: ");
        int Number = input.nextInt();
        for (int count=1; count<=Number; count++){
            System.out.print(Pattern);
        }
    }
}
