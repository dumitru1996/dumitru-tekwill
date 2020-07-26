package module1.homework;

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












    public static void main(String args[]){

//        Ex1
//        System.out.print("1. Integer part of a number (medium)\n input double: ");
//        double d = scanner.nextDouble();
//        System.out.println(extractInt(d));

//        Ex2
//        System.out.println("2. Vowel or not (medium)\ninput char: ");
//        char letter = scanner.nextLine().charAt(0);
//        System.out.println(isVowel(letter) ? "YES" : "NO");

//        Ex3
        System.out.println("2. Vowel or not (medium)\ninput number: ");
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));


    }
}
