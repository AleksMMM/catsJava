package Arrays;

public class Task4 {
    public static void main(String[] args) {
        mmm(100);
    }

    public static void mmm(int m) {

        int[] ints = {5, 23, 45, 43, 12, 67};
        int count = 1;

        for (int i: ints) {
            if (i > m) {
                count = count * i;
            }
        }
        if (count == 1) {
            System.out.println("numbers no");
            return;
        }
        System.out.println(count);

    }
}
