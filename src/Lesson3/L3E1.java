package Lesson3;

import java.util.*;

public class L3E1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("First Name: ");
        String Fname = input.nextLine();
        System.out.print("Surname: ");
        String Sname = input.nextLine();
        System.out.print("Birth Year: ");
        Integer Byear = input.nextInt();

        String Fletter = Fname.substring(0,1);
        Fletter = Fletter.toUpperCase();
        String Sname2 = Sname.toLowerCase();
        String Username = (Fletter + Sname2);

        String Sletter = Sname.substring(0,1);
        Sletter = Sletter.toLowerCase();
        String ThreeName = Fname.substring(0,3);
        ThreeName = ThreeName.toUpperCase();
        String Password = (Sletter + ThreeName + Byear);

        System.out.println("Username: " + Username);
        System.out.println("Password: " + Password);
    }
}
