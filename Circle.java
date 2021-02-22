class Circle {

    // Here, in the instance variable the value cannot be initialized

    int length; // Instance Variable
    int breadth;
    int area;

    public static void main(String[] args) {
        // non static member cannot be acessed inside methode without objecct creation
        // Here, in the local variable the value must need to be initialized

        Circle obj = new Circle(); // Object of a class
        obj.length = 10; // Local variable
        obj.breadth = 20;
        obj.area = obj.length * obj.breadth;
        System.out.println("Area is :" + obj.area);

        Circle obj2 = new Circle(); // Object of a class
        obj2.length = 30; // Local variable
        obj2.breadth = 40;
        obj2.area = obj2.length * obj2.breadth;
        System.out.println("Area is :" + obj2.area);

    }
}