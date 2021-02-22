class GParent {
    public void demo() {
        System.out.println("Gparent");
    }
}

class Child extends GParent {
    public void demo() {
        System.out.println("Overridden Child");
    }

    public void test() {
        System.out.println("Test");
    }
}

class Dynamic_Binding {
    public static void main(String rk[]) {
        GParent p = new Child();
        p.demo(); // At compile time it will check for demo() in Parent but it will execute demo()
                  // of child.
        p.test(); // Compile time error as test() is not available in Parent.
    }
}
