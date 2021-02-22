//15. Object[] toArray():

import java.util.ArrayList;

public class ArrayList_Method15 {

    public static void main(String args[]) {

        ArrayList<Integer> aList = new ArrayList<Integer>();

        // use add() method to add elements in the list
        aList.add(2);
        aList.add(4);
        aList.add(6);
        aList.add(8);

        System.out.println("ArrayList= " + aList);

        // using toArray method
        Object[] object = aList.toArray();

        // Using For Loop For Printing Value in Array

        for (int i = 0; i < object.length; i++) {
            System.out.println("Value at index " + i + " of Array coverted from ArrayList= " + object[i]);
        }

    }
}