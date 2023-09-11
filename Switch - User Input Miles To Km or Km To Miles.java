import java.util.Scanner;

public class KiloToMiles {
    public static void main(String[] args) {
        System.out.println("Hello User, You Can Convert Distance From:\n1. KiloMeter To Miles\n2. Miles To KiloMeter\n");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double inputValue;
        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                inputValue = sc.nextDouble();
                result = inputValue * 0.621371;
                System.out.println("KiloMeter To Miles: " + result);
                break;
            case 2:
                System.out.print("Enter distance in miles: ");
                inputValue = sc.nextDouble();
                result = inputValue * 1.60934;
                System.out.println("Miles To KiloMeter: " + result);
                break;
            default:
                System.out.println("Invalid choice. Please enter '1' for KiloMeter to Miles or '2' for Miles to KiloMeter.");
        }
    }
}
