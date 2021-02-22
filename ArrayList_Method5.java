//5. void clear():

import java.util.ArrayList;

public class ArrayList_Method5 {

    public static void main(String args[]) {

        ArrayList<Integer> aList = new ArrayList<Integer>();

        // use add() method to add elements in the list
        aList.add(1);
        aList.add(2);
        aList.add(3);

        // let us print all the elements available in aList

        System.out.println("Printing aList items before using clear method= " + aList);
        System.out.println("Printing size of aList1= " + aList.size());

        // using clear method

        aList.clear();
        System.out.println("Printing aList element after using clear method= " + aList);
        System.out.println("size of aList1 after clear() method= " + aList.size());

    }
}