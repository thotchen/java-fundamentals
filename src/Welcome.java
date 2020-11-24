import java.util.Arrays;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args)
    {
//        System.out.println(Arrays.toString(args));

        if (args.length > 0 ) {
            System.out.println("args = " + Arrays.deepToString(args));
            System.out.printf("Hello %s%n", args[0]);
        }
        Scanner input = new Scanner(System.in);

        int number1, number2, sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("%d + %d = %d%n%n", number1, number2, sum);

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
    }
}