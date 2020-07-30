package module1.homework.Homework10;

import java.util.Scanner;

public class Counter {
    int current;

    public static int inc(int current){
        current+=current;
        return current;
    }

    public int getCurrent(){
        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current = scanner.nextInt();
        System.out.println(inc(current));
        Counter count = new Counter();
        System.out.println(count.getCurrent());
    }
}
