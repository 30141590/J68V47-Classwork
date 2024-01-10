package IP3;
import Lesson12.Student;

import java.io.*;
import java.util.*;
import java.math.*;
public class Hangman {

    public static int showMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hangman! Please choose an option by entering the corresponding number.");
        System.out.println("1. Easy Mode");
        System.out.println("2. Normal Mode");
        System.out.println("3. Advanced Mode");
        System.out.println("4. Exit");
        System.out.print("Select An Option: ");
        int selection = input.nextInt();
        return selection;
    }

    public static void option1() {
        Scanner input = new Scanner(System.in);
        String[] easyWords = {"are", "there", "more", "than", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "lost", "gain", "feel", "some", "what", "who"};
        int lives = 5;
        int score = 0;
        System.out.println("Hangman Easy Mode!");
        System.out.println("Here's your secret word: ");
        while (lives != 0 && score != 20){
            String word = easyWords[(int) (Math.random() * easyWords.length)];
            String[] wordArray = new String[word.length()];
            String[] wordCensor = new String[word.length()];
            for (int i = 0; i < word.length(); i++){
                wordArray[i] = word.substring(i);
                wordCensor[i] = "*";
            }
            for (int i = 0; i < wordArray.length; i++){
                System.out.print(wordCensor[i] + " ");
            }
            System.out.print("\nEnter Your guess: ");
            String guess = input.nextLine();
            if (List.contains)

        }

    }

    public static void main(String[] args) {
        int quit = 0;
        int Selection = 0;
        do {
            Selection = showMenu();
            if (Selection == 1) {
                option1();
            } else if (Selection == 2) {

            } else if (Selection == 3) {

            } else if (Selection == 4) {
                System.out.println("\nExiting Program\n");
                quit = 1;
            } else {
                System.out.println("\nThis is not a valid option. Try a number between 1-4.\n");
            }
        } while (quit == 0);
        }

    }

