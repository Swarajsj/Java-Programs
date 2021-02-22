import java.util.Scanner;

public class If_else {

    public static void main(String args[]) {
        int price = 0;

        // movie tickets
        // (1-5)150 each
        // (6-10) 5 tickets for 150 , restfor 100 each
        // 10+ 100 each

        System.out.println("Please enter number of tickets");
        Scanner sc = new Scanner(System.in); // Scanner class used to take input from user
        int num = sc.nextInt();
        if (num >= 1 && num <= 5) {
            price = num * 150;
        } else if (num > 5 && num <= 10) {
            price = (5 * 150) + (num - 5) * 100;
        } else if (num > 10) {
            price = num * 100;
        }

        System.out.println("Price is" + price);
    }
}
