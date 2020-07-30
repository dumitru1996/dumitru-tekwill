package module1.homework.Homework1_8;

import java.util.Scanner;

public class Homework7 {

    static Scanner scanner = new Scanner(System.in);

//    Exercise1
    public static void replaceAWithB(){
        System.out.println("1.Replacing 'a' with 'b' (medium)");
        System.out.print("Write some text: ");

        String input = scanner.nextLine();
        String output = input.replace("a", "b");

        System.out.println(output);
    }

//    Exercise2
    public static void containsBurg(){
        System.out.println("2.Check burgs (medium)");
        System.out.print("Write a city name: ");
        String cityName = scanner.nextLine();
        String subBurg  = cityName.trim().toLowerCase().substring(cityName.length()-4,cityName.length());
        boolean containsBurg = subBurg.equals("burg");
        System.out.println(containsBurg);
    }

//    Exercise3
    public static void stringCompare(){
        System.out.println("3.Comparing strings ignoring whitespaces (hard)");
        System.out.print("String A: ");
        String a = scanner.nextLine();
        System.out.print("String B: ");
        String b = scanner.nextLine();
        boolean isEqual = a.trim().replace(" ", "")
                .equals(b.trim().replace(" ", ""));

        System.out.println(isEqual);
    }

//    Exercise4
    public static void convertDate(){
        System.out.println("4.Convert a date (medium)");
        System.out.print("Input date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();
        String[] formatedDate = inputDate.trim().split("-");

        System.out.println(formatedDate[1] + "/" + formatedDate[2] + "/" + formatedDate[0]);
    }

//    Exercise5
    public static void numberOfOccurrence(){
        System.out.println("5.Number of occurrences (medium)");
        System.out.print("Input your string: ");
        String inputText = scanner.nextLine();
        inputText.toLowerCase();
        System.out.print("Input occurrence: ");
        String occurrence = scanner.nextLine();

        int occurrenceTimes = (inputText.length() -
                inputText.replace(occurrence,"").length()) /occurrence.length();

        System.out.println(occurrenceTimes);
    }

//    Exercise6
    public static void comparisonAlgorithm() {
        System.out.println("6.Compression algorithm (hard)");
        System.out.print("Introduce DNA code: ");

        String dna = scanner.nextLine();
        int sameCharGroup = 0;
        char temp = dna.charAt(0);

        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == temp){
                sameCharGroup++;
            }
            else {
                System.out.print(temp + sameCharGroup);
                sameCharGroup = 1;
                temp = dna.charAt(i);
            }
        }
        System.out.print(temp + sameCharGroup);
    }

    public static void main(String args[]){
        replaceAWithB();
        containsBurg();
        stringCompare();
        convertDate();
        numberOfOccurrence();
        comparisonAlgorithm();
    }
}