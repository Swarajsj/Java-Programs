// Try Catch 

import java.util.Scanner;

class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("You are trying to divide by zero");
        }
        System.out.println("Thanks");
    }
}
