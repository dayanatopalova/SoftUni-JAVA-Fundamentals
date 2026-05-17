import java.util.Arrays;
import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countRows = Integer.parseInt(sc.nextLine());

        int [] firstArray = new int[countRows];
        int [] secondArray = new int[countRows];

        for(int row = 1; row <= countRows; row++){
            String input = sc.nextLine();

            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if(row % 2 == 1){
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;

            }else{
                secondArray[row - 1] = firstNumber;
                firstArray[row - 1] = secondNumber;
            }
        }

        //Arrays.stream(firstArray)
               // .forEach(System.out::print);

        for(int number : firstArray){
            System.out.print(number + " ");
        }
    }
}
