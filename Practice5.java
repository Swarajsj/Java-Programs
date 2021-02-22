public class Practice5 {

    public static void main(String[] rk) {
        label1: for (int i = 0; i < 5; i++) {// i=0
            label2: for (int j = 0; j < 5; j++) {// j==1
                System.out.print("* ");// *
                if (i == j)// 1==1
                    break label2;
            }
            System.out.println("");
        }
        System.out.println("End");
    }

}
