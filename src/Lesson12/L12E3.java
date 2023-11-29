package Lesson12;
import java.util.*;
public class L12E3 {
    public static void displayCar(car thisCar){
        System.out.format("Make: %s %nModel: %s %nYear: %d %nVin: %s %nPrice: %d %nColour: %s %nMileage: %d %nCondition %s %n", thisCar.make, thisCar.model, thisCar.year, thisCar.vin, thisCar.price, thisCar.colour, thisCar.mileage, thisCar.condition);
    }
    public static void main(String[] args) {
        // create student object and display
        car car1 = new car();
        car1.make = "Ferrari";
        car1.model = "F430";
        car1.year = 2009;
        car1.vin = "3GYVKNEFXAG625569";
        car1.price = 55125;
        car1.colour = "White";
        car1.mileage = 45336;
        car1.condition = "Good";

        displayCar(car1);
        // update values of student object and display

    }
}
