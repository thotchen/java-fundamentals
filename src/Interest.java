public class Interest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit"); //%20s puts string in 20 char column

        for ( int year = 1; year <=10; year++){
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount); //%,20.2f 20 char column , at 1000s to 2 decimal places
        }
    }
}
