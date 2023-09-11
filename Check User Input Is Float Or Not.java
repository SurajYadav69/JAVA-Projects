import java.util.Scanner;

public class IsProjectIsIntegerOrNot {
    public static void main(String[] args) {
        System.out.println("In This Program You Will Get to Know Is Your input Is Float Or Not:- \n");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextFloat()) {
            float n = sc.nextFloat();
            System.out.println("Yes, Your input is a float: " + n);
        } else {
            System.out.println("No, Your input is not a float");
        }
    }
}
