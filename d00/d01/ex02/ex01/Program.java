package d00.d01.ex02.ex01;

public class Program {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            User tmp;
            if (i % 2 == 0) {
                tmp = new User("Man", i);
            }	else {
                tmp = new User("Woman", i);
            }
            System.out.println("User number: '" + i + "', id: '" + tmp.getId() + "';");
        }
    }
}
