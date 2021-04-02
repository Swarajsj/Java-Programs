// Throws Keyword
// Useer define exception

import java.util.Scanner;
import java.io.*;

class MyException extends Exception {
    void display() {
        System.out.println("You selected invalid option");
    }
}

class Student1 {
    void review() throws MyException {
        System.out.println("Press 1 if you like Java Language or press 0 if you find it difficult");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if (r != 0 && r != 1)
            throw new MyException();
        else
            System.out.println("Thanks for voting");
    }
}

public class Exception_Handling7 {

    public static void main(String[] args) {
        Student1 s = new Student1();
        try {
            s.review();
        } catch (MyException me) {
            me.display();
        }
    }
}