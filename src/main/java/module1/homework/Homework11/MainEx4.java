package module1.homework.Homework11;

public class MainEx4 {

    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;

        System.out.println(high.getLevelCode()>medium.getLevelCode());
    }
}
