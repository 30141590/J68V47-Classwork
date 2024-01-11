package Lesson11;
import java.io.*;
import java.util.*;
public class L11E1 {
    public static int NumGet(){
        Scanner input = new Scanner(System.in);
        System.out.print("Which number do you want to see the times table of: ");
        int Num = input.nextInt();
        return Num;
    }
    public static void main(String[] args) {
        int Num = NumGet();
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("output.txt"));
            for (int count = 1; count <= 12; count++){
                int Sum = Num*count;
                out.println(Num+" x "+count+" = "+Sum);
            }
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }finally{
            if (out != null){
                try{
                    out.close();
                } catch (Exception ce){
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }
    }
}
