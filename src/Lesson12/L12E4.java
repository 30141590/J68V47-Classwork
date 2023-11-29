package Lesson12;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L12E4 {
    public static int getPrice(){
        Scanner input = new Scanner(System.in);
        System.out.print("what is your budget? ");
        int maxPrice = input.nextInt();
        return maxPrice;
    }
    public static int getMileage(){
        Scanner input = new Scanner(System.in);
        System.out.print("what is your mileage limit? ");
        int maxMileage = input.nextInt();
        return maxMileage;
    }
    public static String getCondition(){
        Scanner input = new Scanner(System.in);
        System.out.print("what condition would you like your car to be in? (Excellent, Good, Fair, Poor) ");
        String condition = input.nextLine();
        System.out.println("------------------------------------------------");
        return condition;
    }
    public static ArrayList<car> loadFile(String filename){
        List<String> studentDetails;
        ArrayList<car> thisClass = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                studentDetails = Arrays.asList(line.split(","));
                car newCar = new car();
                newCar.make = studentDetails.get(0);
                newCar.model = studentDetails.get(1);
                newCar.year = Integer.parseInt(studentDetails.get(2));
                newCar.vin = studentDetails.get(3);
                newCar.price = Integer.parseInt(studentDetails.get(4));
                newCar.colour = studentDetails.get(5);
                newCar.mileage = Integer.parseInt(studentDetails.get(6));
                newCar.condition = studentDetails.get(7);
                thisClass.add(newCar);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return thisClass;
    }

    public static void displayCar(car thisCar){
        // note the slight change to this procedure
        System.out.format("%s %s (%d) %nVin: %s %nColour: %s %nMileage: %d %nCondition %s %nPrice: %d %n", thisCar.make, thisCar.model, thisCar.year, thisCar.vin, thisCar.colour, thisCar.mileage, thisCar.condition, thisCar.price);
        System.out.println("------------------------------------------------");
    }
    public static void main(String[] args) {
        // load file contents into an array of student objects
        ArrayList<car> thisClass = loadFile("src/Lesson12/carSales.txt");
        // loop for all objects and show details
        int maxPrice = getPrice();
        int maxMileage = getMileage();
        String condition = getCondition();
        for(int i=0;i<thisClass.size();i++){
            car thisCar = thisClass.get(i);
            // show details for this student
            if (thisCar.price < maxPrice && thisCar.mileage < maxMileage && thisCar.condition.equalsIgnoreCase(condition)){
                displayCar(thisCar);
            }
        }
    }
}

