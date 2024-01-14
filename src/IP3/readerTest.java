package IP3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class readerTest {
    public static void main(String[] args) {
        int Score = 10;
        File EasyHS = new File("C:\\Users\\notsl\\IdeaProjects\\J68V47-Classwork\\src\\IP3\\easyHighScore.txt");
        HSCheck(Score, EasyHS);


    }
    public static void HSCheck(int Score, File in) {
        int HS = 0;
        String HSstring = "";
        try {
            Scanner input = new Scanner((in));
            HSstring = input.nextLine();
            HS = Integer.parseInt(HSstring);
            FileWriter writer = new FileWriter(in);

                if (Score > HS){
                    HS = Score;
                    System.out.println("Congrats you set a new high score!");
                    writer.write(Integer.toString(HS));
                    writer.close();
                } else{
                    System.out.println("Better luck next time.");
                    writer.write(Integer.toString(HS));
                    writer.close();
                }

        } catch (IOException e) {
            System.out.println("An error has occurred: " + e.toString());
        }
    }
}
