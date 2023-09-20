package Lesson4;

import java.util.Scanner;

public class L4E1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.print("first Name: ");
            String Fname = input.nextLine();
            System.out.print("Surname: ");
            String Sname = input.nextLine();
            System.out.print("total Value Of Order: £");
            double Value = input.nextDouble();
            System.out.print("Deposit: £");
            double Deposit = input.nextDouble();
                String Username = (Fname.substring(0,1) + " " + Sname);
                double Remainder = (Value-Deposit);
                System.out.println("Customer 1: " + Username);
                System.out.printf("Order Total: £%.2f%n", Value);
                System.out.printf("Deposit Paid: £%.2f%n", Deposit);
                System.out.printf("Remainder: £%.2f%n", Remainder);
                if (Deposit > 100) {
                    System.out.println("You get a free toaster!");
                }
                System.out.println("Have a nice day!");
    }
}
