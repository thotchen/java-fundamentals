import java.util.Scanner;

public class SentinelAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;

        System.out.printf("Enter grade (or -1 to quit): ");
        int grade = input.nextInt();

        while (grade != -1) {
            total += grade;
            gradeCounter++;

            System.out.printf("Enter grade (or -1 to quit): ");
            grade = input.nextInt();
        }

        if ( gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("%nAverage is %.2f%n", average);
        } else {
            System.out.printf("%nNo grades were entered");
        }


        System.out.printf("");


    }
}
