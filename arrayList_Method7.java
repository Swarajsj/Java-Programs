//7. boolean contains(Object element):

import java.util.ArrayList;

public class arrayList_Method7 {

    public static void main(String args[]) {

        ArrayList<Integer> aList = new ArrayList<Integer>();

        // use add() method to add elements in the list

        aList.add(7);
        aList.add(2);
        aList.add(9);

        // Checking contains method

        boolean flag1 = aList.contains(2);
        if (flag1 == true) {
            System.out.println("aList contains element 2");
        } else {
            System.out.println("aList doesn't contains element 2");
        }

        boolean flag2 = aList.contains(5);

        if (flag2 == true) {
            System.out.println("aList contains element 5");
        } else {
            System.out.println("aList doesn't contains element 5");
        }

    }

}