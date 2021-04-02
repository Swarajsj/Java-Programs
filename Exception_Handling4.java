// Parameterize Constructor
// User define Exception 
// Throw keyword (Manually done)

import java.util.Scanner;

class InvalidAgeException extends Throwable {
    String s = null;

    InvalidAgeException(String msg) {
        s = msg;
    }

    void display() {
        System.out.println(s);
    }
}

public class Exception_Handling4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age :: ");
        int age = s.nextInt();

        try {
            if (age < 1)
                throw new InvalidAgeException("Invalid age");
            else
                System.out.println("Valid age");
        } catch (InvalidAgeException a) {
            a.display();
        }
    }
}