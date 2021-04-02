// Functional Interface

@FunctionalInterface
interface Displays {
    int show();
}

class Anonymous_Method {
    public static void main(String[] args) {
        Displays d = () -> { // Lambda Operator
            System.out.println("RAJ");
            return 1;
        };
        d.show();
    }
}