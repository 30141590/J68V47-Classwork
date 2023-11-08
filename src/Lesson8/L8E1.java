package Lesson8;
import java.util.*;
public class L8E1 {
    public static void print(){
        String[] classmates = {"Noah", "Oliver", "Cameron", "Connor", "Luke"};
        System.out.println(classmates[0]);
        System.out.println(classmates[classmates.length-1]);
        System.out.format("The number of people in the class is: %d",classmates.length);
    }
    public static void main(String[] args) {
        print();
    }
}
