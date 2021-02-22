public class Loops {

    public static void main(String args[]) {

        // While Loop
        int n = 10;
        char a = 'G';
        while (n > 0) {
            System.out.print(a);
            n--;
            a++;
        }

        // For Loop

        int x = 5;
        for (n = 1; n <= 10; n++) {
            int p = x * n;
            System.out.println(x + "*" + n + "=" + p);
        }

        // Do While Loop

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }
}
