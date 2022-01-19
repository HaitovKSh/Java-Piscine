package d01.ex00;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Mike", 300);
        User user2 = new User("John", 500);
        User user3 = new User("Mike", -200);
        User user4 = new User("Ilon", 0);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}
