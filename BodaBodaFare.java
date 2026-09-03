 import java.util.Scanner;

public class BodaBodaFare {
    public static void main(String[] args) {

        final double BASE_FARE = 2000;
        final double RATE_PER_KM = 500;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance travelled in km: ");
        double distance = input.nextDouble();

        double totalFare = BASE_FARE + (RATE_PER_KM * distance);

        System.out.println("Your fare for " + distance + " km is UGX " + totalFare);

        input.close();
    }
}
