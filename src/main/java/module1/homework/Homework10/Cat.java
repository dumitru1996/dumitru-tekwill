package module1.homework.Homework10;

public class Cat {
    private String name;
    private int age;
    private static int counter=0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter>5){
            System.out.println("You have to many cats");
        }
    }

    public static int getNumberOfCats(){
        return counter;
    }

    public static void main(String[] args) {
        Cat firstCat = new Cat("1",2);
        Cat second = new Cat("2",9);
        Cat third = new Cat("3",6);
        Cat anotherCat = new Cat("4",5);
        Cat fourf = new Cat("5",1);
        Cat sixth = new Cat("6",2);
        Cat seventh = new Cat("7",3);

        System.out.println( getNumberOfCats());
    }
}