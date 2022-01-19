package d00.ex03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inpWeek = 0;
        long allGrade = 0;
        String inpText = scanner.nextLine();

        while (!inpText.equals("42") && inpWeek < 19){
            inpWeek++;
//        for (inpWeek = 1; !inpText.equals("42") && inpWeek < 19; inpWeek++) {
            if (!(inpText.equals("Week " + inpWeek))) {
                illegalArg();
            }
            allGrade *= 10;
            allGrade += minGrade(scanner);
            if (inpWeek == 18 || inpText.equals("42")) {
                break;
            }
            inpText = scanner.nextLine();
        }
        printGrade(allGrade, inpWeek);
    }

    public static int minGrade(Scanner scanner) {
        int min = 10;

        for (int i = 0; i < 5; i++) {
            int subNum = scanner.nextInt();
            min = (subNum < min) ? subNum : min;
            if (min < 1 || subNum > 9) {
                illegalArg();
            }
        }
        scanner.nextLine();
        return min;
    }

    public static void printGrade(long allGrade, int weeks) {
        for (int i = 1; i <= weeks; i++) {
            int gradePerWeek = ((int)(allGrade / pow(10, weeks - i) % 10));
            System.out.print("Week " + i + " ");
            printGraph(gradePerWeek);

        }
    }

    public static void printGraph(int grade) {
        for (int i = 0; i < grade; i++) {
            System.out.print("=");
        }
        System.out.println(">");
    }

    public static void illegalArg() {
        System.out.println("IllegalArgument");
        System.exit(-1);
    }

    public static long pow(long num, int pow) {
        long ret = 1;
        if (pow == 0) {
            return 1;
        } else {
            for (int i = 0; i < pow; i++) {
                ret *= num;
            }
        }
        return ret;
    }
}
