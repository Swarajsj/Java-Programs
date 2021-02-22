import java.util.ArrayList;
import java.util.Scanner;
//import java.util.*; //for acessing all the packages from util

public class Array_List {

    public static void main(String[] args) {
        ArrayList colors = new ArrayList(3);
        // ArrayList<String> colors=new ArrayList<String>();
        System.out.println("Initial size" + colors.size());
        colors.add(1);
        colors.add("Yellow");
        colors.add(6);
        colors.add("Red");
        System.out.println("After Elements added " + colors.size());
        colors.remove(0);
        System.out.println("After removing 1 elements" + colors.size());
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}
