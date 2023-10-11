package Lesson7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class L7E1 {

    public static void showMenu(){
        System.out.println("Please choose an option by entering the corresponding number e.g. 1");
        System.out.println("1. Say \"Hello\"");
        System.out.println("2. Tell Me The Time");
        System.out.println("3. Tell me a joke");
        System.out.println("4. Exit");
        System.out.print("Select An Option: ");
    }
    public static int getOption(){
        Scanner input = new Scanner(System.in);
        int Selection = input.nextInt();
        return Selection;
    }
    public static void option1(){
        System.out.println("\nHello\n");
    }
    public static void option2(){
        LocalDateTime Time = LocalDateTime.now();
        DateTimeFormatter Format = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDate = Time.format(Format);
        System.out.println("\n" + formattedDate + "\n");
    }
    public static void option3(){
        System.out.println("\nWhy don't scientists trust atoms?\nBecause they make up everything!\n");
    }
    public static void main(String[] args) {
        int quit = 0;
        while (quit == 0){
            showMenu();
            int Selection = getOption();

            if (Selection == 1){
                option1();
            } else if (Selection == 2){
                option2();
            }else if (Selection == 3){
                option3();
            }else if (Selection == 4){
                System.out.println("\nExiting Program\n");
                quit = 1;
            } else {
                System.out.println("\nThis is not a valid option. Try a number between 1-4.\n");
            }

        }

    }
}
