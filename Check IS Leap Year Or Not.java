import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Here You will get to know is your entry year is leap year or not:- \n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%4==0 && n%100 == 0) {
         if (n % 400!= 0)   {
             System.out.println("its leap Year");
         }
        }
        else{
            System.out.println("Its not leap year");
        }
    }
}

//If the year is divisible by 4 and 100 but not by 400, it's not a leap year
