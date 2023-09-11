import java.util.Scanner;
import java.util.Calendar;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the current date and year from the system
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH) + 1; // Adding 1 because January is 0
        int currentDate = cal.get(Calendar.DATE);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter your birth day of the month: ");
        int birthDay = scanner.nextInt();

        // Calculate the age in years, months, and days
        int ageYears = currentYear - birthYear;
        int ageMonths = currentMonth - birthMonth;
        int ageDays = currentDate - birthDay;

        // Adjust age if birthdate hasn't occurred yet this year
        if (ageMonths < 0 || (ageMonths == 0 && ageDays < 0)) {
            ageYears--;
            ageMonths = 12 - Math.abs(ageMonths);
            ageDays = Math.abs(ageDays);
        }

        // Display the result
        System.out.println("Your age is: " + ageYears + " years, " + ageMonths + " months, and " + ageDays + " days");

        scanner.close();
    }
}
