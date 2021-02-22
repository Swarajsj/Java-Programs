// Method Overloading 
class Area11 {
    void area(int a) {
        int area = a * a;
        System.out.println("area of square is:" + area);
    }

    void area(int a, int b) {
        int area = a * b;
        System.out.println("area of rectangle is:" + area);
    }
}

class Method_Overloading {
    public static void main(String arr[]) {
        Area11 ar = new Area11();
        ar.area(10);
        ar.area(10, 5);
    }
}
