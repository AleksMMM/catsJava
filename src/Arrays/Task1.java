package Arrays;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[5];
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
            if (ints[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
