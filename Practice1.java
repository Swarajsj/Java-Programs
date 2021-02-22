import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double b;
        int isum;
        double dsum;
        System.out.println("Enter integer number");
        a = sc.nextInt();// 3
        System.out.println("Enter double number");
        b = sc.nextDouble();// 2.5
        // integer addition
        isum = a + (int) b;// int=int+double 3+2//type casting
        // double addition
        dsum = a + b;// double=int+double 3.0+2.5//type conversion

        System.out.println("Integer sum is " + isum);
        System.out.println("Double sum is " + dsum);
    }
}
