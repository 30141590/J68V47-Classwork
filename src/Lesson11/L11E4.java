package Lesson11;

import java.util.*;
import java.io.*;
import java.lang.*;

public class L11E4 {
    public static void checker(Scanner in1, Scanner in2){
        boolean match = true;
        try {
            int quit = 0;
            while (in1.hasNextLine() && quit == 0){
                String text = in1.nextLine();
                String text2 = in2.nextLine();
                if (!text.equals(text2) || !in2.hasNextLine()){
                    quit = 1;
                    match = false;
                }
            }
            if (match){
                System.out.println("The Files Match.");
            }else{
                System.out.println("The Files Do Not Match.");
            }
        } catch (Exception e){
            System.out.println("Error occurred reading file: "+e.toString());
        }
    }
    public static void main(String[] args) {
        PrintWriter doc1 = null;
        PrintWriter doc2 = null;
        PrintWriter doc3 = null;
        try {
            doc1 = new PrintWriter(new FileWriter("doc1.txt"));
            doc2 = new PrintWriter(new FileWriter("doc2.txt"));
            doc3 = new PrintWriter(new FileWriter("doc3.txt"));
            for (int count = 1; count <= 12; count++) {
                doc1.println(count*2);
                doc2.println(count*2);
                doc3.println(count*3);
            }
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        } finally {
            if (doc1 != null) {
                try {
                    doc1.close();
                } catch (Exception ce) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
            if (doc2 != null) {
                try {
                    doc2.close();
                } catch (Exception ce) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
            if (doc3 != null) {
                try {
                    doc3.close();
                } catch (Exception ce) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }
        try {
            Scanner in1 = new Scanner(new FileReader("doc1.txt"));
            Scanner in2 = new Scanner(new FileReader("doc2.txt"));
            Scanner in3 = new Scanner(new FileReader("doc3.txt"));
            checker(in1, in2);
            checker(in1, in3);
            checker(in3, in2);
        } catch(Exception e){
            System.out.println("Error occurred reading file: "+e.toString());
        }
    }
}
