package module1.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
    static Scanner scanner = new Scanner(System.in);

//    Exercise1
    public static void charsArray(){
        System.out.println("1.Initializing an array of characters (easy)");

        char[] characters = new char[] {'a', 'z', 'e', 'd'};
        System.out.println(Arrays.toString(characters));
    }

//    Exercise2
    public static void integerArray(){
        System.out.println("2.Initializing an array of integers (easy)");

        int[] numbers = new int[] {12, 17, 8, 101, 33};
        System.out.println(Arrays.toString(numbers));
    }

//    Exercise3
    public static void sumArrayElems(){
        int sum = 0;

        System.out.println("3.Sum array elements greater than a value (medium)");

        System.out.print("Number of elements: ");
        int len = scanner.nextInt();

        int[] arr = new int[len];
        System.out.println("Insert values in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Sum elements greater than? - ");
        int n = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>n){
                sum +=arr[i];
            }
        }
        System.out.println(sum);
    }

//    Exercise4
    public static void longestAscendingSequence(){
        int count = 1;
        int max =0;
        System.out.println("4.The longest ascending sequence (hard)");

        System.out.print("Number of elements: ");
        int len = scanner.nextInt();

        int[] arr = new int[len];
        System.out.println("Insert values in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1]){
                count++;
                max = count;
            } else {
                if(max<count){
                    max = count;
                }
                count=1;
            }
        }
        System.out.println(max);
    }

//    Exercise5
    public static void fillMatrix(){
        System.out.println("5. Fill the matrix by numbers (medium)");

        System.out.print(" Matrix size(nxn): ");
        int n = scanner.nextInt();
        boolean firstZero = false;
        int start = 0;
        int[][] matrix = new int[n][n];

        if(n>0 || n <100){
            for (int i = 0; i <matrix.length ; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if(j==0){

                        matrix[i][j] = start;
                        start++;

                    } else if (i>=1 && j >=1){

                        if(matrix[i][j-1]!=0 && !firstZero){
                            matrix[i][j] = matrix[i][j-1] - 1;
                        }
                        if (matrix[i][j-1] == 0){
                            matrix[i][j] = matrix[i][j-1] + 1;
                            firstZero = true;
                        }
                        if (firstZero){
                            matrix[i][j] = matrix[i][j-1] + 1;
                        }
                        if (j == matrix.length - 1){
                            firstZero = false;
                        }
                    }
                    else {
                        matrix[i][j] = j;
                    }
                }
            }
        }
        else {
            System.out.println("The number supposed to greater than 0 and lower than 100");
            fillMatrix();
        }

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

//    Exercise6
    public static void prettyLookingPattern(){
        System.out.println("6.Pretty looking pattern (hard)");

        char[][] charMatrix = new char[4][4];
        String a;
        int isPretty = 0;

        for (int i = 0; i <charMatrix.length ; i++) {
            System.out.print("Enter line " + (i+1) + " from matrix: ");
            a = scanner.nextLine();
            if(a.length()==4){
                for (int j = 0; j < charMatrix.length; j++) {
                    charMatrix[i][j] = a.charAt(j);
                }
            } else {
                System.out.println("The line supposed to have 4 characters");
                prettyLookingPattern();
            }
        }

        for (int i = 0; i <charMatrix.length ; i++) {
            for (int j = 0; j <charMatrix.length ; j++) {
                System.out.print(charMatrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i <charMatrix.length-1 ; i++) {
            for (int j = 0; j <charMatrix.length-1 ; j++) {
                if(charMatrix[i][j]==charMatrix[i][j+1] &&
                        charMatrix[i][j]==charMatrix[i+1][j] &&
                        charMatrix[i][j]==charMatrix[i+1][j+1]){

                    isPretty++;

                }
            }
        }
        System.out.print("\nIs that 4x4 matrix Pretty? - ");
        if(isPretty==0){
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }

    public static void main(String[] args) {

        charsArray();
        integerArray();
        sumArrayElems();
        longestAscendingSequence();
        fillMatrix();
        prettyLookingPattern();

    }
}
