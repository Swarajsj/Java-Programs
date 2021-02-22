//11. int lastIndexOf(Object o):

import java.util.ArrayList;

public class ArrayList_Method11 {

    public static void main(String args[]) {

        ArrayList<String> aList = new ArrayList<String>(5);

        // use add() method to add elements in the list

        aList.add("A");
        aList.add("B");
        aList.add("C");
        aList.add("D");
        aList.add("E");
        aList.add("F");
        aList.add("C");
        aList.add("D");

        System.out.println("ArrayList: " + aList);

        // Getting index of Last C in ArrayList

        int index1 = aList.lastIndexOf("C");

        System.out.println("index of Last C in ArrayList: " + index1);

        int index2 = aList.lastIndexOf("D");
        System.out.println("index of Last D in ArrayList: " + index2);

    }
}