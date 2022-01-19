package d00.ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int request = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 42) {
                break;
            }
            if (isPrime(sumOfDigits(number))) {
                request++;
            }
        }
        System.out.println("Count of coffee - request - " + request);
    }

    public static int sumOfDigits(int number){
        int ret = 0;

        if (number < 0) {
            number *= -1;
        }
        for (; number > 0; number /= 10) {
            ret += number % 10;
        }
        return ret;
    }

    public static boolean isPrime(int number){
        int i = 1;
        boolean s = true;

        if ((number > 1) && (number <= 10000))
        {
            for (i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
