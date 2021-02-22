//10. int indexOf(Object o):

import java.util.ArrayList;

public class ArrayList_Method10 {

    public static void main(String args[]) {

        ArrayList<String> aList = new ArrayList<String>(5);

        // use add() method to add elements in the list

        aList.add("Learning");
        aList.add("JAVA");
        aList.add("ABHIANDROID");

        System.out.println("Array List String = " + aList);

        // using IndexOf Method
        int value1 = aList.indexOf("JAVA");
        System.out.println("Index Retrived of JAVA = " + value1);

        System.out.println("AT is not present so it will print index as -1");

        int value2 = aList.indexOf("AT");
        System.out.println("Index Retrived of AT = " + value2);
    }

}