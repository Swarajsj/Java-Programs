import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        int a[];
        a = new int[20];// dynamic memory allocation

        // int b[]={12,23,34,45};//static memory allocation

        System.out.println("Enter 10 numbers");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(a[i]);
        }
    }

}
