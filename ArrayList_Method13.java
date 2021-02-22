//13. Object set(int index, Object element):

import java.util.ArrayList;

public class ArrayList_Method13 {

    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<Integer>();

        aList.add(4);
        aList.add(8);
        aList.add(12);
        aList.add(16);
        aList.add(20);
        aList.add(24);
        System.out.println("The ArrayList:" + aList);

        // Using set() Method
        aList.set(2, 333);
        System.out.println("The ArrayList after setting 333 value at index 2:" + aList);

    }
}