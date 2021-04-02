// Nested Catch 
// getMessage 

import java.util.Scanner;

class Exception_Handling3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        try {
            int a = sc.nextInt();
            System.out.println(a);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        } finally {
            System.out.println("Thanks for using our code");
        }
        System.out.println("Bye");

    }
}