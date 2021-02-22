//12. Object remove(int index):

import java.util.ArrayList;

public class ArrayList_Method12 {

    public static void main(String args[]) {

        ArrayList<String> aList = new ArrayList<String>(5);

        // use add() method to add elements in the list

        aList.add("LEARNING");
        aList.add("JAVA");
        aList.add("ABHIANDROID");
        System.out.println("String ArrayList = " + aList);

        // using Remove method

        aList.remove(2);
        System.out.println("ArrayList After Removing Element at index 2= " + aList);

    }
}