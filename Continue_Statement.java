public class Continue_Statement {

    public static void main(String aargs[]) {

        // Unlabled Continue Statement

        String str = "she saw a ship in the sea";
        int size = str.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != 's') {
                continue;
            }

            count++;
        }
        System.out.println("Number of s in " + str + " = " + count);

        // Labeled Continue Statement

        outer: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > i) {
                    System.out.println("Hii");
                    continue outer;
                }

                System.out.print(" " + (i * j));
            }
        }

        System.out.println("Done");

    }
}
