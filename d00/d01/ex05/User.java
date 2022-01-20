package d00.d01.ex05;

public class User {
    private int id;
    private String name;
    private int balance;

    public User(String name, int balance) {
        setName(name);
        setBalance(balance);
        setId();
    }

    public User(String name, int balance, int id) {
        setName(name);
        setBalance(balance);
        setId(id);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setId() {
        this.id = 0xff;
    }


    public int getBalance() {
        return  balance;
    }

    public void setBalance(int balance) {
        this.balance = ((balance > 0) ? balance : 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
