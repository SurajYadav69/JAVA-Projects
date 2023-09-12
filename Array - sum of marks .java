//creat an array of 5 float and calculate their sum


import java.util.Scanner;
public class ArrayCreat5FloatAndSumCAl {
    public static void main(String[] args) {
        float [] marks = new float[5];
        System.out.println("You have total 5 subject now entre marks one by one:- ");
        Scanner sc = new Scanner(System.in);
        System.out.println("First Subject Marks:- ");
        marks[0] = sc.nextFloat();
        System.out.println("Second Subject Marks:- ");
        marks[1] = sc.nextFloat();
        System.out.println("Third Subject Marks:- ");
        marks[2] = sc.nextFloat();
        System.out.println("Fourth Subject Marks:- ");
        marks[3] = sc.nextFloat();
        System.out.println("Fifth Subject Marks:- ");
        marks[4] = sc.nextFloat();

        float sum = 0;
        for(float mark: marks){
            sum+= mark;
        }

        System.out.println("Sum Of MArks Is:- "+ sum);





    }
}
