import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for(int i = 1; i <= n; i++){

            char letter = sc.nextLine().charAt(0);

            sum += (int) letter;
        }

        System.out.println("The sum equals: " + sum);
    }
}
