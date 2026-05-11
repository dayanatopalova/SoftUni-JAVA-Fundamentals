import java.util.Scanner;

public class PrintAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startCode = Integer.parseInt(sc.nextLine());
        int endCode = Integer.parseInt(sc.nextLine());

        for (int code = startCode; code <= endCode; code++){

            char symbol = (char) code;

            System.out.print(symbol + " ");
        }
    }
}
