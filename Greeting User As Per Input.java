import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi,\nWhat's Your Name:- ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // Read a string input from the user
        System.out.println("Hello " + name + ", Have A Good Day!");
    }
}
