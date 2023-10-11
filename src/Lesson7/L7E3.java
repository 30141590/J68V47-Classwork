package Lesson7;

import java.util.*;

public class L7E3 {
    public static int easyRand() {
        int Num = (int) (Math.random() * (10 - 2 + 1) + 2);
        return Num;
    }

    public static int hardRand() {
        int Num = (int) (Math.random() * (100 - 2 + 1) + 2);
        return Num;
    }

    public static int askQuestion(int None, int Ntwo, int answer) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + None + "x" + Ntwo + "?");
        int Response = input.nextInt();
        return Response;
    }

    public static int RightAnswer(int Score) {
        Score++;
        System.out.println("\nCorrect!\n");
        return Score;
    }

    public static int WrongAnswer(int answer, int Lives) {
        Lives--;
        System.out.println("\nIncorrect");
        System.out.println("You have " + Lives + "/3 lives remaining\n");
        return Lives;
    }
    public static void GameOver(int Score, int Lives){
        if (Lives == 0) {
            System.out.println("You ran out of lives.");
        }
        System.out.println("Your final score was: " + Score + "/10");
        if (Lives == 3) {
            System.out.println("Well Done!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Score = 0;
        int Lives = 3;
        int count = 10;
        System.out.println("Times Table Quiz: ");
        System.out.print("Enter 1 for easy Quiz and 2 for hard Quiz: ");
        int Difficulty = input.nextInt();
        while (count >= 1 && Lives != 0) {
            if (Difficulty == 1) {
                int None = easyRand();
                int Ntwo = easyRand();
                int Answer = (None * Ntwo);
                int Response = askQuestion(None, Ntwo, Answer);
                if (Response == Answer) {
                    Score = RightAnswer(Score);
                } else {
                    Lives = WrongAnswer(Answer, Lives);
                }
                count--;


            } else if (Difficulty == 2) {
                    int None = hardRand();
                    int Ntwo = hardRand();
                    int Answer = (None * Ntwo);
                    int Response = askQuestion(None, Ntwo, Answer);
                    if (Response == Answer) {
                        Score = RightAnswer(Score);
                    } else {
                        Lives = WrongAnswer(Answer, Lives);
                    }
                    count--;

            } else {
                System.out.print("Please select 1 or 2: ");
                Difficulty = input.nextInt();
            }
        }
        GameOver(Score, Lives);
        }
    }



