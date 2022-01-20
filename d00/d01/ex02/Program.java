package d00.d01.ex02;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        UsersArrayList users = new UsersArrayList();

        int max_usrs = (int)(Math.random() * 150 + 15);
        System.out.println("Generating " + max_usrs + " users.");
        for (int i = 0; i < max_usrs; i++) {
            User tmp;
            if (i % 2 == 0) {
                tmp = new User("Man " + i, i);
            }	else {
                tmp = new User("Woman " + i, i);
            }
            users.addUser(tmp);
        }

        System.out.println("User in the middle of array: " + users.getUserByIndex(max_usrs / 2));
        System.out.println("User with id 15: " + users.getUserByID(15));
        System.out.println("Total capacity: " + users.getNumUsers());
    }
}
