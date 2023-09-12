import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        System.out.print("Enter Search Element: ");
        int[] array = {10, 11, 82, 78, 89, 78, 45, 96, 78, 25, 36, 74, 58};
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == tar) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The Element Found here.");
        } else {
            System.out.println("ERROR!! Element is not in array.");
        }
    }
}
