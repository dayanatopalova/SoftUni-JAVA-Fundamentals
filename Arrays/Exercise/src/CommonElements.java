import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstRow = sc.nextLine();
        String secondRow = sc.nextLine();

        String [] firstArray = firstRow.split(" ");
        String [] secondArray = secondRow.split(" ");

        for(String element2 : secondArray){
            for(String element1 : firstArray){
                if(element2.equals(element1)){
                    System.out.print(element2 + " ");
                }
            }
        }
    }
}
