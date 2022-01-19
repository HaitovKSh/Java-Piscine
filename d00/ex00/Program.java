package d00.ex00;

public class Program {
    public static void main(String[] args) {
        int number = 479598;
        int ret = 0;

        if (number < 0) {
            number *= -1;
        }
        ret += number % 10;
        number /= 10;
        ret += number % 10;
        number /= 10;
        ret += number % 10;
        number /= 10;
        ret += number % 10;
        number /= 10;
        ret += number % 10;
        number /= 10;
        ret += number % 10;
        System.out.println(ret);
    }
}
