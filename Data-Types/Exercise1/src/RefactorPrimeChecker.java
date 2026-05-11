import java.util.Scanner;

public class RefactorPrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = Integer.parseInt(sc.nextLine());

        for (int number = 2; number <= n; number++) {

            boolean isPrime = true;

            for (int divider = 2; divider < number; divider++) {

                if (number % divider == 0) {

                    isPrime = false;

                    break;

                }
            }

            System.out.printf("%d -> %b%n", number, isPrime);
        }
    }
}
