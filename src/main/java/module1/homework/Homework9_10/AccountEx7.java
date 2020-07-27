package module1.homework.Homework9_10;

import java.util.Optional;

public class AccountEx7 {
    private String code;
    private  long balance;
    private User owner;

    public AccountEx7(String code, long balance, User owner) {
        this.code = code;
        this.balance = balance;
        this.owner = owner;
    }

    public String getCode() {
        return code;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}
