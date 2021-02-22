// Method Overriding

class Override {
    public void display() {
        System.out.println("Hello...This is superclass display");
    }
}

class Override1 extends Override {
    public void display() {
        System.out.println("Hi...This is overriden method in subclass");
    }
}

class Method_Overriding {
    public static void main(String arr[]) {
        Override o = new Override();
        o.display();
        Override1 o1 = new Override1();
        o1.display();
    }
}