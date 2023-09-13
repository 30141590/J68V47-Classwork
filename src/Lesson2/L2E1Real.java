package Lesson2;

import java.util.*;
public class L2E1Real {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is your favourite hobby? ");
        String hobby = input.nextLine();

        System.out.println(name + " loves " + hobby + ".");
        System.out.println("They really enjoy " + hobby + ", they like to do it as often as possible.");
        System.out.println(name + " finds " + hobby + " relaxing and it helps them pass some time.");



    }
}
