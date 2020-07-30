package module1.homework.Homework10;

import java.util.Scanner;

public class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

    public void any(){
        System.out.println("Hello, my name is " + name +", I need a doctor.");
    }

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Patient's name: ");
        String name= scanner.nextLine().trim();
        Patient patient = new Patient(name);
        patient.any();
    }
}
