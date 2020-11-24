import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account("");

        System.out.printf("Initial name is : %s%n%n Please enter new name : ", myAccount.getName());
        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.printf("%nName in object myAccount is: %n%s%n", myAccount.getName());

        Account account1 = new Account("Donald Trump");
        Account account2 = new Account("Joe Biden");

        System.out.printf("account1 name is %s%n", account1.getName());
        System.out.printf("account2 name is %s%n", account2.getName());

        Account account3 = new Account("Money Bags", 1000000.0);

        System.out.printf("account4 balance is £%.2f%n", account3.getBalance());

        account3.deposit(5);

        System.out.printf("account4 balance is £%.2f%n", account3.getBalance());

        account3.withdraw(1789);

        System.out.printf("account4 balance is £%.2f%n", account3.getBalance());



    }

}
