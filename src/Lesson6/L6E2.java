package Lesson6;
import java.util.*;
public class L6E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quit = 0;
        while (quit == 0){
            System.out.println("Please choose an option by entering the corresponding number e.g. 1");
            System.out.println("1. Say \"Hello\"");
            System.out.println("2. Tell Me The Time");
            System.out.println("3. Tell me a joke");
            System.out.println("4. Exit");
            System.out.print("Select An Option: ");
            int Selection = input.nextInt();
            if (Selection == 1){
                System.out.println(" ");
                System.out.println("Hello");
                System.out.println(" ");
            }
            if (Selection == 2){
                System.out.println(" ");
                System.out.println("== ERROR ==");
                System.out.println("Date and Time functionalities are currently unavailable.");
                System.out.println(" ");
            }
            if (Selection == 3){
                System.out.println(" ");
                System.out.println("Why don't scientists trust atoms?\n" + "\n" + "Because they make up everything!");
                System.out.println(" ");
            }
            if (Selection == 4){
                System.out.println(" ");
                System.out.println("Exiting Program");
                System.out.println(" ");
                quit = 1;
            }

        }

    }
}
