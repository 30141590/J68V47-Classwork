package IP3;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class test2 {

    public static String GetEasyWord() {
        String Word = "";
        try {
            Random Randomizer = new Random();
            Scanner input = new Scanner(new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\easyWords.txt"));

            List<String> EasyWords = new ArrayList<>();
            while (input.hasNext()) {
                EasyWords.add(input.nextLine());
            }
            Word = EasyWords.get(Randomizer.nextInt(EasyWords.size()));
            Word = Word.toLowerCase();

        } catch (IOException e) {
            System.out.println("An error has occurred: " + e.toString());
        }
        return Word;
    }

    public static boolean WordPrint(String Word, List<Character> Guesses){
        int count = 0;
        for (int i = 0; i < Word.length(); i++){
            if (Guesses.contains(Word.charAt(i))){
                System.out.print(Word.charAt(i));
                count++;
            } else{
                System.out.print("-");
            }
        }
        System.out.print("\nLetters you have already guessed: ");
        for (int i = 0; i < Guesses.size(); i++){
            System.out.print(Guesses.get(i) + " ");
        }
        System.out.println(" ");
        return (Word.length() == count);
    }

    public static void takeInput(List<Character> Guesses){
        Scanner input = new Scanner(System.in);
        System.out.print("Guess A Letter: ");
        String GuessedLetter = input.nextLine();
        GuessedLetter = GuessedLetter.toLowerCase();
        Guesses.add(GuessedLetter.charAt(0));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Please Select a difficulty: ");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");
            System.out.println("4. Help");
            System.out.println("5. Quit");

            boolean flag;
            do {
                flag = false;
                System.out.print("Input an option (1-4): ");
                String selection = input.nextLine();
                for (int i = 0; i < selection.length(); i++) {
                    if (!Character.isDigit(selection.charAt(i)))
                        flag = true;
                }
                if (flag) {
                    System.out.println("This is not a valid input\n");
                } else {
                    option = Integer.parseInt(selection);
                }
            } while (flag);
            if (option == 1){
                int Lives = 5;
                int Score = 0;

                while (Lives != 0) {
                    String EasyWord = GetEasyWord();
                    List<Character> Guesses = new ArrayList<>();
                    Lives = 5;
                    while (true) {
                        WordPrint(EasyWord, Guesses);
                        takeInput(Guesses);

                        if (WordPrint(EasyWord, Guesses)) {
                            System.out.println("You found all the right letters!");
                            Score++;
                            System.out.println("Your score is: " + Score);
                            break;
                        }
                        System.out.print("Guess the word: ");
                        if (input.nextLine().equalsIgnoreCase(EasyWord)) {
                            System.out.println("You guessed the word correctly!");
                            Score++;
                            System.out.println("Your score is: " + Score);
                            break;
                        } else {
                            Lives--;
                            System.out.println("\nWrong! You have " + Lives + " Lives remaining\n");
                        }
                        if (Lives == 0){
                            System.out.println("GAME OVER!\n \nThe correct word was: " + EasyWord + "\n \nYou scored " + Score + " Points");
                            break;
                        }
                    }
                }
            } else if (option == 2){
                System.out.println("The time is now.");
            } else if (option == 3){
                System.out.println("Knock knock. Who's there? ....... long pause ........ Java");
            } else if (option == 4){
                System.out.println("\nHangman is an old kids game about guessing the letters in a word before you run out of lives. \nIt was originally played on " +
                        "a piece of paper where you would draw different parts of a person to signify lives lost. \nIn this version you have to input the letters " +
                        "to try complete the word or guess it in full before running out of lives.\n");
            } else if (option == 5){
                System.out.println("Goodbye!");
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 4.");
            }
        } while (option != 5);

    }

}
