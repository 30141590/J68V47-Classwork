package Lesson2;

import java.util.*;
public class L2E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Your current name is: " + name);

        System.out.print("What is your desired name? ");
        name = input.nextLine();
        System.out.print("your new name is: " + name);
    }
}
