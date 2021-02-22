//3. boolean addAll(Collection c):

import java.util.ArrayList;

public class ArrayList_Method3 {

    public static void main(String args[]) {

        // First ArrayList Created
        ArrayList<Integer> aList1 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list

        aList1.add(3);
        aList1.add(5);
        aList1.add(7);

        // let us print all the elements available in aList1
        System.out.println("Printing all elements of  aList1= " + aList1);

        // Second Arraylist Created
        ArrayList<Integer> aList2 = new ArrayList<Integer>(5);

        aList2.add(9);
        aList2.add(8);
        aList2.add(11);
        aList2.add(12);

        // let us print all the elements available in aList2
        System.out.println("Printing all elements of aList2= " + aList2);

        // adding alist2 collections to alist1 using addAll method

        aList1.addAll(aList2);
        System.out.println("Printing all the elements of aList1 after using addAll method= " + aList1);

    }
}
