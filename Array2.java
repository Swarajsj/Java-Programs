import java.util.Scanner;

public class Array2 {

    void calPercentage(int b[], int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += b[i];
        }
        System.out.println(sum / num);
    }

    public static void main(String[] args) {
        int a[];
        a = new int[20];
        // dynamic memory allocation
        System.out.println("How many subjects?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter marks in " + n + " subjects");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Array2 d = new Array2();
        d.calPercentage(a, n);
    }
}
