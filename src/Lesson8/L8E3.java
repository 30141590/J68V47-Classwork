package Lesson8;
import java.util.*;
public class L8E3 {

    public static String[] setupDirections(){
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };
        return directions;
    }
    public static String[] addToStringArray(String[] oldArray, String newString, int pos) {
        String[] newArray = new String[oldArray.length + 1];

        for (int count = 0; count < newArray.length; count++){
            if (count < pos){
                newArray[count] = oldArray[count];
            } else if (count == pos-1){
                newArray[count] = newString;
            } else {
                newArray[count] = oldArray[count - 1];
            }
        }
        return newArray;
    }
    public static String[] removeLastElement(String[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length - 1);
    }
    public static void print(String[] directions){
        int step = 1;
        for(String direction : directions) {
            System.out.format("%d. %s %n",step,direction);
            step ++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Set up the directions array
        String[] directions = setupDirections();
        print(directions);
        // set the new step and its position in the array
        String newString = "After turning onto Elm Street, walk past the grocery store on your right.";
        int pos = 5;
        // add the new step to the array then print
        directions = addToStringArray(directions, newString, pos);
        print(directions);
        // remove the last step from the array then print
        directions = removeLastElement(directions);
        print(directions);
        // ask the user if they want to add new directions
        System.out.print("would you like to add more directions (Y/N): ");
        String ans = input.nextLine();
        if (ans.equalsIgnoreCase("Y")){
            System.out.print("Enter the new directions: ");
            String inputString = input.nextLine();
            System.out.print("Which Step should this be: ");
            int Step = input.nextInt();
            System.out.println("");
            directions = addToStringArray(directions, inputString, Step);
            print(directions);
        } else if (ans.equalsIgnoreCase("N")){
        } else {
            System.out.println("this is an invalid input please try again.");
        }
    }

}
