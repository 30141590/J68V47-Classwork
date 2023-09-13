package Lesson3;

import java.util.*;
public class L3E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Q1 What is the capital of spain? ");
        String Qone = input.nextLine();
        Qone = Qone.toLowerCase();
        System.out.println(Qone.contains("madrid"));
        System.out.print("Q2 What is the capital of UK? ");
        String Qtwo = input.nextLine();
        Qtwo = Qtwo.toLowerCase();
        System.out.println(Qtwo.contains("london"));
        System.out.print("Q3 What is the capital of Italy? ");
        String Qthree = input.nextLine();
        Qthree = Qthree.toLowerCase();
        System.out.println(Qthree.contains("rome"));


    }
}
