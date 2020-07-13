package module1.homework;

import java.util.Scanner;

public class Homework7 {

    static Scanner scanner = new Scanner(System.in);

    public static void replaceAWithB(){
        System.out.println("1.Replacing 'a' with 'b' (medium)");
        System.out.print("Write some text: ");

        String input = scanner.nextLine();
        String output = input.replace("a", "b");

        System.out.println(output);
    }

    public static void containsBurg(){
        System.out.println("2.Check burgs (medium)");
        System.out.print("Write a city name: ");
        String cityName = scanner.nextLine();
        Boolean containsBurg = cityName.contains("burg");

        System.out.println(containsBurg);
    }

    public static void stringCompare(){
        System.out.println("3.Comparing strings ignoring whitespaces (hard)");
        System.out.print("String A: ");
        String a = scanner.nextLine();
        System.out.print("String B: ");
        String b = scanner.nextLine();
        boolean isEqual = false;

        if(a.trim().replace(" ", "").equals(b.trim().replace(" ", ""))){
            isEqual = true;
        } else {
            isEqual = false;
        }

        System.out.println(isEqual);
    }

    public static void convertDate(){
        System.out.println("4.Convert a date (medium)");
        System.out.print("Input date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();
        String[] formatedDate = inputDate.trim().split("-");

        System.out.println(formatedDate[1] + "/" + formatedDate[2] + "/" + formatedDate[0]);
    }

    public static void numberOfOccurrence(){
        System.out.println("5.Number of occurrences (medium)");
        System.out.print("Input your string: ");
        String inputText = scanner.nextLine();
        System.out.print("Input occurrence: ");
        String occurrence = scanner.nextLine();

        int occurrenceTimes = 0;
        String[] textArray = inputText.trim().split(" ");

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].contains(occurrence)){
                occurrenceTimes++;
            }
        }

        System.out.println(occurrenceTimes);
    }

//    Unfinished - cannot concat the las value
    public static void comparisonAlgorithm() {
        System.out.println("6.Compression algorithm (hard)");
        System.out.print("Introduce DNA code: ");

        String dna = scanner.nextLine();
        int sameCharGroup = 1;
        char temp;
        String convertedDNA = "";

        for (int i = 0; i < dna.length() - 1; i++) {
            temp = dna.charAt(i);
            if (temp == dna.charAt(i+1)){
                sameCharGroup++;
            }
            else {
                convertedDNA+= temp + "" + sameCharGroup;
                sameCharGroup = 1;
            }
        }

        System.out.print(convertedDNA);
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
