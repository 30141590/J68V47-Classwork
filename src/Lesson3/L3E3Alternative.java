package Lesson3;

import java.util.Scanner;

public class L3E3Alternative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: £");
        float Loan = input.nextFloat();
        System.out.print("Interest Rate (APR %): ");
        float APR = input.nextFloat();
        System.out.print("Number Of Years: ");
        float Years = input.nextFloat();

        float InterestRate = (APR/100);
        InterestRate = (InterestRate/12);
        float Months = (-1*(Years*12));
        double MonthlyPayment = (Loan * (InterestRate / (1 - (Math.pow((1 + InterestRate),Months)))));

        System.out.printf("Monthly repayments for this loan are: £%.2f%n", MonthlyPayment);

    }
}
