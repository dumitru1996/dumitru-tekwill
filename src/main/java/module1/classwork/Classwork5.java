package module1.classwork;

import java.util.Scanner;

public class Classwork5 {

    static Scanner scanner = new Scanner(System.in);

    public static void largestNumber(){
        int largest=0;
        int input =1;
        while (input != 0){
            input = scanner.nextInt();
            if(input> largest){
                largest =input;
            }
        }
        System.out.println(largest);
    }


    public static void integerBarrier(){
        int var = scanner.nextInt();
        int sum = var;
        while (var != 0 ){
            if(sum>=1000){
                sum-=1000;
                break;
            }
            var = scanner.nextInt();
            sum+=var;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        largestNumber();
        integerBarrier();

    }
}
