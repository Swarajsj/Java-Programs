abstract class Base {
    abstract void fun();
}

class Derived extends Base {
    void fun() {
        System.out.println("Derived fun() called");
    }
}

class Abstract_class2 {
    public static void main(String args[]) {

        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}
