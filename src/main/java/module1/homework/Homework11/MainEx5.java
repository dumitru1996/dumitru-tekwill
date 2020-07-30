package module1.homework.Homework11;

public class MainEx5 {
    public static int enumStartsWithStar(){
        int count = 0;

        for(Secret val : Secret.values()){
            if (val.toString().startsWith("STAR")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(enumStartsWithStar());
    }
}
