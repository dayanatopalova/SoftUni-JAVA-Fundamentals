import java.util.Arrays;
import java.util.Scanner;

public class NumbersInReversedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[n];

        for(int i = 0; i <= numbers.length - 1; i++){
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
