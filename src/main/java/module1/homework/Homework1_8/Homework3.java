package module1.homework.Homework1_8;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        //Exercice 1
        int a = 3;
        int b = 5;
        int c = 4;
        System.out.println(a + " " + b + " " + c);

        //Exercice 2
        int a1 = 512343;
        long b1 = 3431231L;
        System.out.println(a1 + b1);

        //Exercice 3
        int variable = 123456;
        System.out.println(variable);


        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a2 = scanner.nextInt();
        System.out.print("\nb = ");
        int b2 = scanner.nextInt();
        System.out.print("\nc = ");
        int c2 = scanner.nextInt();
        System.out.println(a2 + b2 ==20 || a2 + c2 == 20 || b2 + c2 == 20);



    }

}
