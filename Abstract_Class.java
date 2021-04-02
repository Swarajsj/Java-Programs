abstract class Calculator {
    abstract void add();

}

class StringCalc extends Calculator {
    void add() {
        String a = "Hello " + "World";
        System.out.println(a);
    }
}

class ArithmeticCalc extends Calculator {
    void add() {
        int b = 4, c = 10;
        int a = b + c;
        System.out.println(a);
    }
}

class Abstract_Classn {

    public static void main(String[] args) {
        ArithmeticCalc ac = new ArithmeticCalc();
        ac.add();

    }
}