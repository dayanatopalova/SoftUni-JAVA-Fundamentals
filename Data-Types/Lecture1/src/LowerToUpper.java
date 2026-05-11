import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.nextLine().charAt(0);

        if(Character.isUpperCase(letter)){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }
    }
}
