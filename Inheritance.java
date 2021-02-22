class Calc {
    void add(int a, int b)// signature=name+parameters,,,,,
    {
        System.out.println("Parent Add " + (a));
    }

    void sub(int a, int b) {
        System.out.println("Sub " + (a - b));
    }
}

class ScienticCalc extends Calc {
    void add(int a, int b)// Method overriding, same signature
    {
        System.out.println("Child Add " + (a + b));
    }

    void mod(int a, int b) {
        System.out.println("Mod " + (a % b));
    }
}

public class Inheritance {// Access add method in Demo class, create object of

    public static void main(String args[]) {
        ScienticCalc s = new ScienticCalc();
        s.add(23, 45);
    }

}
