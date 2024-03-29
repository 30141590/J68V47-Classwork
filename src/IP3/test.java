package IP3;
import java.util.*;
import java.io.*;

public class test {
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
        System.out.println(Word);
        for (int i = 0; i < Word.length(); i++){
            if (Guesses.contains(Word.charAt(i))){
                System.out.print(Word.charAt(i));
                count++;
            } else{
                System.out.print("-");
            }
        }

        System.out.println("");
        return (Word.length() == count);
    }
    public static void takeInput(String EasyWord, List<Character> Guesses){
        Scanner input = new Scanner(System.in);
        System.out.print("Guess A Letter: ");
        String GuessedLetter = input.nextLine();
        GuessedLetter = GuessedLetter.toLowerCase();
        Guesses.add(GuessedLetter.charAt(0));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String EasyWord = GetEasyWord();
        int Lives = 5;
        int Score = 0;

        List<Character> Guesses = new ArrayList<>();

        while(Lives != 0) {
            WordPrint(EasyWord, Guesses);
            takeInput(EasyWord, Guesses);

            if (WordPrint(EasyWord, Guesses)){
                System.out.println("you win");
                break;
            }
            System.out.print("Guess the word: ");
            if (input.nextLine().equalsIgnoreCase(EasyWord)){
                System.out.println("you win!");
                break;
            } else {
                Lives--;
                System.out.println("Wrong! You have " + Lives + " Lives remaining");
            }
        }
        System.out.println("you have lost, better luck next time");
    }
}
