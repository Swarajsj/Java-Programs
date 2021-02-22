import java.util.Scanner;

public class If_else2 {

    public static void main(String args[]) {

        int price = 0;
        // Discount !!
        // bill amount > 1000 30 %
        // bill amount > 2000 50 %
        // display final bill after discount

        System.out.println("Please Enter Amount");
        Scanner sc = new Scanner(System.in); // Scanner class used to take input from user
        int amount = sc.nextInt();

        if (amount > 1000) {
            System.out.println("Final price after discount : ");
            System.out.println(price - (30 / 100) * price);
        } else if (amount > 2000) {
            System.out.println("Final price after discount  : ");
            System.out.println(price - (50 / 100) * price);
        }
    }
}
