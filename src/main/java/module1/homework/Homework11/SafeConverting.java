package module1.homework.Homework11;

import java.util.Scanner;

public class SafeConverting {

    public static int convert(Long val){
        if(val==null){
            return 0;
        }if(val>Integer.MAX_VALUE){
            int maxIntVal = Integer.MAX_VALUE;
            return maxIntVal;
        } if(val<Integer.MIN_VALUE){
            int minIntVal = Integer.MIN_VALUE;
            return minIntVal;
        }else
            return val.intValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }

}
