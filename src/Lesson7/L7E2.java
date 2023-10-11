package Lesson7;
import java.util.*;
public class L7E2 {
    public static int numGet(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number: ");
        int Number = input.nextInt();
        return Number;
    }
    public static int calculateSum(int x, int  y){
        int Sum = x+y;
        return Sum;
    }

    public static void main(String[] args) {
        int x = numGet();
        int y = numGet();
        int Sum = calculateSum(x, y);
        System.out.println("The sum of "+x+" and "+y+" is "+Sum);

    }
}
