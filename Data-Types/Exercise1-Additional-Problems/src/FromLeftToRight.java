import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = sc.nextLine().split(" ");

            long left = Long.parseLong(input[0]);
            long right = Long.parseLong(input[1]);

            long biggerNumber;

            if (left > right) {
                biggerNumber = left;
            } else {
                biggerNumber = right;
            }

            long sum = 0;
            biggerNumber = Math.abs(biggerNumber);

            while (biggerNumber > 0) {
                sum += biggerNumber % 10;
                biggerNumber /= 10;
            }

            System.out.println(sum);
        }
    }
}