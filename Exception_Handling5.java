// Default Constructor
// User define Exception
// Throw Keyword

import java.util.Scanner;

class InvalidAgeExceptions extends Throwable {
    void display() {
        System.out.println("Age is invalid");
    }
}

public class Exception_Handling5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age :: ");
        int age = s.nextInt();

        try {
            if (age < 1)
                throw new InvalidAgeExceptions();
            else
                System.out.println("Valid age");
        } catch (InvalidAgeExceptions a) {
            a.display();
        }
    }
}
