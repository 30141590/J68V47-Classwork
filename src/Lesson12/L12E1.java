package Lesson12;

public class L12E1 {
    public static void displayStudent(Student thisStudent){
        System.out.format("(%d) %s %s, %b %n",thisStudent.id, thisStudent.firstName, thisStudent.surname, thisStudent.present);
    }
    public static void main(String[] args) {
        // create student object and display
        Student student1 = new Student();
        student1.firstName = "Callum";
        student1.surname = "Taylor";
        student1.id = 5837920;
        student1.present = true;
        displayStudent(student1);
        // update values of student object and display

    }
}
