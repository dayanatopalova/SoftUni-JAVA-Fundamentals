import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstSymbol = sc.nextLine().charAt(0);
        char secondSymbol = sc.nextLine().charAt(0);
        char thirdSymbol = sc.nextLine().charAt(0);

        String result = "" + firstSymbol + secondSymbol + thirdSymbol;

        System.out.println(result);

    }
}
