abstract class Calculator {
    abstract void add(int a, int b);
}

class Abstract_Method extends Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        Abstract_Method ab = new Abstract_Method();
        ab.add(20, 30);

    }
}
