package Lesson11;
import java.io.*;
import java.util.*;
public class L11E3 {
    public static int NumGet(){
        Scanner input = new Scanner(System.in);
        System.out.print("Pick a whole number: ");
        int Num = input.nextInt();
        return Num;
    }
    public static void main(String[] args) {
        int Num = NumGet();
        PrintWriter result = null;
        try {
            result = new PrintWriter(new FileWriter("result.txt"));
            for (int count = 1; count <= 12; count++){
                int Sum = Num*count;
                result.println(Sum);
            }
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }finally{
            if (result != null){
                try{
                    result.close();
                } catch (Exception ce){
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }
        try (Scanner in = new Scanner(new FileReader("result.txt"))){
            double num = 0;
            while (in.hasNextLine()){
                String res = in.nextLine();
                double res2 = Double.parseDouble(res);
                num = num + res2;
            }
            System.out.format("The sum is: %.0f", num);
        } catch (IOException e){
            System.out.println("Error occurred reading file: "+e.toString());
        }
    }
}



