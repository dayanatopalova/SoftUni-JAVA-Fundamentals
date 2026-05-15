import java.util.Scanner;

public class ReversedArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] texts = sc.nextLine().split(" ");

        for(int i = texts.length - 1; i >= 0; i--){
            System.out.print(texts[i] + " ");
        }
    }
}
