// Functional Interface

@FunctionalInterface
interface Display {
    int show();
}

class Anonymous_Class {
    public static void main(String[] args) {
        Display d = new Display() {
            public int show() {
                System.out.println("A");
                return 1;
            }
        };
        d.show();
    }
}
