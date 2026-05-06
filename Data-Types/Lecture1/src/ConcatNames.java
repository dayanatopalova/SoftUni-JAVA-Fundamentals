import java.sql.SQLOutput;
import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String name2 = sc.nextLine();
        String delimiter = sc.nextLine();

        System.out.print(name + delimiter + name2);
    }
}
