package d00.d01.ex00;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Mike", 300);
        User user2 = new User("John", 500);
        User user3 = new User("Ilon", 0);
        User user4 = new User("Mike", -200);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        Transaction tr1 = new Transaction(user1, user3, -125);
        Transaction tr2 = new Transaction(user2, user4, -500);
        Transaction tr3 = new Transaction(user1, user3, -300);
        Transaction tr4 = new Transaction(user2, user4, 300);
        Transaction tr5 = new Transaction(user3, user4, 100);
        Transaction tr6 = new Transaction(user1, user3, 15);
        System.out.println(tr1);
        System.out.println(tr2);
        System.out.println(tr3);
        System.out.println(tr4);
        System.out.println(tr5);
        System.out.println(tr6);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}
