// Finally Keyword

import java.util.Scanner;

class Exception_Handling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        try {
            int a = sc.nextInt();
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Thank for using our code :)");
        }
        System.out.println("Bye !!");
    }
}
