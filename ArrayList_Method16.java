//16. void trimToSize():

import java.util.ArrayList;

public class ArrayList_Method16 {

    public static void main(String args[]) {

        ArrayList<Integer> aList = new ArrayList<Integer>(10);

        // use add() method to add elements in the list

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);

        // Trimming the Array List

        aList.trimToSize();

        System.out.println("Printing an ArrayList after using trimToSize method " + aList);

    }
}