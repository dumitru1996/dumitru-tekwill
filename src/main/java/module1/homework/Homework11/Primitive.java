package module1.homework.Homework11;

public class Primitive {

    public static boolean toPrimitive(Boolean b){
        if (b==null){
            return false;
        }else {
            boolean value = b.booleanValue();
            return value;
        }
    }


    public static void main(String args[]){
        Boolean b= null;
        Boolean b1= true;
        Boolean b2 = false;
        System.out.println(toPrimitive(b));
        System.out.println(toPrimitive(b1));
        System.out.println(toPrimitive(b2));
    }



}
