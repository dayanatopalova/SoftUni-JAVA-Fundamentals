import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialPower = Integer.parseInt(sc.nextLine());
        int power = initialPower;
        int distance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());

        int pokedTarget = 0;

        while(power >= distance){
            power -= distance;

            pokedTarget++;

            int halfPower = initialPower / 2;
            if(power == halfPower && exhaustionFactor != 0){
                power /= exhaustionFactor;
            }
        }

        System.out.println(power);
        System.out.println(pokedTarget);
    }
}
