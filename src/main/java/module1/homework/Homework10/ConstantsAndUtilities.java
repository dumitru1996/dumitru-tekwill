package module1.homework.Homework10;

public class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";
    public static final String B_CONSTANT_QQQ = "7890";

    public static String getaConstantTtt() {
        return A_CONSTANT_TTT;
    }

    public static String getbConstantQqq() {
        return  B_CONSTANT_QQQ;
    }

    public static String getMagicString(){
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }

    public static void main(String[] args) {
        System.out.println(getaConstantTtt());
        System.out.println(getbConstantQqq());
        System.out.println(getMagicString());
        System.out.println(convertStringToAnotherString("aa"));
    }
}
