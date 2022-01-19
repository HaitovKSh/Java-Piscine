package d00.ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        boolean s = true;

        if (n < 2)
        {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        else
        {
            for (i = 2; i * i <= n; i++)
            {
                if (n % i == 0)
                {
                    s = false;
                    break;
                }
            }
            System.out.println(s + " " + --i);
        }
    }
}
