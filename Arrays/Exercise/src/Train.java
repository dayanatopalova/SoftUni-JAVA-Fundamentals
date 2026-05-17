import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagonCount = Integer.parseInt(sc.nextLine());

        int[] wagons = new int[wagonCount];

        for(int wagon = 0; wagon < wagonCount; wagon++){

            int countPeople = Integer.parseInt(sc.nextLine());

            wagons[wagon] = countPeople;
        }

        int sum = 0;
        for (int people : wagons){
            System.out.print(people + " ");

            sum += people;
        }
    }
}
