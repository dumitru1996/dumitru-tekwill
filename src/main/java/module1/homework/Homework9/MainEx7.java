package module1.homework.Homework9;

import java.util.Optional;

public class MainEx7 {

    public static void process(AccountEx7 account){
        try{
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println(account.getCode());
            System.out.println(account.getBalance());

            owner.ifPresent(o ->{
                System.out.println(o.getLogin());
                System.out.println(o.getFirstName());
                System.out.println(o.getLastName());
            });
        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }

    public static void main(String[] args) {
        User user = new User("demo-user","Alexander","Schmidt");
        AccountEx7 account = new AccountEx7("123456",1000,user);
        process(account);
    }
}
