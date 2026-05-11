import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(sc.nextLine());

        String modelMaxVolume = "";
        double volume = 0;


        for (int i = 0; i < numberOfKegs; i++){

            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            double height = Double.parseDouble(sc.nextLine());

            double currentVolume = Math.PI * Math.pow(radius, 2) * height;

            if(currentVolume > volume){
                volume = currentVolume;
                modelMaxVolume = model;
            }
        }
        System.out.println(modelMaxVolume);
    }
}
