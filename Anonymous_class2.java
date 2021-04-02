interface Bike {
    void getBikeName();
}

class Anonymous_class2 {
    public static void main(String[] args) {
        Bike b = new Bike() {
            public void getBikeName() {
                System.out.println("Honda");
            }
        };

        b.getBikeName();
    }
}
