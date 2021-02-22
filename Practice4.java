import java.util.Scanner;

public class Practice4 {

    public static void main(String args[]) {

        // Check whether a digit entered by a user is present in the number or not.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("Enter Digit : ");
        int d = sc.nextInt();

        int r, q;
        int count = 0;
        while (n > 0) {
            r = n % 10;
            if (r == d) {
                count++;
            }
            q = n / 10;
            n = q;
        }
        if (count > 0) {
            System.out.println("Digit is present ...... ");
        } else {
            System.out.println("Digit is not present ...... ");
        }

    }
}
