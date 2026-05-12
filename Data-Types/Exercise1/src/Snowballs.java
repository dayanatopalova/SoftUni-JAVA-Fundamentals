import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int snowballsAmount = Integer.parseInt(sc.nextLine());
        long maxValue = Long.MIN_VALUE;

        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;

        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for(int i = 1; i <= snowballsAmount; i++) {
            snowballSnow = Integer.parseInt(sc.nextLine());
            snowballTime = Integer.parseInt(sc.nextLine());
            snowballQuality = Integer.parseInt(sc.nextLine());

            long snowballValue = (long) Math.pow(( snowballSnow / snowballTime), snowballQuality);

            if(snowballValue > maxValue){
                maxValue = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %d (%d)", bestSnow, bestTime, maxValue, bestQuality);

    }
}
