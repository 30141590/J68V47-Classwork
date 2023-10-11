package Lesson7;
import java.util.*;
public class Extra1 {
    public static int getNum(){
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        return Num;
    }
    public static void plus(int x, int y){
        int Num = x+y;
        System.out.println(x+" + "+y+" = "+Num);
    }
    public static void minus(int x, int y){
        int Num = x-y;
        System.out.println(x+" - "+y+" = "+Num);
    }
    public static void times(int x, int y){
        int Num = x*y;
        System.out.println(x+" x "+y+" = "+Num);
    }
    public static void divide(int x, int y){
        int Num = x/y;
        System.out.println(x+" ÷ "+y+" = "+Num);
    }
    public static void power(int x, int y){
        double Num = Math.pow(x, y);
        System.out.println(x+"^"+y+" = "+Num);
    }
    public static void exit(){
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to continue? (Y/N)");
        String y = input.nextLine();
        int x = 0;
        while (x = 0){
            if (y.equalsIgnoreCase("y")){

            }

        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quit = 0;
        System.out.println("Basic Calculator");
        System.out.print("Enter the first number: ");
        int None = getNum();
        System.out.print("Enter the second number: ");
        int Ntwo = getNum();
        while (quit == 0) {
            System.out.print("What operation do you want performed (+, -. x, /, ^): ");
            String Operator = input.nextLine();
            if (Operator.equals("+")) {
                plus(None, Ntwo);
            } else if (Operator.equals("-")) {
                minus(None, Ntwo);
            } else if (Operator.equals("/")) {
                divide(None, Ntwo);
            } else if (Operator.equals("x")) {
                times(None, Ntwo);
            } else if (Operator.equals("^")) {
                power(None, Ntwo);
            } else {
                System.out.println("Please enter a valid operator (+, -. x, /, ^)");
            }
        }



    }
}
