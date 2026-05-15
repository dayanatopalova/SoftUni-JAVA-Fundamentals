import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        boolean isBalanced = true;
        boolean hasOpeningBracket = false;

        for (int i = 0; i < n; i++) {
            String element = sc.nextLine();

            if (element.equals("(")) {

                if (hasOpeningBracket) {
                    isBalanced = false;
                }

                hasOpeningBracket = true;

            } else if (element.equals(")")) {

                if (!hasOpeningBracket) {
                    isBalanced = false;
                }

                hasOpeningBracket = false;
            }
        }

        if (hasOpeningBracket) {
            isBalanced = false;
        }

        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}