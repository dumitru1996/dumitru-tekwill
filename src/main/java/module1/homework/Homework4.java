package module1.homework;

import java.util.Scanner;

public class Homework4 {
    static Scanner scanner = new Scanner(System.in);
    //Exercise1
    public static void fourNumbers(){
        System.out.println("1. Reading integer numbers (medium)");
        int[] array = new int[4];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
//    Exercise2
    public static void squirrelAndNuts(){
        System.out.println("2. How many nuts each squirrel will get (medium)");
        int limit = 10000;
        System.out.print("Number of squirrels: ");
        int squirrels = scanner.nextInt();
        System.out.print("Number of nuts: ");
        int nuts = scanner.nextInt();
        if(squirrels>= limit || nuts >= limit ){
            System.out.println("The number could not be more that " + limit);
            squirrelAndNuts();
        } else {
            int result = nuts / squirrels;
            System.out.print(" each squirrel will get " + result + " nuts");
        }
    }
//    Exercise3
    public static void sumOfDigits(){
        System.out.println("4. Snail (hard)");
        System.out.print("Enter a number from 100 to 999 - ");
        int num = scanner.nextInt();
        if(num<100 || num>999){
            System.out.println("number supposet to be between 100 and 999");
            sumOfDigits();
        }else {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            System.out.println("Sum of digits is " + sum);
        }
    }

//  Exercise 4
    public static void snail(){
        System.out.println("4. Snail (hard)");
        System.out.print("Height: ");
        int H = scanner.nextInt();
        System.out.print("Number of feet up per day: ");
        int A = scanner.nextInt();
        System.out.print("Number of feet down per day: ");
        int B = scanner.nextInt();
        if(H<0 || A <0 || B<0){
            System.out.println("The numbers supposed to be positive");
            snail();
        }if (H<B || A<B){
            System.out.println("Height and feet Up per day supposed to be higher than feet Down per day");
            snail();
        } else{
            int dayReach = (H - A) / (A - B) + 1;
            boolean rest = ((H - A) % (A - B) > 0);
            int restInt = rest ? 1 : 0;
            dayReach+=restInt;
            System.out.println("The snail wiil reach the height in " + dayReach + " days");
        }
    }

//    Exercise5
    public static void distance(){
        System.out.println("5. Distance (easy)");
        System.out.println("Distance between cities: ");
        double dist = scanner.nextDouble();
        System.out.println(" Travel time by bus in hours: ");
        double time = scanner.nextDouble();
        double average = dist/time;
        String str = String.format("%.02f", average);
        System.out.println("The average speed of a bus is " + str +" km/h");
    }

//    Exercice6
    public static void differenceBetweenTwoDoubles(){
        System.out.println("6. Difference between two doubles (medium)");
        System.out.println("a= ");
        double a = scanner.nextDouble();
        System.out.println("b= ");
        double b = scanner.nextDouble();
        System.out.println("Difference between a and b is " + (b-a));
    }

//    Exercice7
    public static void checkTheValue(){
        System.out.println("7. Check the value (medium)");
        int value = scanner.nextInt();
        boolean bool = value < 10 && value >0;
        System.out.println(bool);
    }

//    Exercise8
    public static void numbersAreDifferent(){
        System.out.println("8. Check the given numbers are different (medium)");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean bool = a !=b && a != c && b!=c;
        System.out.println(bool);
    }

//    Exercise9
    public static void exactlyOnePositive(){
        System.out.println("9.Exactly one parameter is positive");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        boolean onlyFirst = a > 0 && b <= 0 && c <= 0;
        boolean onlySecond = a <= 0 && b > 0 && c <= 0;
        boolean onlyThird = a <= 0 && b <= 0 && c > 0;

        boolean bool = onlyFirst || onlySecond || onlyThird;
        System.out.println(bool);
    }

    public static void main(String[] args) {
        fourNumbers();
        squirrelAndNuts();
        sumOfDigits();
        snail();
        distance();
        differenceBetweenTwoDoubles();
        checkTheValue();
        numbersAreDifferent();
        exactlyOnePositive();
    }
}
