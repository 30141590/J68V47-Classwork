package IP3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class test4 {
    public static void HSCheck(int Score, File in) {
        try {
            // reads High Score from file and assigns it to a variable
            // converts the read contents to an integer
            Scanner input = new Scanner((in));
            String HSstring = input.nextLine();
            int HS = Integer.parseInt(HSstring);
            FileWriter writer = new FileWriter(in);

            // checks if achieved score is better than high score
            // if score is higher replaces high score
            if (Score > HS) {
                HS = Score;
                System.out.println("Congrats you set a new high score!");
            } else {
                System.out.println("Better luck next time.");
            }
            writer.write(Integer.toString(HS));
            writer.close();

        } catch (IOException e) {
            System.out.println("An error has occurred: " + e.toString());
        }
    }

    public static String GetWord(File in) {
        // initializes variable
        String Word = "";
        try {
            // initializes randomizer, scanner and word list
            Random Randomizer = new Random();
            Scanner input = new Scanner(in);
            List<String> Words = new ArrayList<>();

            // creates a while loop to read in contents from file
            // then adds them to the list
            while (input.hasNext()) {
                Words.add(input.nextLine());
            }

            // selects a random word from the list
            // then converts it to lower case
            Word = Words.get(Randomizer.nextInt(Words.size()));
            Word = Word.toLowerCase();

        } catch (IOException e) {
            System.out.println("An error has occurred: " + e.toString());
        }
        return Word;
    }

    public static boolean WordPrint(String Word, List<Character> Guesses) {
        // initialize variable
        int count = 0;

        // creates a for loop to check if any characters guessed are in the secret word
        // if so then prints the letter and if not prints a dash
        for (int i = 0; i < Word.length(); i++) {
            if (Guesses.contains(Word.charAt(i))) {
                System.out.print(Word.charAt(i));
                count++;
            } else {
                System.out.print("-");
            }
        }

        // prints previous letter guesses
        System.out.print("\nLetters you have already guessed: ");
        for (int i = 0; i < Guesses.size(); i++) {
            System.out.print(Guesses.get(i) + " ");
        }
        System.out.println(" ");

        // if the player has guessed all the letters returns true
        // if there are still hidden letters returns false
        return (Word.length() == count);
    }

    public static void takeInput(List<Character> Guesses) {
        // initialize scanner
        Scanner input = new Scanner(System.in);

        // takes input from user
        // converts input to lower case
        // only selects first letter of input in case user inputs multiple
        System.out.print("Guess A Letter: ");
        String GuessedLetter = input.nextLine();
        GuessedLetter = GuessedLetter.toLowerCase();
        Guesses.add(GuessedLetter.charAt(0));
    }

    public static void gamePlay(File Words, int option) {
        // initialize scanner and variables
        Scanner input = new Scanner(System.in);
        int Score = 0;
        int Lives = 7;

        // creates a while loop so the game continues until user runs out of lives
        while (Lives != 0) {
            // generates a random word based on the word file
            // creates a list for storing player guesses
            // resets lives back to 7
            String Word = GetWord(Words);
            List<Character> Guesses = new ArrayList<>();
            Lives = 7;

            // creates the game loop
            while (true) {
                // runs the procedures to display the secret word and take user input
                WordPrint(Word, Guesses);
                takeInput(Guesses);

                // if the user guesses all the letters before guessing the correct word
                // increases the user score then breaks out of the loop to generate a new word
                if (WordPrint(Word, Guesses)) {
                    System.out.println("You found all the right letters!");
                    Score++;
                    System.out.println("Your score is: " + Score);
                    break;
                }

                // asks the user to guess what the word is
                // if the user is successful increases score and breaks loop to generate new word
                // if the user is wrong decreases lives
                System.out.print("Guess the word: ");
                if (input.nextLine().equalsIgnoreCase(Word)) {
                    System.out.println("You guessed the word correctly!");
                    Score++;
                    System.out.println("Your score is: " + Score);
                    break;
                } else {
                    Lives--;
                    System.out.println("\nWrong! You have " + Lives + " Lives remaining\n");
                }

                // checks if the user has run out of lives
                // if they have no lives left, runs  the procedure for checking high score based on which difficulty
                // then displays the secret word and final score then breaks out of loop
                if (Lives == 0) {
                    if (option == 1) {
                        File EasyHS = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\easyHighScore.txt");
                        HSCheck(Score, EasyHS);
                    } else if (option == 2) {
                        File MedHS = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\medHighScore.txt");
                        HSCheck(Score, MedHS);
                    } else {
                        File AdvHS = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\advHighScore.txt");
                        HSCheck(Score, AdvHS);
                    }
                    System.out.println("\nGAME OVER!\n \nThe correct word was: " + Word + "\n \nYou scored " + Score + " Points");
                    break;
                }
            }
        }
    }

    public static String getHS(File in){
        // initializes variable
        String HS = "";

        // initializes scanner and stores data from file in a variable
        try {
            Scanner input = new Scanner(in);
            HS = input.nextLine();
        } catch(IOException e) {
            System.out.println("An error has occurred: " + e.toString());
        }
        return HS;
    }
    public static void main(String[] args) {

        // initializes variables and scanner
        int option = 0;
        Scanner input = new Scanner(System.in);

        // stores the high scores from the file as a variable
        File EasyHS = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\easyHighScore.txt");
        File MedHS = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\medHighScore.txt");
        File AdvHS = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\advHighScore.txt");
        String easyHS = getHS(EasyHS);
        String medHS = getHS(MedHS);
        String advHS = getHS(AdvHS);

        // creates menu loop and displays options
        do {
            System.out.println("Please Select a difficulty: ");
            System.out.println("1. Easy HS: " + easyHS);
            System.out.println("2. Medium HS: " + medHS);
            System.out.println("3. Advanced HS: " + advHS);
            System.out.println("4. Help");
            System.out.println("5. Quit");

            // initializes variable and begins input validation loop
            boolean flag = false;
            do {
                // takes input from user
                System.out.print("Input an option (1-5): ");
                String selection = input.nextLine();

                // checks if every character in the user input is a number
                // if the input is not a number, raises flag to take input again
                // if valid, the program continues
                for (int i = 0; i < selection.length(); i++) {
                    if (!Character.isDigit(selection.charAt(i))) {
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("\nThis is not a valid option. Try a number between 1 and 5\n");
                } else {

                    // turns user input from string to integer
                    option = Integer.parseInt(selection);
                }
            } while (flag);

            // depending on which option was selected by the user
            // option 1-3 runs the game with the easy, medium or advanced word set
            // option 4 displays some background information on hangman
            // option 5 ends the program
            if (option == 1) {
                File EasyWords = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\easyWords.txt");
                gamePlay(EasyWords, option);
            }else if (option == 2){
                File MedWords = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\medWords.txt");
                gamePlay(MedWords, option);
            }else if (option == 3){
                File AdvWords = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\advWords.txt");
                gamePlay(AdvWords, option);
            }else if (option == 4){
                System.out.println("\nHangman is an old kids game about guessing the letters in a word before you run out of lives. \nIt was originally played on " +
                        "a piece of paper where you would draw different parts of a person to signify lives lost. \nIn this version you have to input the letters " +
                        "to try complete the word or guess it in full before running out of lives.\n");
            } else if (option == 5){
                System.out.println("Goodbye!");

                // if the user selects a number outwith the menu range, asks for another input
            } else {
                System.out.println("\nThis isn't a valid option. Try a number between 1 and 4.\n");
            }

        } while (option != 5);
    }
}