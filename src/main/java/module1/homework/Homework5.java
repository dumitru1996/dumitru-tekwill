package module1.homework;

import java.util.Scanner;

public class Homework5 {

    static Scanner scanner = new Scanner(System.in);

//    Exercise1
    public static void healthySleep(){
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
//    Exercise2
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

//    Exercise3
    public static void chocolate(){
        System.out.println("3. Chocolate (hard)");

        System.out.println("Length: ");
        int n = scanner.nextInt();
        System.out.println("Width: ");
        int m = scanner.nextInt();
        System.out.println("Exact pieces: ");
        int k = scanner.nextInt();

        if (k <= n * m && (k % n == 0 && k >= n || k % m == 0 && k >= m)){
            System.out.println("Yes");
        } else {
            System.out.println("Nope");
        }


    }

//    Exercise4
    public static void harryPotter(){

        System.out.println("4.Harry Potter (medium)");
        String house = scanner.nextLine();

        if ("gryffindor".equals(house)) {
            System.out.println("bravery");
        } else if ("hufflepuff".equals(house)) {
            System.out.println("loyalty");
        } else if ("slytherin".equals(house)) {
            System.out.println("cunning");
        } else if ("ravenclaw".equals(house)) {
            System.out.println("intellect");
        } else {
            System.out.println("not a valid house");
        }
    }

//    Exercise5
    public static void theRoom(){
        System.out.println("5. Floor-space of the room (hard)");
        String type = scanner.nextLine();
        double a, b, c;

        if ("triangle".equals(type)) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            double s = (a + b + c) / 2;
            double x = s * (s - a) * (s - b) * (s - c);
            System.out.println(Math.sqrt(x));
        } else if ("rectangle".equals(type)) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(a * b);
        } else if ("circle".equals(type)) {
            double r = scanner.nextDouble();
            System.out.println(3.14 * Math.pow(r, 2));
        } else {
            System.out.println("Figure " + type + " is not yet supported!");
        }
    }

//    Exercise6
    public static void direction(){
        System.out.println("6. Direction (medium)");

        int dir = scanner.nextInt();
        System.out.println("insert values from 0 to 4");

        switch (dir){
            case 1:
                System.out.println("up");
                break;
            case 2:
                System.out.println("down");
                break;
            case 3:
                System.out.println("left");
                break;
            case 4:
                System.out.println("right");
                break;
            case 0:
                System.out.println("don't move");
                break;
            default:
                System.out.println("invalid value");
                direction();
        }
    }

//    Exercise7
    public static void fizzBuzz(){
        System.out.println("7. Fizz Buzz (medium)");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if((a%3==0) && (b%5==0)){
            System.out.println("FizzBuzz");
        } if ((a%3==0) && (b%5!=0)){
            System.out.println("Fizz");
        }if ((a%3!=0) && (b%5==0)){
            System.out.println("Buzz");
        } else {
            System.out.println("nope");
        }
    }

//    Exercise8
    public static void product(){
        System.out.println("8.The product of numbers from a to b (hard)");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int prod = 1;

        if(a>=b){
            System.out.println("B supposed to be greater than A");
            product();
        } else {
            for(int i = a;i<=b; i++){
                prod *= a;
            }
        }

        System.out.println(prod);
    }


    public static void main(String[] args) {
        healthySleep();
        theArmyOfUnits();
        chocolate();
        harryPotter();
        theRoom();
        direction();
        fizzBuzz();
        product();

    }
}
