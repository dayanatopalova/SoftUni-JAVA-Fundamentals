import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yield = Integer.parseInt(sc.nextLine());
        int days = 0;
        int extracted = 0;

        while(yield >= 100){
            extracted += yield - 26;
            yield -= 10;
            days++;
        }

        if (extracted >= 26) {

            extracted -= 26;

        } else {

            extracted = 0;
        }

        System.out.println(days);
        System.out.println(extracted);
    }
}
