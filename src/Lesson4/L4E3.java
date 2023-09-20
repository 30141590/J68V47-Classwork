package Lesson4;
import java.util.*;

public class L4E3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Shipping = 0;
        System.out.print("Enter your total purchase value: £");
        double Total = input.nextDouble();
        if (Total < 50){
            Shipping = 10;
            System.out.println("Your Shipping charge is: £" + Shipping);
            Total = Total+Shipping;
            System.out.print("Your final total is £" + Total);
        } else {
            System.out.println("Your Shipping is free!");
            System.out.print("Your Final total is: £" + Total);
        }

    }
}
