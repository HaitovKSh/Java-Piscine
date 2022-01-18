package d00.ex05;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = getStudents(scanner);

    }
    public static String[] getStudents(Scanner scanner) {
        String[] students = new String[10];
        String inp = scanner.nextLine();
        for (int i = 0; !inp.equals(".") && i < 10 ; i++) {
            students[i] = inp;
            inp = scanner.nextLine();
        }
        return students;
    }
    public static void getLessons() {

    }

}
