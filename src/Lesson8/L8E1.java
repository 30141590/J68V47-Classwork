package Lesson8;
import java.util.*;
public class L8E1 {
    public static String[] appendArray(String[] oldArray, String name){
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length] = name;
        oldArray = newArray;
        return newArray;
    }
    public static void print(String[] classmates){
        if (classmates.length == 1){
            System.out.println(classmates[0]);
        } else {
            System.out.println(classmates[0]);
            System.out.println(classmates[classmates.length-1]);
            System.out.format("The number of people in the class is: %d",classmates.length);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int end = 0;
        int arrayL = 0;
        String[] Students = {"List Is Empty."};
        while (end == 0){
            System.out.print("Please enter the students name. When finished type \"end\": ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("end")){
                end = 1;
            } else if (arrayL == 0){
                Students[0] = name;
                arrayL++;
            } else {
                Students = appendArray(Students, name);
            }
        }
        print(Students);
    }
}
