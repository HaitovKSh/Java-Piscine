package d01.ex02;

public class User {
    private int id;
    private static int iteratorId = 1;
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
        this.id = UserIdsGenerator.getInstance().generateId();;
    }


    public int getBalance() {
        return  balance;
    }

    public void setBalance(int balance) {
        this.balance = ((balance > 0) ? balance : 0);
    }

    public void incBalance(int amount) {
        this.balance += amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
