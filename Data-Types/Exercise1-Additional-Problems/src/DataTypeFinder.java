import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (!input.equals("END")) {

            // Boolean
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.println(input + " is boolean type");

                // Integer
            } else {
                boolean isInteger = true;
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if (c < '0' || c > '9') {
                        if (!(i == 0 && c == '-')) {
                            isInteger = false;
                            break;
                        }
                    }
                }
                if (isInteger && input.length() == 1 && input.charAt(0) == '-') {
                    isInteger = false;
                }

                if (isInteger) {
                    System.out.println(input + " is integer type");

                    // Floating point
                } else {
                    boolean isFloat = true;
                    int dotCount = 0;
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        if (c == '.') {
                            dotCount++;
                        } else if (c < '0' || c > '9') {
                            if (!(i == 0 && c == '-')) {
                                isFloat = false;
                                break;
                            }
                        }
                    }
                    if (dotCount != 1) {
                        isFloat = false;
                    }

                    if (isFloat) {
                        System.out.println(input + " is floating point type");

                        // Character
                    } else if (input.length() == 1) {
                        System.out.println(input + " is character type");

                        // String
                    } else {
                        System.out.println(input + " is string type");
                    }
                }
            }

            input = sc.nextLine();
        }
    }
}