import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.getSum(1, 4));

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите числа для операции");
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        Double[] calculators = {calc.getDel(one, two),
                                    calc.getSum(one, two),
                                    calc.getMin(one, two),
                                    calc.getYmn(one, two)
                                };

        System.out.println(calculators[0]);

    }

    public double getSum(int param1, int param2) {
        return param1 + param2;
    }

    public double getMin(int param1, int param2) {
        return param1 - param2;
    }

    public double getDel(int param1, int param2) {
        double rsl = 0;
        if (param2 != 0) {
            rsl = (double) (param1 / param2);
        }
        return rsl;
    }

    public double getYmn(int param1, int param2) {
        return param1 * param2;
    }
}

