import java.util.*;
public class L2E3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name of item 1: ");
        String NameOne = input.nextLine();
        System.out.print("Enter the price of the " + NameOne + ": ");
        float FirstNum = input.nextFloat();

        System.out.print("Enter the Name of item 2: ");
        String NameTwo = input.nextLine();
        NameTwo = input.nextLine();
        System.out.print("Enter the price of the " + NameTwo + ": ");
        float SecNum = input.nextFloat();

        System.out.print("Enter the Name of item 3: ");
        String NameThree = input.nextLine();
        System.out.print("Enter the price of the " + NameThree + ": ");
        float ThirdNum = input.nextFloat();

        float Subtotal = (FirstNum+SecNum+ThirdNum);

        System.out.println(" ");
        System.out.println("NESMART");
        System.out.println(" ");

        System.out.format(NameOne + "..........£%.2f%n", FirstNum);
        System.out.format(NameTwo + "..........£%.2f%n", SecNum);
        System.out.format(NameThree + "..........£%.2f%n", ThirdNum);
        System.out.format("SUBTOTAL..........£%.2f%n", Subtotal);






    }
}
