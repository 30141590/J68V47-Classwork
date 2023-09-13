package Lesson2;

import java.util.*;
public class L2E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("choose a whole number between 1 and 10: ");
        int FirstNum = input.nextInt();

        System.out.print("choose another whole number between 1 and 10: ");
        int SecNum = input.nextInt();
        System.out.println(" ");
        double Exponent = Math.pow(FirstNum,SecNum);
        int TwoD = (int) Exponent;

        System.out.println(FirstNum + "+" + SecNum + " = " + (FirstNum+SecNum));
        System.out.println(FirstNum + "-" + SecNum + " = " + (FirstNum-SecNum));
        System.out.println(FirstNum + "x" + SecNum + " = " + (FirstNum*SecNum));
        System.out.println(FirstNum + "÷" + SecNum + " = " + (FirstNum/SecNum));
        System.out.println(FirstNum + "^" + SecNum + " = " + TwoD);

    }
}
