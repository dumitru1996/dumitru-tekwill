package module1.homework.Homework1_8;

import java.util.Arrays;
import java.util.Scanner;

public class Homework8 {
    public static Scanner scanner = new Scanner(System.in);


//    Ex1
    public static int extractInt(double d){
        int intPart;
        intPart =  (int) d;

        return intPart;
    }

//    Ex2
    public static boolean isVowel(char ch){
        boolean  isVowel;

        if(ch =='A' || ch =='a' || ch =='E' || ch =='e' || ch =='I' || ch =='i' || ch =='O' ||
                ch =='o' || ch =='U' || ch =='u'){
            isVowel = true;
        } else {
            isVowel = false;
        }

        return isVowel;
    }

//    Ex3
    public static long factorial(long n){

        long result = 1;

        if (n==0){
            result = 1;
        } if(n<0){
            System.out.print("number cannot be negative!");
        } else {
            int i =1;
            while (i!=n+1){
                result = result*i;
                i++;
            }
        }
        return result;
    }

//    Ex6
    public static long getMaxMinusCurrent(long val){
        return Long.MAX_VALUE-val;
    }

    public static int getMaxMinusCurrent(int val){
        return Integer.MAX_VALUE-val;
    }

    public static short getMaxMinusCurrent(short val){
        return (short) (Short.MAX_VALUE-val);
    }

//    Ex7
    public static void sort(int[] numbers){
        int temp = 0;

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-1-i; j++) {
                if(numbers[j]>numbers[j+1]){
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

//    Ex8
    public static void addValueByIndex(long[] array,int index, long value){
        array[index] += value;
    }

    public static void main(String args[]){

//        Ex1
        System.out.print("1. Integer part of a number (medium)\n input double: ");
        double d = scanner.nextDouble();
        System.out.println(extractInt(d));

//        Ex2
        System.out.println("2. Vowel or not (medium)\ninput char: ");
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");

//        Ex3
        System.out.println("2. Vowel or not (medium)\ninput number: ");
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));

//        Ex4
        System.out.println("Hello, Java!");

//        Ex5
        System.out.println("We are robots!");

//        Ex6
        System.out.println("6.Overloading methods (hard)\nEnter type: ");
        final String type = scanner.nextLine();
        switch (type.trim().toLowerCase()){
            case "long":
                System.out.print("Enter "+ type + " value: ");
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                System.out.print("Enter "+ type + " value: ");
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            case "short":
                System.out.print("Enter "+ type + " value: ");
                final short shortVal = Short.parseShort(scanner.nextLine());
                final short shortResult = getMaxMinusCurrent(shortVal);
                System.out.println(shortResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }

//        Ex7
        System.out.println("7.Sorting numbers (medium)");
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));

//        Ex8
        System.out.println("8.Adding values (medium)");
        System.out.print("Enter array: ");
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong).toArray();
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        System.out.println("Enter adding value: ");
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e ->System.out.print(e + " "));
    }
}
