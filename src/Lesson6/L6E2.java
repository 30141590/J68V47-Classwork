package Lesson6;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class L6E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime Time = LocalDateTime.now();
        DateTimeFormatter Format = DateTimeFormatter.ofPattern("HH:mm");
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
                System.out.println("\nHello\n");
            }
            if (Selection == 2){
                String formattedDate = Time.format(Format);
                System.out.println("\n" + formattedDate + "\n");
            }
            if (Selection == 3){
                System.out.println("\nWhy don't scientists trust atoms?\nBecause they make up everything!\n");
            }
            if (Selection == 4){
                System.out.println("\nExiting Program\n");
                quit = 1;
            }

        }

    }
}
