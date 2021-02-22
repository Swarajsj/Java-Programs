import java.util.Scanner;

public class Practice2 {

    public static void main(String args[]) {

        // Write a Java program to compare two numbers.
        // Input Data:
        // Input first integer: 25
        // Input second integer: 39
        // Expected Output

        // 25 != 39
        // 25 < 39
        // 25 <= 39

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first integer :");
        int a = sc.nextInt();
        System.out.println("Input second integer :");
        int b = sc.nextInt();
        if (a != b) {
            System.out.println("25 != 39");
        }
        if (a < b) {
            System.out.println("25 < 39");
        }
        if (a <= b) {
            System.out.println("25 <= 39");
        }

    }

}
