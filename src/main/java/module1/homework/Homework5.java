package module1.homework;

import java.util.Scanner;

public class Homework5 {

    static Scanner scanner = new Scanner(System.in);

//    Exercise1
    public static void healtySleep(){
        System.out.println("1. Healthy sleep (medium)");

        System.out.print("Minimm hours per day: ");
        int A = scanner.nextInt();
        System.out.print("Maximum hours per day: ");
        int B = scanner.nextInt();
        System.out.print("How many hours slept Anna: ");
        int H = scanner.nextInt();

        if(H>=A && H<=B){
            System.out.println("Normal");
        }if (H>B){
            System.out.println("Excess");
        } if(H<A){
            System.out.println("Deficiency");
        }
    }

//    Exercise2
    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        if (i >= minValueInclusive && i <= maxValueInclusive)
            return true;
    else
            return false;
    }
    public static void theArmyOfUnits(){
        System.out.println("2. The army of units (medium)");

        System.out.println("How many soldiers do you have?");
        int soldairsNo = scanner.nextInt();

        if(soldairsNo<=0){
            System.out.println("No army");
        } if (between(soldairsNo, 1,19)){
            System.out.println("Pack");
        } if (between(soldairsNo,20,249)){
            System.out.println("Throng");
        } if (between(soldairsNo,  250,999)){
            System.out.println("Zoubds");
        } if (soldairsNo>=1000){
            System.out.println("Legion");
        } else {
            theArmyOfUnits();
        }
    }

    public static void main(String[] args) {
//        healtySleep();
        theArmyOfUnits();

    }
}
