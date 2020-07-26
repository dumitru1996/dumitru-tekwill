package module1.classwork;
import java.util.*;

public class Classwor7 {


    public static long sumInRange(int a, int b){

        long sum=a;

        for (int i = a+1; i<b;i++){
            sum+=i;
        }

        return sum;
    }
    public static int[] getFirstAndLast(int[] array){
        int[] returnArr = new int[2];
        returnArr[0] = array[0];
        returnArr[1] = array[array.length-1];

        return returnArr;

    }

    public static void main(String[] args) {
//        System.out.println(sumInRange(10,15));
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt) .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));

    }
}
