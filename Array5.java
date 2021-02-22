import java.util.Scanner;

class Array5 {
    public static void main(String[] args) {
        double[] marks = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in 5 subjects");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextDouble();
        }
        System.out.println("Updated marks ");
        for (int i = 0; i < 5; i++) {
            marks[i] = Math.ceil(marks[i]);
            System.out.println(marks[i]);
        }
    }
}
