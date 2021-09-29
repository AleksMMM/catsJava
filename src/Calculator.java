import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите числа для операции");
        int one = scanner.nextInt();
        System.out.println("введите второе число");
        int two = scanner.nextInt();
        Double[] calculators = {    calc.getDel(one, two),
                                    calc.getSum(one, two),
                                    calc.getMin(one, two),
                                    calc.getYmn(one, two)
                                };

        for (Double in: calculators) {
            System.out.println(in);
        }

    }

    private double getSum(int param1, int param2) {
        return param1 + param2;
    }

    private double getMin(int param1, int param2) {
        return param1 - param2;
    }

    private double getDel(int param1, int param2) {
        double rsl = 0;
        if (param2 != 0) {
            rsl = (double) (param1 / param2);
        }
        return rsl;
    }

    private double getYmn(int param1, int param2) {
        return param1 * param2;
    }
}

