import java.util.Scanner;

public class WhileAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter < 10) {
            System.out.println("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }

        int average = total / gradeCounter;

        System.out.printf("%nTotal of all %s grades is %d%n", gradeCounter, total );
        System.out.printf("Class avarage is %d%n", average);
    }
}
