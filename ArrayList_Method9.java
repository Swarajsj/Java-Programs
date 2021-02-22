//9. Object get(int index):

import java.util.ArrayList;

public class ArrayList_Method9 {

    public static void main(String args[]) {

        ArrayList<Integer> aList = new ArrayList<Integer>(5);

        // use add() method to add elements in the list

        aList.add(7);
        aList.add(11);
        aList.add(13);

        System.out.println("Array List Number = " + aList);

        // element at 2nd postion
        int value = aList.get(2);
        System.out.println("Element Retrieved at index 2 i.e. 3rd position = " + value);

    }
}