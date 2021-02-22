//17. Boolean isEmpty()

import java.util.ArrayList;

public class ArrayList_Method17 {

    public static void main(String args[]) {

        ArrayList<String> aList = new ArrayList<String>(5);

        // use add() method to add elements in the list

        aList.add("A");
        aList.add("B");
        aList.add("C");

        // IsEmpty

        boolean flag1 = aList.isEmpty();

        if (flag1 == true) {
            System.out.println("ArrayList is Empty");
        }

        else {
            System.out.println("ArrayList is not Empty");
        }

        System.out.println("Using clear() method to empty ArrayList");
        aList.clear();

        // Using isEmpty() method
        boolean flag2 = aList.isEmpty();
        if (flag2 == true) {
            System.out.println("ArrayList is Empty");
        }

        else {
            System.out.println("ArrayList is not Empty");
        }
    }

}
