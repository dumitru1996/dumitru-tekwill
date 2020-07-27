package module1.homework.Homework9_10;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("4.Binary search (medium)");
        System.out.print("Add values in array separated by space: ");
        String[] numbers = scanner.nextLine().split("\\s+");
        int[] array = java.util.Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        System.out.print("Index for which element do you need to find?  ");
        int elem = scanner.nextInt();
        System.out.println(java.util.Arrays.binarySearch(array,elem));
    }
}
