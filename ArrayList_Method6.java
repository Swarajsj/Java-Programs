//6. Object clone():

import java.util.ArrayList;

public class ArrayList_Method6 {
    public static void main(String args[]) {

        ArrayList<String> aList1 = new ArrayList<String>();

        // use add() method to add elements in the list

        aList1.add("A");
        aList1.add("B");
        aList1.add("C");
        aList1.add("D");

        // Using clone() method to copy aList1 into a new aListCopy Arraylist

        ArrayList<String> aListCopy = (ArrayList<String>) aList1.clone();

        System.out.println("aListCopy elements copied from aList1= " + aListCopy);

    }
}