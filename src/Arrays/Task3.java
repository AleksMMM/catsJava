package Arrays;

public class Task3 {

    public static void main(String[] args) {
        new Task3().sumFive();
    }

    public void sumFive() {

        int[] i = { 4, 40, 20, 7, 19};
        int count = 0;

        for (int j = 0; j < i.length; j++) {

            if (i[j] % 5 == 0) {
                count = count + i[j];
            }
        }
        System.out.println(count);
    }
}
