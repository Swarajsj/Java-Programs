import java.util.Scanner;

public class Array3 {

    int[] convert(double b[], int num) {
        int c[] = new int[num];
        for (int i = 0; i < c.length; i++) {
            c[i] = (int) b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        // double type array to int type array, use at least 1 user defined method
        double a[];
        a = new double[20];// dynamic memory allocation

        System.out.println("How many double numbers?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter " + n + " double numbers");
        for (int i = 0; i < n; i++) // for(double x:a)
        {
            a[i] = sc.nextDouble();
            // x = sc.nextDouble();
        }
        Array3 d = new Array3();
        int f[] = d.convert(a, n);
        System.out.println("Converted Array is as follows: ");
        for (int i = 0; i < n; i++) // for(int i:f)
        {
            System.out.print(f[i] + " ");
            // System.out.print(i + " ");
        }
    }
}
