//18. Boolean remove(Object o):

import java.util.ArrayList;

public class ArrayList_Method18 {

    public static void main(String args[]) {

        ArrayList<String> aList = new ArrayList<String>(5);

        // use add() method to add elements in the list

        aList.add("A");
        aList.add("B");
        aList.add("C");
        aList.add("D");
        aList.add("E");
        aList.add("B");
        aList.add("C");

        System.out.println("Elements in Arraylist= " + aList);

        // using Remove method

        boolean flag = aList.remove("B");

        System.out.println("ArrayList After Removing  Element “B”= " + aList);

    }
}
