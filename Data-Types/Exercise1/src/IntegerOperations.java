import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());
        int number3 = Integer.parseInt(sc.nextLine());
        int number4 = Integer.parseInt(sc.nextLine());

        System.out.println((((number1 + number2) / number3)) * number4);

    }
}
