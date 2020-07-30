package module1.homework.Homework11;

import java.util.Scanner;

public class MainEx6 {
    public static double calculateTriangleArea(int a, int b, int c){
        double p = (a+b+c)/2.0;
        double s = Math.sqrt(p-(p-a)*(p-b)*(p-c));

        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("6.Heron's formula (medium)");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        System.out.println(calculateTriangleArea(a,b,c));
    }
}
