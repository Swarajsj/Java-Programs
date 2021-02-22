//8. void ensureCapacity(int minCapacity):

import java.util.ArrayList;

public class ArrayList_Method8 {

    public static void main(String args[]) {

        ArrayList<Integer> aList = new ArrayList<Integer>(3);

        // use add() method to add elements in the list

        aList.add(5);
        aList.add(2);
        aList.add(9);

        // this method will increase the capacity to 20

        aList.ensureCapacity(20);

        System.out.println("Array List Number = " + aList);

    }
}