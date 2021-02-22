public class Break_Statement {

    public static void main(String args[]) {

        // Unlabled Break Statement

        for (int i = 0; i < 100; i++) {
            if (i == 10)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Loop completed");

        // Labeled Break Statement

        outer: for (int i = 0; i < 3; i++) {
            System.out.println("Outer " + i);
            inner: for (int j = 0; j < 3; j++) {
                System.out.println("Inner " + j);
                if (i == j + 1)
                    break outer;
                System.out.println("Bye");
            }
        }

    }

}
