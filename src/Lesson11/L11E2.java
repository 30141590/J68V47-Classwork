package Lesson11;
import java.io.*;
import java.util.*;
public class L11E2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(new FileReader("Output.txt"))){
            while (in.hasNextLine()){
                String text = in.nextLine();
                System.out.println(text);
            }
        } catch (IOException e){
            System.out.println("Error occurred reading file: "+e.toString());
        }
    }
}
