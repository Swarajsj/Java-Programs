// 4. boolean addAll(int index, Collection c):

import java.util.ArrayList;

public class ArrayList_Method4 {

    public static void main(String args[]) {

        //ArrayList Created
        ArrayList<Integer> aList1 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        aList1.add(6);
        aList1.add(4);
        aList1.add(9);

        // let us print all the elements available in aList1
        System.out.println("Printing all elements of  aList1= "+ aList1);

        ArrayList<Integer> aList2 = new ArrayList<Integer>(5);

        aList2.add(11);
        aList2.add(15);
        aList2.add(16);
        aList2.add(19);

        System.out.println("Printing all elements of aList2= "+ aList2);

        // using addAll method to add collections at specific index
        aList1.addAll(2,aList2);
        System.out.println("Printing all the elements of aList1 after using addAll method= "+ aList1);
    }
}