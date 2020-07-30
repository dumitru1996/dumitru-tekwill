package module1.homework.Homework9;

import java.util.Scanner;

public class FullName {

    public static String prepareFullName(String firstName, String lastName){
        if(firstName==null && lastName!=null){
            return lastName;
        }if(lastName==null && firstName !=null){
            return firstName;
        }if(firstName!=null && lastName!=null){
            return firstName + " " + lastName;
        } else {
            return "Both strings are null";
        }
    }

    public static void main(String args[]){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : firstName;
        System.out.println(prepareFullName(firstName, lastName));
    }
}