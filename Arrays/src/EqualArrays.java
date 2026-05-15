import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] firstArray= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] secondArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        boolean isIdentical = true;
        int diffIndex = 0;

        for(int i =0; i <= firstArray.length - 1; i++){

            if(firstArray[i] == secondArray[i]){
                sum += firstArray[i];

            } else {
                isIdentical = false;
                diffIndex = i;
                break;
            }

        }

        if(isIdentical){
            System.out.println("Arrays are identical. Sum: " + sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }
    }
}
