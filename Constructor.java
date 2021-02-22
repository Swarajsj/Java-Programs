class GrandParent {
    GrandParent()// Constructor
    {
        System.out.println("G P");
    }
}

class Parent extends GrandParent {
    Parent() // Constructor
    {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    Child()// Constructor
    {

        System.out.println("Child");
    }

    public static void main(String... rk) {
        Child obj = new Child();
    }
}