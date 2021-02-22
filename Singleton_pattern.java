class Abc {
    static Abc obj = new Abc();

    private Abc() {

    }

    public static Abc get() {
        return obj;
    }
}

class Singleton_pattern {
    public static void main(String[] args) {
        Abc a = Abc.get();
    }
}
