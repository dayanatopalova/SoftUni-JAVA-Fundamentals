import java.sql.SQLOutput;
import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(sc.nextLine());
        int volume = 0;

        for(int i = 0; i < n; i++){
            int liters = Integer.parseInt(sc.nextLine());
            volume += liters;

            if(volume > capacity){
                System.out.println("Insufficient capacity!");
                volume -= liters;
            }
        }
        System.out.println(volume);
    }
}
